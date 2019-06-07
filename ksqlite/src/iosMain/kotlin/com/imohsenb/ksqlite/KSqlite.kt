package com.imohsenb.ksqlite

import kotlinx.cinterop.*
import sqlite3.*

var db: CValuesRef<sqlite3>? = null

actual fun version(): String {
    return "SQLite iOS v${sqlite3_version.toKString()}"
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
    val ppStmt = null
    val pzTail = null
    return if (sqlite3_prepare_v2(db, sql, -1, ppStmt, pzTail) == SQLITE_OK) {
        sqlite3_step(ppStmt) == SQLITE_DONE
    } else {
        false
    }
}