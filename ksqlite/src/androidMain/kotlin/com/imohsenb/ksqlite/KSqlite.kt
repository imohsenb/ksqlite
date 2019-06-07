package com.imohsenb.ksqlite

import android.database.sqlite.SQLiteDatabase

lateinit var db: SQLiteDatabase

actual fun version(): String {
    return "android"
}

actual fun openOrCreateDatabase(name: String): Boolean {
    db = SQLiteDatabase.openOrCreateDatabase(name, null)
    return db.isOpen
}

actual fun close() {
    db.close()
}

actual fun execSQL(sql: String): Boolean {
    return try {
        db.execSQL(sql)
        true
    } catch (e: Exception) {
        false
    }
}