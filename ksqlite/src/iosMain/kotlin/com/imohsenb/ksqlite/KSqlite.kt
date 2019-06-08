package com.imohsenb.ksqlite

import kotlinx.cinterop.*
import sqlite3.*

var db: CValuesRef<sqlite3>? = null

actual fun version(): String {
    return "V2-SQLite iOS v${sqlite3_version.toKString()}"
}

actual fun openOrCreateDatabase(name: String): Boolean {
    memScoped{
        var ppDb : CPointerVar<sqlite3>  = allocPointerTo<sqlite3>()
        var flags = SQLITE_OPEN_READWRITE or SQLITE_OPEN_CREATE or SQLITE_OPEN_URI

        var status = sqlite3_open_v2(name, ppDb.ptr, flags, null)
        if(status == SQLITE_OK) {
            ppDb.let {
                db = it.value
                return true
            }
        } else {
            println("Error: unable to open database ");
            println("`${sqlite3_errmsg(db)?.toKString()}`")
            println("${name}")
            println("${flags}")
            println("$status")
        }
    }
    return false
}

actual fun close() {
    sqlite3_close(db)
}

actual fun execSQL(sql: String): Boolean {
    memScoped {
        val ppStmt = allocPointerTo<sqlite3_stmt>()
        val pzTail = null
        var result = false
        if (sqlite3_prepare_v2(db, sql, -1, ppStmt.ptr, pzTail) == SQLITE_OK) {
            if(sqlite3_step(ppStmt.value) == SQLITE_DONE){
                result = true
                println("statement executed successfully")
            } else {
                println("statement failed!")
            }
        } else {
            println("statement could not be prepared!")
        }

        var fres = sqlite3_finalize(ppStmt.value)
        println("finalize $fres")

        return result
    }
}