package com.imohsenb.ksqlite

import kotlinx.cinterop.*
import sqlite3.*

var db: CValuesRef<sqlite3>? = null

actual fun version(): String {
    return "V3-SQLite iOS v${sqlite3_version.toKString()}"
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
            } else {
                println("statement failed!")
                println("`${sqlite3_errmsg(db)?.toKString()}`")
            }
        } else {
            println("statement could not be prepared!")
            println("`${sqlite3_errmsg(db)?.toKString()}`")
        }

        sqlite3_finalize(ppStmt.value)
        return result
    }
}

actual fun execSQL(sql: String, args: MutableCollection<Any?>): Boolean {

    memScoped {
        val ppStmt = allocPointerTo<sqlite3_stmt>()
        val pzTail = null
        var result = false
        if (sqlite3_prepare_v2(db, sql, -1, ppStmt.ptr, pzTail) == SQLITE_OK) {

            var i = 1
            args.forEach {
                when (it) {
                    is String -> {
                        sqlite3_bind_text(ppStmt.value, i, it, -1, SQLITE_TRANSIENT)
                    }
                    is Short -> {
                        sqlite3_bind_int(ppStmt.value, i, it.toInt())
                    }
                    is Int -> {
                        sqlite3_bind_int(ppStmt.value, i, it)
                    }
                    is Long -> {
                        sqlite3_bind_double(ppStmt.value, i, it.toDouble())
                    }
                    is Double -> {
                        sqlite3_bind_double(ppStmt.value, i, it)
                    }
                    else -> {
                        println("$it has unknown type")
                        sqlite3_bind_null(ppStmt.value, i)
                    }
                }
                i++
            }

            if(sqlite3_step(ppStmt.value) == SQLITE_DONE){
                result = true
            } else {
                println("statement failed! \r\n $sql")
                println("`${sqlite3_errmsg(db)?.toKString()}`")
            }
        } else {
            println("statement could not be prepared!")
            println("`${sqlite3_errmsg(db)?.toKString()}`")
        }

        sqlite3_finalize(ppStmt.value)
        return result
    }
}