package com.imohsenb.ksqlite

import kotlinx.cinterop.*
import sqlite3.*

lateinit var db : CValuesRef<CPointerVar<cnames.structs.sqlite3>>

actual fun openCreateDatabase(name: String) {
    val url : String? = "file:data.db"
    sqlite3_open(url, ppDb = db)
}

actual fun version(): String {
    return "ios $sqlite3_version"
}