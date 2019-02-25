package com.imohsenb.ksqlite

import kotlinx.cinterop.*
import sqlite3.*

var db: CValuesRef<sqlite3>? = null

actual fun version(): String {
    return "ios ${sqlite3_version.rawValue}"
}

actual fun openOrCreateDatabase(name: String): Boolean {

    memScoped {
        lateinit var ppDb : CValuesRef<CPointerVar<cnames.structs.sqlite3>>
        if(sqlite3_open("file:data.db", ppDb) == SQLITE_OK) {
            ppDb.let {
                db = it.getPointer(memScope)[0]
                return true
            }
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