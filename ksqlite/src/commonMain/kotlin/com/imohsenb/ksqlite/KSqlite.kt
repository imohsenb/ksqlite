package com.imohsenb.ksqlite


expect fun version(): String

expect fun openOrCreateDatabase(name: String): Boolean

expect fun close()

expect fun execSQL(sql: String): Boolean

expect fun execSQL(sql: String, args: MutableCollection<Any?>): Boolean


//sqlite3_free()
//sqlite3_exec
//sqlite3_finalize
//sqlite3_errmsg
//sqlite3_step
//sqlite3_prepare_v2
//
//sqlite3_bind_parameter_count
//sqlite3_bind_parameter_index
//sqlite3_bind_parameter_name
//sqlite3_bind_double
//sqlite3_bind_int64
//sqlite3_bind_null
//sqlite3_bind_text64
//sqlite3_bind_blob64
//sqlite3_clear_bindings