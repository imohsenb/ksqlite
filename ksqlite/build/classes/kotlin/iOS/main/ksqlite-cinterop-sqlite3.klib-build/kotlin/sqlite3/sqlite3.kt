@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package sqlite3

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import cnames.structs.Mem
import cnames.structs.sqlite3
import cnames.structs.sqlite3_backup
import cnames.structs.sqlite3_blob
import cnames.structs.sqlite3_context
import cnames.structs.sqlite3_mutex
import cnames.structs.sqlite3_pcache
import cnames.structs.sqlite3_stmt
import platform.posix.va_list

// NOTE THIS FILE IS AUTO-GENERATED

fun sqlite3_libversion(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge0())
}

fun sqlite3_sourceid(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge1())
}

fun sqlite3_libversion_number(): Int {
    return kniBridge2()
}

fun sqlite3_compileoption_used(zOptName: String?): Int {
    memScoped {
        return kniBridge3(zOptName?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_compileoption_get(N: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge4(N))
}

fun sqlite3_threadsafe(): Int {
    return kniBridge5()
}

fun sqlite3_close(arg0: CValuesRef<sqlite3>?): Int {
    memScoped {
        return kniBridge6(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_exec(arg0: CValuesRef<sqlite3>?, sql: String?, callback: CPointer<CFunction<(COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?, arg3: CValuesRef<*>?, errmsg: CValuesRef<CPointerVar<ByteVar>>?): Int {
    memScoped {
        return kniBridge7(arg0?.getPointer(memScope).rawValue, sql?.cstr?.getPointer(memScope).rawValue, callback.rawValue, arg3?.getPointer(memScope).rawValue, errmsg?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_initialize(): Int {
    return kniBridge8()
}

fun sqlite3_shutdown(): Int {
    return kniBridge9()
}

fun sqlite3_os_init(): Int {
    return kniBridge10()
}

fun sqlite3_os_end(): Int {
    return kniBridge11()
}

fun sqlite3_config(arg0: Int, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge12(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0), variadicArguments, memScope)
        return kniResult.value
    }
}

fun sqlite3_db_config(arg0: CValuesRef<sqlite3>?, op: Int, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge13(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0?.getPointer(memScope), op), variadicArguments, memScope)
        return kniResult.value
    }
}

fun sqlite3_extended_result_codes(arg0: CValuesRef<sqlite3>?, onoff: Int): Int {
    memScoped {
        return kniBridge14(arg0?.getPointer(memScope).rawValue, onoff)
    }
}

fun sqlite3_last_insert_rowid(arg0: CValuesRef<sqlite3>?): sqlite3_int64 {
    memScoped {
        return kniBridge15(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_changes(arg0: CValuesRef<sqlite3>?): Int {
    memScoped {
        return kniBridge16(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_total_changes(arg0: CValuesRef<sqlite3>?): Int {
    memScoped {
        return kniBridge17(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_interrupt(arg0: CValuesRef<sqlite3>?): Unit {
    memScoped {
        return kniBridge18(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_complete(sql: String?): Int {
    memScoped {
        return kniBridge19(sql?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_complete16(sql: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge20(sql?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_busy_handler(arg0: CValuesRef<sqlite3>?, arg1: CPointer<CFunction<(COpaquePointer?, Int) -> Int>>?, arg2: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge21(arg0?.getPointer(memScope).rawValue, arg1.rawValue, arg2?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_busy_timeout(arg0: CValuesRef<sqlite3>?, ms: Int): Int {
    memScoped {
        return kniBridge22(arg0?.getPointer(memScope).rawValue, ms)
    }
}

fun sqlite3_get_table(db: CValuesRef<sqlite3>?, zSql: String?, pazResult: CValuesRef<CPointerVar<CPointerVar<ByteVar>>>?, pnRow: CValuesRef<IntVar>?, pnColumn: CValuesRef<IntVar>?, pzErrmsg: CValuesRef<CPointerVar<ByteVar>>?): Int {
    memScoped {
        return kniBridge23(db?.getPointer(memScope).rawValue, zSql?.cstr?.getPointer(memScope).rawValue, pazResult?.getPointer(memScope).rawValue, pnRow?.getPointer(memScope).rawValue, pnColumn?.getPointer(memScope).rawValue, pzErrmsg?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_free_table(result: CValuesRef<CPointerVar<ByteVar>>?): Unit {
    memScoped {
        return kniBridge24(result?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_mprintf(arg0: String?, vararg variadicArguments: Any?): CPointer<ByteVar>? {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<CPointerVar<ByteVar>>(typeOf<CPointerVar<ByteVar>>())
        callWithVarargs(kniBridge25(), kniResult.rawPtr, FFI_TYPE_KIND_POINTER, arrayOf(arg0?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun sqlite3_vmprintf(arg0: String?, arg1: va_list?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge26(arg0?.cstr?.getPointer(memScope).rawValue, arg1.rawValue))
    }
}

fun sqlite3_snprintf(arg0: Int, arg1: CValuesRef<ByteVar>?, arg2: String?, vararg variadicArguments: Any?): CPointer<ByteVar>? {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<CPointerVar<ByteVar>>(typeOf<CPointerVar<ByteVar>>())
        callWithVarargs(kniBridge27(), kniResult.rawPtr, FFI_TYPE_KIND_POINTER, arrayOf(arg0, arg1?.getPointer(memScope), arg2?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun sqlite3_vsnprintf(arg0: Int, arg1: CValuesRef<ByteVar>?, arg2: String?, arg3: va_list?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge28(arg0, arg1?.getPointer(memScope).rawValue, arg2?.cstr?.getPointer(memScope).rawValue, arg3.rawValue))
    }
}

fun sqlite3_malloc(arg0: Int): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge29(arg0))
}

fun sqlite3_realloc(arg0: CValuesRef<*>?, arg1: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge30(arg0?.getPointer(memScope).rawValue, arg1))
    }
}

fun sqlite3_free(arg0: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge31(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_memory_used(): sqlite3_int64 {
    return kniBridge32()
}

fun sqlite3_memory_highwater(resetFlag: Int): sqlite3_int64 {
    return kniBridge33(resetFlag)
}

fun sqlite3_randomness(N: Int, P: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge34(N, P?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_set_authorizer(arg0: CValuesRef<sqlite3>?, xAuth: CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>?, pUserData: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge35(arg0?.getPointer(memScope).rawValue, xAuth.rawValue, pUserData?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_trace(arg0: CValuesRef<sqlite3>?, xTrace: CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?) -> Unit>>?, arg2: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge36(arg0?.getPointer(memScope).rawValue, xTrace.rawValue, arg2?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_profile(arg0: CValuesRef<sqlite3>?, xProfile: CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, sqlite3_uint64) -> Unit>>?, arg2: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge37(arg0?.getPointer(memScope).rawValue, xProfile.rawValue, arg2?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_progress_handler(arg0: CValuesRef<sqlite3>?, arg1: Int, arg2: CPointer<CFunction<(COpaquePointer?) -> Int>>?, arg3: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge38(arg0?.getPointer(memScope).rawValue, arg1, arg2.rawValue, arg3?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_open(filename: String?, ppDb: CValuesRef<CPointerVar<sqlite3>>?): Int {
    memScoped {
        return kniBridge39(filename?.cstr?.getPointer(memScope).rawValue, ppDb?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_open16(filename: CValuesRef<*>?, ppDb: CValuesRef<CPointerVar<sqlite3>>?): Int {
    memScoped {
        return kniBridge40(filename?.getPointer(memScope).rawValue, ppDb?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_open_v2(filename: String?, ppDb: CValuesRef<CPointerVar<sqlite3>>?, flags: Int, zVfs: String?): Int {
    memScoped {
        return kniBridge41(filename?.cstr?.getPointer(memScope).rawValue, ppDb?.getPointer(memScope).rawValue, flags, zVfs?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_uri_parameter(zFilename: String?, zParam: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge42(zFilename?.cstr?.getPointer(memScope).rawValue, zParam?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_errcode(db: CValuesRef<sqlite3>?): Int {
    memScoped {
        return kniBridge43(db?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_extended_errcode(db: CValuesRef<sqlite3>?): Int {
    memScoped {
        return kniBridge44(db?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_errmsg(arg0: CValuesRef<sqlite3>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge45(arg0?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_errmsg16(arg0: CValuesRef<sqlite3>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge46(arg0?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_limit(arg0: CValuesRef<sqlite3>?, id: Int, newVal: Int): Int {
    memScoped {
        return kniBridge47(arg0?.getPointer(memScope).rawValue, id, newVal)
    }
}

fun sqlite3_prepare(db: CValuesRef<sqlite3>?, zSql: String?, nByte: Int, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<CPointerVar<ByteVar>>?): Int {
    memScoped {
        return kniBridge48(db?.getPointer(memScope).rawValue, zSql?.cstr?.getPointer(memScope).rawValue, nByte, ppStmt?.getPointer(memScope).rawValue, pzTail?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_prepare_v2(db: CValuesRef<sqlite3>?, zSql: String?, nByte: Int, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<CPointerVar<ByteVar>>?): Int {
    memScoped {
        return kniBridge49(db?.getPointer(memScope).rawValue, zSql?.cstr?.getPointer(memScope).rawValue, nByte, ppStmt?.getPointer(memScope).rawValue, pzTail?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_prepare16(db: CValuesRef<sqlite3>?, zSql: CValuesRef<*>?, nByte: Int, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<COpaquePointerVar>?): Int {
    memScoped {
        return kniBridge50(db?.getPointer(memScope).rawValue, zSql?.getPointer(memScope).rawValue, nByte, ppStmt?.getPointer(memScope).rawValue, pzTail?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_prepare16_v2(db: CValuesRef<sqlite3>?, zSql: CValuesRef<*>?, nByte: Int, ppStmt: CValuesRef<CPointerVar<sqlite3_stmt>>?, pzTail: CValuesRef<COpaquePointerVar>?): Int {
    memScoped {
        return kniBridge51(db?.getPointer(memScope).rawValue, zSql?.getPointer(memScope).rawValue, nByte, ppStmt?.getPointer(memScope).rawValue, pzTail?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_sql(pStmt: CValuesRef<sqlite3_stmt>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge52(pStmt?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_stmt_readonly(pStmt: CValuesRef<sqlite3_stmt>?): Int {
    memScoped {
        return kniBridge53(pStmt?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_bind_blob(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: CValuesRef<*>?, n: Int, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int {
    memScoped {
        return kniBridge54(arg0?.getPointer(memScope).rawValue, arg1, arg2?.getPointer(memScope).rawValue, n, arg4.rawValue)
    }
}

fun sqlite3_bind_double(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: Double): Int {
    memScoped {
        return kniBridge55(arg0?.getPointer(memScope).rawValue, arg1, arg2)
    }
}

fun sqlite3_bind_int(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: Int): Int {
    memScoped {
        return kniBridge56(arg0?.getPointer(memScope).rawValue, arg1, arg2)
    }
}

fun sqlite3_bind_int64(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: sqlite3_int64): Int {
    memScoped {
        return kniBridge57(arg0?.getPointer(memScope).rawValue, arg1, arg2)
    }
}

fun sqlite3_bind_null(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): Int {
    memScoped {
        return kniBridge58(arg0?.getPointer(memScope).rawValue, arg1)
    }
}

fun sqlite3_bind_text(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: String?, n: Int, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int {
    memScoped {
        return kniBridge59(arg0?.getPointer(memScope).rawValue, arg1, arg2?.cstr?.getPointer(memScope).rawValue, n, arg4.rawValue)
    }
}

fun sqlite3_bind_text16(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: CValuesRef<*>?, arg3: Int, arg4: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int {
    memScoped {
        return kniBridge60(arg0?.getPointer(memScope).rawValue, arg1, arg2?.getPointer(memScope).rawValue, arg3, arg4.rawValue)
    }
}

fun sqlite3_bind_value(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, arg2: CValuesRef<sqlite3_value>?): Int {
    memScoped {
        return kniBridge61(arg0?.getPointer(memScope).rawValue, arg1, arg2?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_bind_zeroblob(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int, n: Int): Int {
    memScoped {
        return kniBridge62(arg0?.getPointer(memScope).rawValue, arg1, n)
    }
}

fun sqlite3_bind_parameter_count(arg0: CValuesRef<sqlite3_stmt>?): Int {
    memScoped {
        return kniBridge63(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_bind_parameter_name(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge64(arg0?.getPointer(memScope).rawValue, arg1))
    }
}

fun sqlite3_bind_parameter_index(arg0: CValuesRef<sqlite3_stmt>?, zName: String?): Int {
    memScoped {
        return kniBridge65(arg0?.getPointer(memScope).rawValue, zName?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_clear_bindings(arg0: CValuesRef<sqlite3_stmt>?): Int {
    memScoped {
        return kniBridge66(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_column_count(pStmt: CValuesRef<sqlite3_stmt>?): Int {
    memScoped {
        return kniBridge67(pStmt?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_column_name(arg0: CValuesRef<sqlite3_stmt>?, N: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge68(arg0?.getPointer(memScope).rawValue, N))
    }
}

fun sqlite3_column_name16(arg0: CValuesRef<sqlite3_stmt>?, N: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge69(arg0?.getPointer(memScope).rawValue, N))
    }
}

fun sqlite3_column_database_name(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge70(arg0?.getPointer(memScope).rawValue, arg1))
    }
}

fun sqlite3_column_database_name16(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge71(arg0?.getPointer(memScope).rawValue, arg1))
    }
}

fun sqlite3_column_table_name(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge72(arg0?.getPointer(memScope).rawValue, arg1))
    }
}

fun sqlite3_column_table_name16(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge73(arg0?.getPointer(memScope).rawValue, arg1))
    }
}

fun sqlite3_column_origin_name(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge74(arg0?.getPointer(memScope).rawValue, arg1))
    }
}

fun sqlite3_column_origin_name16(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge75(arg0?.getPointer(memScope).rawValue, arg1))
    }
}

fun sqlite3_column_decltype(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge76(arg0?.getPointer(memScope).rawValue, arg1))
    }
}

fun sqlite3_column_decltype16(arg0: CValuesRef<sqlite3_stmt>?, arg1: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge77(arg0?.getPointer(memScope).rawValue, arg1))
    }
}

fun sqlite3_step(arg0: CValuesRef<sqlite3_stmt>?): Int {
    memScoped {
        return kniBridge78(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_data_count(pStmt: CValuesRef<sqlite3_stmt>?): Int {
    memScoped {
        return kniBridge79(pStmt?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_column_blob(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge80(arg0?.getPointer(memScope).rawValue, iCol))
    }
}

fun sqlite3_column_bytes(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): Int {
    memScoped {
        return kniBridge81(arg0?.getPointer(memScope).rawValue, iCol)
    }
}

fun sqlite3_column_bytes16(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): Int {
    memScoped {
        return kniBridge82(arg0?.getPointer(memScope).rawValue, iCol)
    }
}

fun sqlite3_column_double(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): Double {
    memScoped {
        return kniBridge83(arg0?.getPointer(memScope).rawValue, iCol)
    }
}

fun sqlite3_column_int(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): Int {
    memScoped {
        return kniBridge84(arg0?.getPointer(memScope).rawValue, iCol)
    }
}

fun sqlite3_column_int64(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): sqlite3_int64 {
    memScoped {
        return kniBridge85(arg0?.getPointer(memScope).rawValue, iCol)
    }
}

fun sqlite3_column_text(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge86(arg0?.getPointer(memScope).rawValue, iCol))
    }
}

fun sqlite3_column_text16(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge87(arg0?.getPointer(memScope).rawValue, iCol))
    }
}

fun sqlite3_column_type(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): Int {
    memScoped {
        return kniBridge88(arg0?.getPointer(memScope).rawValue, iCol)
    }
}

fun sqlite3_column_value(arg0: CValuesRef<sqlite3_stmt>?, iCol: Int): CPointer<sqlite3_value>? {
    memScoped {
        return interpretCPointer<sqlite3_value>(kniBridge89(arg0?.getPointer(memScope).rawValue, iCol))
    }
}

fun sqlite3_finalize(pStmt: CValuesRef<sqlite3_stmt>?): Int {
    memScoped {
        return kniBridge90(pStmt?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_reset(pStmt: CValuesRef<sqlite3_stmt>?): Int {
    memScoped {
        return kniBridge91(pStmt?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_create_function(db: CValuesRef<sqlite3>?, zFunctionName: String?, nArg: Int, eTextRep: Int, pApp: CValuesRef<*>?, xFunc: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xStep: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xFinal: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?): Int {
    memScoped {
        return kniBridge92(db?.getPointer(memScope).rawValue, zFunctionName?.cstr?.getPointer(memScope).rawValue, nArg, eTextRep, pApp?.getPointer(memScope).rawValue, xFunc.rawValue, xStep.rawValue, xFinal.rawValue)
    }
}

fun sqlite3_create_function16(db: CValuesRef<sqlite3>?, zFunctionName: CValuesRef<*>?, nArg: Int, eTextRep: Int, pApp: CValuesRef<*>?, xFunc: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xStep: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xFinal: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?): Int {
    memScoped {
        return kniBridge93(db?.getPointer(memScope).rawValue, zFunctionName?.getPointer(memScope).rawValue, nArg, eTextRep, pApp?.getPointer(memScope).rawValue, xFunc.rawValue, xStep.rawValue, xFinal.rawValue)
    }
}

fun sqlite3_create_function_v2(db: CValuesRef<sqlite3>?, zFunctionName: String?, nArg: Int, eTextRep: Int, pApp: CValuesRef<*>?, xFunc: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xStep: CPointer<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>?, xFinal: CPointer<CFunction<(CPointer<sqlite3_context>?) -> Unit>>?, xDestroy: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int {
    memScoped {
        return kniBridge94(db?.getPointer(memScope).rawValue, zFunctionName?.cstr?.getPointer(memScope).rawValue, nArg, eTextRep, pApp?.getPointer(memScope).rawValue, xFunc.rawValue, xStep.rawValue, xFinal.rawValue, xDestroy.rawValue)
    }
}

fun sqlite3_aggregate_count(arg0: CValuesRef<sqlite3_context>?): Int {
    memScoped {
        return kniBridge95(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_expired(arg0: CValuesRef<sqlite3_stmt>?): Int {
    memScoped {
        return kniBridge96(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_transfer_bindings(arg0: CValuesRef<sqlite3_stmt>?, arg1: CValuesRef<sqlite3_stmt>?): Int {
    memScoped {
        return kniBridge97(arg0?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_global_recover(): Int {
    return kniBridge98()
}

fun sqlite3_thread_cleanup(): Unit {
    return kniBridge99()
}

fun sqlite3_memory_alarm(arg0: CPointer<CFunction<(COpaquePointer?, sqlite3_int64, Int) -> Unit>>?, arg1: CValuesRef<*>?, arg2: sqlite3_int64): Int {
    memScoped {
        return kniBridge100(arg0.rawValue, arg1?.getPointer(memScope).rawValue, arg2)
    }
}

fun sqlite3_value_blob(arg0: CValuesRef<sqlite3_value>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge101(arg0?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_value_bytes(arg0: CValuesRef<sqlite3_value>?): Int {
    memScoped {
        return kniBridge102(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_value_bytes16(arg0: CValuesRef<sqlite3_value>?): Int {
    memScoped {
        return kniBridge103(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_value_double(arg0: CValuesRef<sqlite3_value>?): Double {
    memScoped {
        return kniBridge104(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_value_int(arg0: CValuesRef<sqlite3_value>?): Int {
    memScoped {
        return kniBridge105(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_value_int64(arg0: CValuesRef<sqlite3_value>?): sqlite3_int64 {
    memScoped {
        return kniBridge106(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_value_text(arg0: CValuesRef<sqlite3_value>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge107(arg0?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_value_text16(arg0: CValuesRef<sqlite3_value>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge108(arg0?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_value_text16le(arg0: CValuesRef<sqlite3_value>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge109(arg0?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_value_text16be(arg0: CValuesRef<sqlite3_value>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge110(arg0?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_value_type(arg0: CValuesRef<sqlite3_value>?): Int {
    memScoped {
        return kniBridge111(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_value_numeric_type(arg0: CValuesRef<sqlite3_value>?): Int {
    memScoped {
        return kniBridge112(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_aggregate_context(arg0: CValuesRef<sqlite3_context>?, nBytes: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge113(arg0?.getPointer(memScope).rawValue, nBytes))
    }
}

fun sqlite3_user_data(arg0: CValuesRef<sqlite3_context>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge114(arg0?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_context_db_handle(arg0: CValuesRef<sqlite3_context>?): CPointer<sqlite3>? {
    memScoped {
        return interpretCPointer<sqlite3>(kniBridge115(arg0?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_get_auxdata(arg0: CValuesRef<sqlite3_context>?, N: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge116(arg0?.getPointer(memScope).rawValue, N))
    }
}

fun sqlite3_set_auxdata(arg0: CValuesRef<sqlite3_context>?, N: Int, arg2: CValuesRef<*>?, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge117(arg0?.getPointer(memScope).rawValue, N, arg2?.getPointer(memScope).rawValue, arg3.rawValue)
    }
}

fun sqlite3_result_blob(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<*>?, arg2: Int, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge118(arg0?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue, arg2, arg3.rawValue)
    }
}

fun sqlite3_result_double(arg0: CValuesRef<sqlite3_context>?, arg1: Double): Unit {
    memScoped {
        return kniBridge119(arg0?.getPointer(memScope).rawValue, arg1)
    }
}

fun sqlite3_result_error(arg0: CValuesRef<sqlite3_context>?, arg1: String?, arg2: Int): Unit {
    memScoped {
        return kniBridge120(arg0?.getPointer(memScope).rawValue, arg1?.cstr?.getPointer(memScope).rawValue, arg2)
    }
}

fun sqlite3_result_error16(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<*>?, arg2: Int): Unit {
    memScoped {
        return kniBridge121(arg0?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue, arg2)
    }
}

fun sqlite3_result_error_toobig(arg0: CValuesRef<sqlite3_context>?): Unit {
    memScoped {
        return kniBridge122(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_result_error_nomem(arg0: CValuesRef<sqlite3_context>?): Unit {
    memScoped {
        return kniBridge123(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_result_error_code(arg0: CValuesRef<sqlite3_context>?, arg1: Int): Unit {
    memScoped {
        return kniBridge124(arg0?.getPointer(memScope).rawValue, arg1)
    }
}

fun sqlite3_result_int(arg0: CValuesRef<sqlite3_context>?, arg1: Int): Unit {
    memScoped {
        return kniBridge125(arg0?.getPointer(memScope).rawValue, arg1)
    }
}

fun sqlite3_result_int64(arg0: CValuesRef<sqlite3_context>?, arg1: sqlite3_int64): Unit {
    memScoped {
        return kniBridge126(arg0?.getPointer(memScope).rawValue, arg1)
    }
}

fun sqlite3_result_null(arg0: CValuesRef<sqlite3_context>?): Unit {
    memScoped {
        return kniBridge127(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_result_text(arg0: CValuesRef<sqlite3_context>?, arg1: String?, arg2: Int, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge128(arg0?.getPointer(memScope).rawValue, arg1?.cstr?.getPointer(memScope).rawValue, arg2, arg3.rawValue)
    }
}

fun sqlite3_result_text16(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<*>?, arg2: Int, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge129(arg0?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue, arg2, arg3.rawValue)
    }
}

fun sqlite3_result_text16le(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<*>?, arg2: Int, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge130(arg0?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue, arg2, arg3.rawValue)
    }
}

fun sqlite3_result_text16be(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<*>?, arg2: Int, arg3: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge131(arg0?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue, arg2, arg3.rawValue)
    }
}

fun sqlite3_result_value(arg0: CValuesRef<sqlite3_context>?, arg1: CValuesRef<sqlite3_value>?): Unit {
    memScoped {
        return kniBridge132(arg0?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_result_zeroblob(arg0: CValuesRef<sqlite3_context>?, n: Int): Unit {
    memScoped {
        return kniBridge133(arg0?.getPointer(memScope).rawValue, n)
    }
}

fun sqlite3_create_collation(arg0: CValuesRef<sqlite3>?, zName: String?, eTextRep: Int, pArg: CValuesRef<*>?, xCompare: CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?): Int {
    memScoped {
        return kniBridge134(arg0?.getPointer(memScope).rawValue, zName?.cstr?.getPointer(memScope).rawValue, eTextRep, pArg?.getPointer(memScope).rawValue, xCompare.rawValue)
    }
}

fun sqlite3_create_collation_v2(arg0: CValuesRef<sqlite3>?, zName: String?, eTextRep: Int, pArg: CValuesRef<*>?, xCompare: CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?, xDestroy: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int {
    memScoped {
        return kniBridge135(arg0?.getPointer(memScope).rawValue, zName?.cstr?.getPointer(memScope).rawValue, eTextRep, pArg?.getPointer(memScope).rawValue, xCompare.rawValue, xDestroy.rawValue)
    }
}

fun sqlite3_create_collation16(arg0: CValuesRef<sqlite3>?, zName: CValuesRef<*>?, eTextRep: Int, pArg: CValuesRef<*>?, xCompare: CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?, Int, COpaquePointer?) -> Int>>?): Int {
    memScoped {
        return kniBridge136(arg0?.getPointer(memScope).rawValue, zName?.getPointer(memScope).rawValue, eTextRep, pArg?.getPointer(memScope).rawValue, xCompare.rawValue)
    }
}

fun sqlite3_collation_needed(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<*>?, arg2: CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, CPointer<ByteVar>?) -> Unit>>?): Int {
    memScoped {
        return kniBridge137(arg0?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue, arg2.rawValue)
    }
}

fun sqlite3_collation_needed16(arg0: CValuesRef<sqlite3>?, arg1: CValuesRef<*>?, arg2: CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, Int, COpaquePointer?) -> Unit>>?): Int {
    memScoped {
        return kniBridge138(arg0?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue, arg2.rawValue)
    }
}

fun sqlite3_sleep(arg0: Int): Int {
    return kniBridge139(arg0)
}

fun sqlite3_get_autocommit(arg0: CValuesRef<sqlite3>?): Int {
    memScoped {
        return kniBridge140(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_db_handle(arg0: CValuesRef<sqlite3_stmt>?): CPointer<sqlite3>? {
    memScoped {
        return interpretCPointer<sqlite3>(kniBridge141(arg0?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_next_stmt(pDb: CValuesRef<sqlite3>?, pStmt: CValuesRef<sqlite3_stmt>?): CPointer<sqlite3_stmt>? {
    memScoped {
        return interpretCPointer<sqlite3_stmt>(kniBridge142(pDb?.getPointer(memScope).rawValue, pStmt?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_commit_hook(arg0: CValuesRef<sqlite3>?, arg1: CPointer<CFunction<(COpaquePointer?) -> Int>>?, arg2: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge143(arg0?.getPointer(memScope).rawValue, arg1.rawValue, arg2?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_rollback_hook(arg0: CValuesRef<sqlite3>?, arg1: CPointer<CFunction<(COpaquePointer?) -> Unit>>?, arg2: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge144(arg0?.getPointer(memScope).rawValue, arg1.rawValue, arg2?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_update_hook(arg0: CValuesRef<sqlite3>?, arg1: CPointer<CFunction<(COpaquePointer?, Int, CPointer<ByteVar>?, CPointer<ByteVar>?, sqlite3_int64) -> Unit>>?, arg2: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge145(arg0?.getPointer(memScope).rawValue, arg1.rawValue, arg2?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_enable_shared_cache(arg0: Int): Int {
    return kniBridge146(arg0)
}

fun sqlite3_release_memory(arg0: Int): Int {
    return kniBridge147(arg0)
}

fun sqlite3_soft_heap_limit64(N: sqlite3_int64): sqlite3_int64 {
    return kniBridge148(N)
}

fun sqlite3_soft_heap_limit(N: Int): Unit {
    return kniBridge149(N)
}

fun sqlite3_table_column_metadata(db: CValuesRef<sqlite3>?, zDbName: String?, zTableName: String?, zColumnName: String?, pzDataType: CValuesRef<CPointerVar<ByteVar>>?, pzCollSeq: CValuesRef<CPointerVar<ByteVar>>?, pNotNull: CValuesRef<IntVar>?, pPrimaryKey: CValuesRef<IntVar>?, pAutoinc: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge150(db?.getPointer(memScope).rawValue, zDbName?.cstr?.getPointer(memScope).rawValue, zTableName?.cstr?.getPointer(memScope).rawValue, zColumnName?.cstr?.getPointer(memScope).rawValue, pzDataType?.getPointer(memScope).rawValue, pzCollSeq?.getPointer(memScope).rawValue, pNotNull?.getPointer(memScope).rawValue, pPrimaryKey?.getPointer(memScope).rawValue, pAutoinc?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_load_extension(db: CValuesRef<sqlite3>?, zFile: String?, zProc: String?, pzErrMsg: CValuesRef<CPointerVar<ByteVar>>?): Int {
    memScoped {
        return kniBridge151(db?.getPointer(memScope).rawValue, zFile?.cstr?.getPointer(memScope).rawValue, zProc?.cstr?.getPointer(memScope).rawValue, pzErrMsg?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_enable_load_extension(db: CValuesRef<sqlite3>?, onoff: Int): Int {
    memScoped {
        return kniBridge152(db?.getPointer(memScope).rawValue, onoff)
    }
}

fun sqlite3_auto_extension(xEntryPoint: CPointer<CFunction<() -> Unit>>?): Int {
    return kniBridge153(xEntryPoint.rawValue)
}

fun sqlite3_reset_auto_extension(): Unit {
    return kniBridge154()
}

fun sqlite3_create_module(db: CValuesRef<sqlite3>?, zName: String?, p: CValuesRef<sqlite3_module>?, pClientData: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge155(db?.getPointer(memScope).rawValue, zName?.cstr?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, pClientData?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_create_module_v2(db: CValuesRef<sqlite3>?, zName: String?, p: CValuesRef<sqlite3_module>?, pClientData: CValuesRef<*>?, xDestroy: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int {
    memScoped {
        return kniBridge156(db?.getPointer(memScope).rawValue, zName?.cstr?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, pClientData?.getPointer(memScope).rawValue, xDestroy.rawValue)
    }
}

fun sqlite3_declare_vtab(arg0: CValuesRef<sqlite3>?, zSQL: String?): Int {
    memScoped {
        return kniBridge157(arg0?.getPointer(memScope).rawValue, zSQL?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_overload_function(arg0: CValuesRef<sqlite3>?, zFuncName: String?, nArg: Int): Int {
    memScoped {
        return kniBridge158(arg0?.getPointer(memScope).rawValue, zFuncName?.cstr?.getPointer(memScope).rawValue, nArg)
    }
}

fun sqlite3_blob_open(arg0: CValuesRef<sqlite3>?, zDb: String?, zTable: String?, zColumn: String?, iRow: sqlite3_int64, flags: Int, ppBlob: CValuesRef<CPointerVar<sqlite3_blob>>?): Int {
    memScoped {
        return kniBridge159(arg0?.getPointer(memScope).rawValue, zDb?.cstr?.getPointer(memScope).rawValue, zTable?.cstr?.getPointer(memScope).rawValue, zColumn?.cstr?.getPointer(memScope).rawValue, iRow, flags, ppBlob?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_blob_reopen(arg0: CValuesRef<sqlite3_blob>?, arg1: sqlite3_int64): Int {
    memScoped {
        return kniBridge160(arg0?.getPointer(memScope).rawValue, arg1)
    }
}

fun sqlite3_blob_close(arg0: CValuesRef<sqlite3_blob>?): Int {
    memScoped {
        return kniBridge161(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_blob_bytes(arg0: CValuesRef<sqlite3_blob>?): Int {
    memScoped {
        return kniBridge162(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_blob_read(arg0: CValuesRef<sqlite3_blob>?, Z: CValuesRef<*>?, N: Int, iOffset: Int): Int {
    memScoped {
        return kniBridge163(arg0?.getPointer(memScope).rawValue, Z?.getPointer(memScope).rawValue, N, iOffset)
    }
}

fun sqlite3_blob_write(arg0: CValuesRef<sqlite3_blob>?, z: CValuesRef<*>?, n: Int, iOffset: Int): Int {
    memScoped {
        return kniBridge164(arg0?.getPointer(memScope).rawValue, z?.getPointer(memScope).rawValue, n, iOffset)
    }
}

fun sqlite3_vfs_find(zVfsName: String?): CPointer<sqlite3_vfs>? {
    memScoped {
        return interpretCPointer<sqlite3_vfs>(kniBridge165(zVfsName?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_vfs_register(arg0: CValuesRef<sqlite3_vfs>?, makeDflt: Int): Int {
    memScoped {
        return kniBridge166(arg0?.getPointer(memScope).rawValue, makeDflt)
    }
}

fun sqlite3_vfs_unregister(arg0: CValuesRef<sqlite3_vfs>?): Int {
    memScoped {
        return kniBridge167(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_mutex_alloc(arg0: Int): CPointer<sqlite3_mutex>? {
    return interpretCPointer<sqlite3_mutex>(kniBridge168(arg0))
}

fun sqlite3_mutex_free(arg0: CValuesRef<sqlite3_mutex>?): Unit {
    memScoped {
        return kniBridge169(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_mutex_enter(arg0: CValuesRef<sqlite3_mutex>?): Unit {
    memScoped {
        return kniBridge170(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_mutex_try(arg0: CValuesRef<sqlite3_mutex>?): Int {
    memScoped {
        return kniBridge171(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_mutex_leave(arg0: CValuesRef<sqlite3_mutex>?): Unit {
    memScoped {
        return kniBridge172(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_mutex_held(arg0: CValuesRef<sqlite3_mutex>?): Int {
    memScoped {
        return kniBridge173(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_mutex_notheld(arg0: CValuesRef<sqlite3_mutex>?): Int {
    memScoped {
        return kniBridge174(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_db_mutex(arg0: CValuesRef<sqlite3>?): CPointer<sqlite3_mutex>? {
    memScoped {
        return interpretCPointer<sqlite3_mutex>(kniBridge175(arg0?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_file_control(arg0: CValuesRef<sqlite3>?, zDbName: String?, op: Int, arg3: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge176(arg0?.getPointer(memScope).rawValue, zDbName?.cstr?.getPointer(memScope).rawValue, op, arg3?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_test_control(op: Int, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge177(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(op), variadicArguments, memScope)
        return kniResult.value
    }
}

fun sqlite3_status(op: Int, pCurrent: CValuesRef<IntVar>?, pHighwater: CValuesRef<IntVar>?, resetFlag: Int): Int {
    memScoped {
        return kniBridge178(op, pCurrent?.getPointer(memScope).rawValue, pHighwater?.getPointer(memScope).rawValue, resetFlag)
    }
}

fun sqlite3_db_status(arg0: CValuesRef<sqlite3>?, op: Int, pCur: CValuesRef<IntVar>?, pHiwtr: CValuesRef<IntVar>?, resetFlg: Int): Int {
    memScoped {
        return kniBridge179(arg0?.getPointer(memScope).rawValue, op, pCur?.getPointer(memScope).rawValue, pHiwtr?.getPointer(memScope).rawValue, resetFlg)
    }
}

fun sqlite3_stmt_status(arg0: CValuesRef<sqlite3_stmt>?, op: Int, resetFlg: Int): Int {
    memScoped {
        return kniBridge180(arg0?.getPointer(memScope).rawValue, op, resetFlg)
    }
}

fun sqlite3_backup_init(pDest: CValuesRef<sqlite3>?, zDestName: String?, pSource: CValuesRef<sqlite3>?, zSourceName: String?): CPointer<sqlite3_backup>? {
    memScoped {
        return interpretCPointer<sqlite3_backup>(kniBridge181(pDest?.getPointer(memScope).rawValue, zDestName?.cstr?.getPointer(memScope).rawValue, pSource?.getPointer(memScope).rawValue, zSourceName?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_backup_step(p: CValuesRef<sqlite3_backup>?, nPage: Int): Int {
    memScoped {
        return kniBridge182(p?.getPointer(memScope).rawValue, nPage)
    }
}

fun sqlite3_backup_finish(p: CValuesRef<sqlite3_backup>?): Int {
    memScoped {
        return kniBridge183(p?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_backup_remaining(p: CValuesRef<sqlite3_backup>?): Int {
    memScoped {
        return kniBridge184(p?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_backup_pagecount(p: CValuesRef<sqlite3_backup>?): Int {
    memScoped {
        return kniBridge185(p?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_unlock_notify(pBlocked: CValuesRef<sqlite3>?, xNotify: CPointer<CFunction<(CPointer<COpaquePointerVar>?, Int) -> Unit>>?, pNotifyArg: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge186(pBlocked?.getPointer(memScope).rawValue, xNotify.rawValue, pNotifyArg?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_strnicmp(arg0: String?, arg1: String?, arg2: Int): Int {
    memScoped {
        return kniBridge187(arg0?.cstr?.getPointer(memScope).rawValue, arg1?.cstr?.getPointer(memScope).rawValue, arg2)
    }
}

fun sqlite3_log(iErrCode: Int, zFormat: String?, vararg variadicArguments: Any?): Unit {
    memScoped {
        callWithVarargs(kniBridge188(), nativeNullPtr, FFI_TYPE_KIND_VOID, arrayOf(iErrCode, zFormat?.cstr?.getPointer(memScope)), variadicArguments, memScope)
    }
}

fun sqlite3_wal_hook(arg0: CValuesRef<sqlite3>?, arg1: CPointer<CFunction<(COpaquePointer?, CPointer<sqlite3>?, CPointer<ByteVar>?, Int) -> Int>>?, arg2: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge189(arg0?.getPointer(memScope).rawValue, arg1.rawValue, arg2?.getPointer(memScope).rawValue))
    }
}

fun sqlite3_wal_autocheckpoint(db: CValuesRef<sqlite3>?, N: Int): Int {
    memScoped {
        return kniBridge190(db?.getPointer(memScope).rawValue, N)
    }
}

fun sqlite3_wal_checkpoint(db: CValuesRef<sqlite3>?, zDb: String?): Int {
    memScoped {
        return kniBridge191(db?.getPointer(memScope).rawValue, zDb?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_wal_checkpoint_v2(db: CValuesRef<sqlite3>?, zDb: String?, eMode: Int, pnLog: CValuesRef<IntVar>?, pnCkpt: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge192(db?.getPointer(memScope).rawValue, zDb?.cstr?.getPointer(memScope).rawValue, eMode, pnLog?.getPointer(memScope).rawValue, pnCkpt?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_vtab_config(arg0: CValuesRef<sqlite3>?, op: Int, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge193(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0?.getPointer(memScope), op), variadicArguments, memScope)
        return kniResult.value
    }
}

fun sqlite3_vtab_on_conflict(arg0: CValuesRef<sqlite3>?): Int {
    memScoped {
        return kniBridge194(arg0?.getPointer(memScope).rawValue)
    }
}

fun sqlite3_rtree_geometry_callback(db: CValuesRef<sqlite3>?, zGeom: String?, xGeom: CPointer<CFunction<(CPointer<sqlite3_rtree_geometry>?, Int, CPointer<DoubleVar>?, CPointer<IntVar>?) -> Int>>?, pContext: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge195(db?.getPointer(memScope).rawValue, zGeom?.cstr?.getPointer(memScope).rawValue, xGeom.rawValue, pContext?.getPointer(memScope).rawValue)
    }
}

val SQLITE_VERSION: String get() = "3.7.7.1"

const val SQLITE_VERSION_NUMBER: Int = 3007007

val SQLITE_SOURCE_ID: String get() = "2011\u002D06\u002D28 17:39:05 af0d91adf497f5f36ec3813f04235a6e195a605f"

const val SQLITE_OK: Int = 0

const val SQLITE_ERROR: Int = 1

const val SQLITE_INTERNAL: Int = 2

const val SQLITE_PERM: Int = 3

const val SQLITE_ABORT: Int = 4

const val SQLITE_BUSY: Int = 5

const val SQLITE_LOCKED: Int = 6

const val SQLITE_NOMEM: Int = 7

const val SQLITE_READONLY: Int = 8

const val SQLITE_INTERRUPT: Int = 9

const val SQLITE_IOERR: Int = 10

const val SQLITE_CORRUPT: Int = 11

const val SQLITE_NOTFOUND: Int = 12

const val SQLITE_FULL: Int = 13

const val SQLITE_CANTOPEN: Int = 14

const val SQLITE_PROTOCOL: Int = 15

const val SQLITE_EMPTY: Int = 16

const val SQLITE_SCHEMA: Int = 17

const val SQLITE_TOOBIG: Int = 18

const val SQLITE_CONSTRAINT: Int = 19

const val SQLITE_MISMATCH: Int = 20

const val SQLITE_MISUSE: Int = 21

const val SQLITE_NOLFS: Int = 22

const val SQLITE_AUTH: Int = 23

const val SQLITE_FORMAT: Int = 24

const val SQLITE_RANGE: Int = 25

const val SQLITE_NOTADB: Int = 26

const val SQLITE_ROW: Int = 100

const val SQLITE_DONE: Int = 101

const val SQLITE_IOERR_READ: Int = 266

const val SQLITE_IOERR_SHORT_READ: Int = 522

const val SQLITE_IOERR_WRITE: Int = 778

const val SQLITE_IOERR_FSYNC: Int = 1034

const val SQLITE_IOERR_DIR_FSYNC: Int = 1290

const val SQLITE_IOERR_TRUNCATE: Int = 1546

const val SQLITE_IOERR_FSTAT: Int = 1802

const val SQLITE_IOERR_UNLOCK: Int = 2058

const val SQLITE_IOERR_RDLOCK: Int = 2314

const val SQLITE_IOERR_DELETE: Int = 2570

const val SQLITE_IOERR_BLOCKED: Int = 2826

const val SQLITE_IOERR_NOMEM: Int = 3082

const val SQLITE_IOERR_ACCESS: Int = 3338

const val SQLITE_IOERR_CHECKRESERVEDLOCK: Int = 3594

const val SQLITE_IOERR_LOCK: Int = 3850

const val SQLITE_IOERR_CLOSE: Int = 4106

const val SQLITE_IOERR_DIR_CLOSE: Int = 4362

const val SQLITE_IOERR_SHMOPEN: Int = 4618

const val SQLITE_IOERR_SHMSIZE: Int = 4874

const val SQLITE_IOERR_SHMLOCK: Int = 5130

const val SQLITE_IOERR_SHMMAP: Int = 5386

const val SQLITE_IOERR_SEEK: Int = 5642

const val SQLITE_LOCKED_SHAREDCACHE: Int = 262

const val SQLITE_BUSY_RECOVERY: Int = 261

const val SQLITE_CANTOPEN_NOTEMPDIR: Int = 270

const val SQLITE_CORRUPT_VTAB: Int = 267

const val SQLITE_READONLY_RECOVERY: Int = 264

const val SQLITE_READONLY_CANTLOCK: Int = 520

const val SQLITE_OPEN_READONLY: Int = 1

const val SQLITE_OPEN_READWRITE: Int = 2

const val SQLITE_OPEN_CREATE: Int = 4

const val SQLITE_OPEN_DELETEONCLOSE: Int = 8

const val SQLITE_OPEN_EXCLUSIVE: Int = 16

const val SQLITE_OPEN_AUTOPROXY: Int = 32

const val SQLITE_OPEN_URI: Int = 64

const val SQLITE_OPEN_MAIN_DB: Int = 256

const val SQLITE_OPEN_TEMP_DB: Int = 512

const val SQLITE_OPEN_TRANSIENT_DB: Int = 1024

const val SQLITE_OPEN_MAIN_JOURNAL: Int = 2048

const val SQLITE_OPEN_TEMP_JOURNAL: Int = 4096

const val SQLITE_OPEN_SUBJOURNAL: Int = 8192

const val SQLITE_OPEN_MASTER_JOURNAL: Int = 16384

const val SQLITE_OPEN_NOMUTEX: Int = 32768

const val SQLITE_OPEN_FULLMUTEX: Int = 65536

const val SQLITE_OPEN_SHAREDCACHE: Int = 131072

const val SQLITE_OPEN_PRIVATECACHE: Int = 262144

const val SQLITE_OPEN_WAL: Int = 524288

const val SQLITE_IOCAP_ATOMIC: Int = 1

const val SQLITE_IOCAP_ATOMIC512: Int = 2

const val SQLITE_IOCAP_ATOMIC1K: Int = 4

const val SQLITE_IOCAP_ATOMIC2K: Int = 8

const val SQLITE_IOCAP_ATOMIC4K: Int = 16

const val SQLITE_IOCAP_ATOMIC8K: Int = 32

const val SQLITE_IOCAP_ATOMIC16K: Int = 64

const val SQLITE_IOCAP_ATOMIC32K: Int = 128

const val SQLITE_IOCAP_ATOMIC64K: Int = 256

const val SQLITE_IOCAP_SAFE_APPEND: Int = 512

const val SQLITE_IOCAP_SEQUENTIAL: Int = 1024

const val SQLITE_IOCAP_UNDELETABLE_WHEN_OPEN: Int = 2048

const val SQLITE_LOCK_NONE: Int = 0

const val SQLITE_LOCK_SHARED: Int = 1

const val SQLITE_LOCK_RESERVED: Int = 2

const val SQLITE_LOCK_PENDING: Int = 3

const val SQLITE_LOCK_EXCLUSIVE: Int = 4

const val SQLITE_SYNC_NORMAL: Int = 2

const val SQLITE_SYNC_FULL: Int = 3

const val SQLITE_SYNC_DATAONLY: Int = 16

const val SQLITE_FCNTL_LOCKSTATE: Int = 1

const val SQLITE_GET_LOCKPROXYFILE: Int = 2

const val SQLITE_SET_LOCKPROXYFILE: Int = 3

const val SQLITE_LAST_ERRNO: Int = 4

const val SQLITE_FCNTL_SIZE_HINT: Int = 5

const val SQLITE_FCNTL_CHUNK_SIZE: Int = 6

const val SQLITE_FCNTL_FILE_POINTER: Int = 7

const val SQLITE_FCNTL_SYNC_OMITTED: Int = 8

const val SQLITE_ACCESS_EXISTS: Int = 0

const val SQLITE_ACCESS_READWRITE: Int = 1

const val SQLITE_ACCESS_READ: Int = 2

const val SQLITE_SHM_UNLOCK: Int = 1

const val SQLITE_SHM_LOCK: Int = 2

const val SQLITE_SHM_SHARED: Int = 4

const val SQLITE_SHM_EXCLUSIVE: Int = 8

const val SQLITE_SHM_NLOCK: Int = 8

const val SQLITE_CONFIG_SINGLETHREAD: Int = 1

const val SQLITE_CONFIG_MULTITHREAD: Int = 2

const val SQLITE_CONFIG_SERIALIZED: Int = 3

const val SQLITE_CONFIG_MALLOC: Int = 4

const val SQLITE_CONFIG_GETMALLOC: Int = 5

const val SQLITE_CONFIG_SCRATCH: Int = 6

const val SQLITE_CONFIG_PAGECACHE: Int = 7

const val SQLITE_CONFIG_HEAP: Int = 8

const val SQLITE_CONFIG_MEMSTATUS: Int = 9

const val SQLITE_CONFIG_MUTEX: Int = 10

const val SQLITE_CONFIG_GETMUTEX: Int = 11

const val SQLITE_CONFIG_LOOKASIDE: Int = 13

const val SQLITE_CONFIG_PCACHE: Int = 14

const val SQLITE_CONFIG_GETPCACHE: Int = 15

const val SQLITE_CONFIG_LOG: Int = 16

const val SQLITE_CONFIG_URI: Int = 17

const val SQLITE_DBCONFIG_LOOKASIDE: Int = 1001

const val SQLITE_DBCONFIG_ENABLE_FKEY: Int = 1002

const val SQLITE_DBCONFIG_ENABLE_TRIGGER: Int = 1003

const val SQLITE_DENY: Int = 1

const val SQLITE_IGNORE: Int = 2

const val SQLITE_CREATE_INDEX: Int = 1

const val SQLITE_CREATE_TABLE: Int = 2

const val SQLITE_CREATE_TEMP_INDEX: Int = 3

const val SQLITE_CREATE_TEMP_TABLE: Int = 4

const val SQLITE_CREATE_TEMP_TRIGGER: Int = 5

const val SQLITE_CREATE_TEMP_VIEW: Int = 6

const val SQLITE_CREATE_TRIGGER: Int = 7

const val SQLITE_CREATE_VIEW: Int = 8

const val SQLITE_DELETE: Int = 9

const val SQLITE_DROP_INDEX: Int = 10

const val SQLITE_DROP_TABLE: Int = 11

const val SQLITE_DROP_TEMP_INDEX: Int = 12

const val SQLITE_DROP_TEMP_TABLE: Int = 13

const val SQLITE_DROP_TEMP_TRIGGER: Int = 14

const val SQLITE_DROP_TEMP_VIEW: Int = 15

const val SQLITE_DROP_TRIGGER: Int = 16

const val SQLITE_DROP_VIEW: Int = 17

const val SQLITE_INSERT: Int = 18

const val SQLITE_PRAGMA: Int = 19

const val SQLITE_READ: Int = 20

const val SQLITE_SELECT: Int = 21

const val SQLITE_TRANSACTION: Int = 22

const val SQLITE_UPDATE: Int = 23

const val SQLITE_ATTACH: Int = 24

const val SQLITE_DETACH: Int = 25

const val SQLITE_ALTER_TABLE: Int = 26

const val SQLITE_REINDEX: Int = 27

const val SQLITE_ANALYZE: Int = 28

const val SQLITE_CREATE_VTABLE: Int = 29

const val SQLITE_DROP_VTABLE: Int = 30

const val SQLITE_FUNCTION: Int = 31

const val SQLITE_SAVEPOINT: Int = 32

const val SQLITE_COPY: Int = 0

const val SQLITE_LIMIT_LENGTH: Int = 0

const val SQLITE_LIMIT_SQL_LENGTH: Int = 1

const val SQLITE_LIMIT_COLUMN: Int = 2

const val SQLITE_LIMIT_EXPR_DEPTH: Int = 3

const val SQLITE_LIMIT_COMPOUND_SELECT: Int = 4

const val SQLITE_LIMIT_VDBE_OP: Int = 5

const val SQLITE_LIMIT_FUNCTION_ARG: Int = 6

const val SQLITE_LIMIT_ATTACHED: Int = 7

const val SQLITE_LIMIT_LIKE_PATTERN_LENGTH: Int = 8

const val SQLITE_LIMIT_VARIABLE_NUMBER: Int = 9

const val SQLITE_LIMIT_TRIGGER_DEPTH: Int = 10

const val SQLITE_INTEGER: Int = 1

const val SQLITE_FLOAT: Int = 2

const val SQLITE_BLOB: Int = 4

const val SQLITE_NULL: Int = 5

const val SQLITE_TEXT: Int = 3

const val SQLITE3_TEXT: Int = 3

const val SQLITE_UTF8: Int = 1

const val SQLITE_UTF16LE: Int = 2

const val SQLITE_UTF16BE: Int = 3

const val SQLITE_UTF16: Int = 4

const val SQLITE_ANY: Int = 5

const val SQLITE_UTF16_ALIGNED: Int = 8

const val SQLITE_INDEX_CONSTRAINT_EQ: Int = 2

const val SQLITE_INDEX_CONSTRAINT_GT: Int = 4

const val SQLITE_INDEX_CONSTRAINT_LE: Int = 8

const val SQLITE_INDEX_CONSTRAINT_LT: Int = 16

const val SQLITE_INDEX_CONSTRAINT_GE: Int = 32

const val SQLITE_INDEX_CONSTRAINT_MATCH: Int = 64

const val SQLITE_MUTEX_FAST: Int = 0

const val SQLITE_MUTEX_RECURSIVE: Int = 1

const val SQLITE_MUTEX_STATIC_MASTER: Int = 2

const val SQLITE_MUTEX_STATIC_MEM: Int = 3

const val SQLITE_MUTEX_STATIC_MEM2: Int = 4

const val SQLITE_MUTEX_STATIC_OPEN: Int = 4

const val SQLITE_MUTEX_STATIC_PRNG: Int = 5

const val SQLITE_MUTEX_STATIC_LRU: Int = 6

const val SQLITE_MUTEX_STATIC_LRU2: Int = 7

const val SQLITE_MUTEX_STATIC_PMEM: Int = 7

const val SQLITE_TESTCTRL_FIRST: Int = 5

const val SQLITE_TESTCTRL_PRNG_SAVE: Int = 5

const val SQLITE_TESTCTRL_PRNG_RESTORE: Int = 6

const val SQLITE_TESTCTRL_PRNG_RESET: Int = 7

const val SQLITE_TESTCTRL_BITVEC_TEST: Int = 8

const val SQLITE_TESTCTRL_FAULT_INSTALL: Int = 9

const val SQLITE_TESTCTRL_BENIGN_MALLOC_HOOKS: Int = 10

const val SQLITE_TESTCTRL_PENDING_BYTE: Int = 11

const val SQLITE_TESTCTRL_ASSERT: Int = 12

const val SQLITE_TESTCTRL_ALWAYS: Int = 13

const val SQLITE_TESTCTRL_RESERVE: Int = 14

const val SQLITE_TESTCTRL_OPTIMIZATIONS: Int = 15

const val SQLITE_TESTCTRL_ISKEYWORD: Int = 16

const val SQLITE_TESTCTRL_PGHDRSZ: Int = 17

const val SQLITE_TESTCTRL_SCRATCHMALLOC: Int = 18

const val SQLITE_TESTCTRL_LOCALTIME_FAULT: Int = 19

const val SQLITE_TESTCTRL_LAST: Int = 19

const val SQLITE_STATUS_MEMORY_USED: Int = 0

const val SQLITE_STATUS_PAGECACHE_USED: Int = 1

const val SQLITE_STATUS_PAGECACHE_OVERFLOW: Int = 2

const val SQLITE_STATUS_SCRATCH_USED: Int = 3

const val SQLITE_STATUS_SCRATCH_OVERFLOW: Int = 4

const val SQLITE_STATUS_MALLOC_SIZE: Int = 5

const val SQLITE_STATUS_PARSER_STACK: Int = 6

const val SQLITE_STATUS_PAGECACHE_SIZE: Int = 7

const val SQLITE_STATUS_SCRATCH_SIZE: Int = 8

const val SQLITE_STATUS_MALLOC_COUNT: Int = 9

const val SQLITE_DBSTATUS_LOOKASIDE_USED: Int = 0

const val SQLITE_DBSTATUS_CACHE_USED: Int = 1

const val SQLITE_DBSTATUS_SCHEMA_USED: Int = 2

const val SQLITE_DBSTATUS_STMT_USED: Int = 3

const val SQLITE_DBSTATUS_LOOKASIDE_HIT: Int = 4

const val SQLITE_DBSTATUS_LOOKASIDE_MISS_SIZE: Int = 5

const val SQLITE_DBSTATUS_LOOKASIDE_MISS_FULL: Int = 6

const val SQLITE_DBSTATUS_MAX: Int = 6

const val SQLITE_STMTSTATUS_FULLSCAN_STEP: Int = 1

const val SQLITE_STMTSTATUS_SORT: Int = 2

const val SQLITE_STMTSTATUS_AUTOINDEX: Int = 3

const val SQLITE_CHECKPOINT_PASSIVE: Int = 0

const val SQLITE_CHECKPOINT_FULL: Int = 1

const val SQLITE_CHECKPOINT_RESTART: Int = 2

const val SQLITE_VTAB_CONSTRAINT_SUPPORT: Int = 1

const val SQLITE_ROLLBACK: Int = 1

const val SQLITE_FAIL: Int = 3

const val SQLITE_REPLACE: Int = 5

val SQLITE_STATIC: sqlite3_destructor_type?
    get() = interpretCPointer<CFunction<(COpaquePointer?) -> Unit>>(kniBridge196())

val SQLITE_TRANSIENT: sqlite3_destructor_type?
    get() = interpretCPointer<CFunction<(COpaquePointer?) -> Unit>>(kniBridge197())

val sqlite3_version: CArrayPointer<ByteVar>
    get() = interpretCPointer<ByteVar>(kniBridge198())!!

var sqlite3_temp_directory: CPointer<ByteVar>?
    get() = interpretCPointer<ByteVar>(kniBridge199())
    set(value) { kniBridge200(value.rawValue) }


class sqlite3_file(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pMethods: CPointer<sqlite3_io_methods>?
        get() = memberAt<CPointerVar<sqlite3_io_methods>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_io_methods>>(0).value = value }
    
}

class sqlite3_io_methods(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(136, 8)
    
    var iVersion: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var xClose: CPointer<CFunction<(CPointer<sqlite3_file>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Int>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Int>>>(8).value = value }
    
    var xRead: CPointer<CFunction<(CPointer<sqlite3_file>?, COpaquePointer?, Int, sqlite3_int64) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, COpaquePointer?, Int, sqlite3_int64) -> Int>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, COpaquePointer?, Int, sqlite3_int64) -> Int>>>(16).value = value }
    
    var xWrite: CPointer<CFunction<(CPointer<sqlite3_file>?, COpaquePointer?, Int, sqlite3_int64) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, COpaquePointer?, Int, sqlite3_int64) -> Int>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, COpaquePointer?, Int, sqlite3_int64) -> Int>>>(24).value = value }
    
    var xTruncate: CPointer<CFunction<(CPointer<sqlite3_file>?, sqlite3_int64) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, sqlite3_int64) -> Int>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, sqlite3_int64) -> Int>>>(32).value = value }
    
    var xSync: CPointer<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(40).value = value }
    
    var xFileSize: CPointer<CFunction<(CPointer<sqlite3_file>?, CPointer<sqlite3_int64Var>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, CPointer<sqlite3_int64Var>?) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, CPointer<sqlite3_int64Var>?) -> Int>>>(48).value = value }
    
    var xLock: CPointer<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(56).value = value }
    
    var xUnlock: CPointer<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(64).value = value }
    
    var xCheckReservedLock: CPointer<CFunction<(CPointer<sqlite3_file>?, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, CPointer<IntVar>?) -> Int>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, CPointer<IntVar>?) -> Int>>>(72).value = value }
    
    var xFileControl: CPointer<CFunction<(CPointer<sqlite3_file>?, Int, COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int, COpaquePointer?) -> Int>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int, COpaquePointer?) -> Int>>>(80).value = value }
    
    var xSectorSize: CPointer<CFunction<(CPointer<sqlite3_file>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Int>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Int>>>(88).value = value }
    
    var xDeviceCharacteristics: CPointer<CFunction<(CPointer<sqlite3_file>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Int>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Int>>>(96).value = value }
    
    var xShmMap: CPointer<CFunction<(CPointer<sqlite3_file>?, Int, Int, Int, CPointer<COpaquePointerVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int, Int, Int, CPointer<COpaquePointerVar>?) -> Int>>>(104).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int, Int, Int, CPointer<COpaquePointerVar>?) -> Int>>>(104).value = value }
    
    var xShmLock: CPointer<CFunction<(CPointer<sqlite3_file>?, Int, Int, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int, Int, Int) -> Int>>>(112).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int, Int, Int) -> Int>>>(112).value = value }
    
    var xShmBarrier: CPointer<CFunction<(CPointer<sqlite3_file>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Unit>>>(120).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?) -> Unit>>>(120).value = value }
    
    var xShmUnmap: CPointer<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(128).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_file>?, Int) -> Int>>>(128).value = value }
    
}


class sqlite3_vfs(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(168, 8)
    
    var iVersion: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var szOsFile: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var mxPathname: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var pNext: CPointer<sqlite3_vfs>?
        get() = memberAt<CPointerVar<sqlite3_vfs>>(16).value
        set(value) { memberAt<CPointerVar<sqlite3_vfs>>(16).value = value }
    
    var zName: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var pAppData: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(32).value
        set(value) { memberAt<COpaquePointerVar>(32).value = value }
    
    var xOpen: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, CPointer<sqlite3_file>?, Int, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, CPointer<sqlite3_file>?, Int, CPointer<IntVar>?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, CPointer<sqlite3_file>?, Int, CPointer<IntVar>?) -> Int>>>(40).value = value }
    
    var xDelete: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int) -> Int>>>(48).value = value }
    
    var xAccess: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int, CPointer<IntVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int, CPointer<IntVar>?) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int, CPointer<IntVar>?) -> Int>>>(56).value = value }
    
    var xFullPathname: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int, CPointer<ByteVar>?) -> Int>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, Int, CPointer<ByteVar>?) -> Int>>>(64).value = value }
    
    var xDlOpen: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> COpaquePointer?>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> COpaquePointer?>>>(72).value = value }
    
    var xDlError: CPointer<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Unit>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Unit>>>(80).value = value }
    
    var xDlSym: CPointer<CFunction<(CPointer<sqlite3_vfs>?, COpaquePointer?, CPointer<ByteVar>?) -> CPointer<CFunction<() -> Unit>>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, COpaquePointer?, CPointer<ByteVar>?) -> CPointer<CFunction<() -> Unit>>?>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, COpaquePointer?, CPointer<ByteVar>?) -> CPointer<CFunction<() -> Unit>>?>>>(88).value = value }
    
    var xDlClose: CPointer<CFunction<(CPointer<sqlite3_vfs>?, COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, COpaquePointer?) -> Unit>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, COpaquePointer?) -> Unit>>>(96).value = value }
    
    var xRandomness: CPointer<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Int>>>(104).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Int>>>(104).value = value }
    
    var xSleep: CPointer<CFunction<(CPointer<sqlite3_vfs>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int) -> Int>>>(112).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int) -> Int>>>(112).value = value }
    
    var xCurrentTime: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<DoubleVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<DoubleVar>?) -> Int>>>(120).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<DoubleVar>?) -> Int>>>(120).value = value }
    
    var xGetLastError: CPointer<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Int>>>(128).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, Int, CPointer<ByteVar>?) -> Int>>>(128).value = value }
    
    var xCurrentTimeInt64: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<sqlite3_int64Var>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<sqlite3_int64Var>?) -> Int>>>(136).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<sqlite3_int64Var>?) -> Int>>>(136).value = value }
    
    var xSetSystemCall: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, sqlite3_syscall_ptr?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, sqlite3_syscall_ptr?) -> Int>>>(144).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?, sqlite3_syscall_ptr?) -> Int>>>(144).value = value }
    
    var xGetSystemCall: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> sqlite3_syscall_ptr?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> sqlite3_syscall_ptr?>>>(152).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> sqlite3_syscall_ptr?>>>(152).value = value }
    
    var xNextSystemCall: CPointer<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> CPointer<ByteVar>?>>>(160).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vfs>?, CPointer<ByteVar>?) -> CPointer<ByteVar>?>>>(160).value = value }
    
}

class sqlite3_mem_methods(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(64, 8)
    
    var xMalloc: CPointer<CFunction<(Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> COpaquePointer?>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> COpaquePointer?>>>(0).value = value }
    
    var xFree: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value = value }
    
    var xRealloc: CPointer<CFunction<(COpaquePointer?, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> COpaquePointer?>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> COpaquePointer?>>>(16).value = value }
    
    var xSize: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(24).value = value }
    
    var xRoundup: CPointer<CFunction<(Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> Int>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> Int>>>(32).value = value }
    
    var xInit: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(40).value = value }
    
    var xShutdown: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(48).value = value }
    
    var pAppData: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(56).value
        set(value) { memberAt<COpaquePointerVar>(56).value = value }
    
}




class sqlite3_vtab(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var pModule: CPointer<sqlite3_module>?
        get() = memberAt<CPointerVar<sqlite3_module>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_module>>(0).value = value }
    
    var nRef: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var zErrMsg: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
}

class sqlite3_module(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(184, 8)
    
    var iVersion: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var xCreate: CPointer<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(8).value = value }
    
    var xConnect: CPointer<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3>?, COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<sqlite3_vtab>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>>(16).value = value }
    
    var xBestIndex: CPointer<CFunction<(CPointer<sqlite3_vtab>?, CPointer<sqlite3_index_info>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, CPointer<sqlite3_index_info>?) -> Int>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, CPointer<sqlite3_index_info>?) -> Int>>>(24).value = value }
    
    var xDisconnect: CPointer<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(32).value = value }
    
    var xDestroy: CPointer<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(40).value = value }
    
    var xOpen: CPointer<CFunction<(CPointer<sqlite3_vtab>?, CPointer<CPointerVar<sqlite3_vtab_cursor>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, CPointer<CPointerVar<sqlite3_vtab_cursor>>?) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, CPointer<CPointerVar<sqlite3_vtab_cursor>>?) -> Int>>>(48).value = value }
    
    var xClose: CPointer<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>>(56).value = value }
    
    var xFilter: CPointer<CFunction<(CPointer<sqlite3_vtab_cursor>?, Int, CPointer<ByteVar>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?, Int, CPointer<ByteVar>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Int>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?, Int, CPointer<ByteVar>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Int>>>(64).value = value }
    
    var xNext: CPointer<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>>(72).value = value }
    
    var xEof: CPointer<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?) -> Int>>>(80).value = value }
    
    var xColumn: CPointer<CFunction<(CPointer<sqlite3_vtab_cursor>?, CPointer<sqlite3_context>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?, CPointer<sqlite3_context>?, Int) -> Int>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?, CPointer<sqlite3_context>?, Int) -> Int>>>(88).value = value }
    
    var xRowid: CPointer<CFunction<(CPointer<sqlite3_vtab_cursor>?, CPointer<sqlite3_int64Var>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?, CPointer<sqlite3_int64Var>?) -> Int>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab_cursor>?, CPointer<sqlite3_int64Var>?) -> Int>>>(96).value = value }
    
    var xUpdate: CPointer<CFunction<(CPointer<sqlite3_vtab>?, Int, CPointer<CPointerVar<sqlite3_value>>?, CPointer<sqlite3_int64Var>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int, CPointer<CPointerVar<sqlite3_value>>?, CPointer<sqlite3_int64Var>?) -> Int>>>(104).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int, CPointer<CPointerVar<sqlite3_value>>?, CPointer<sqlite3_int64Var>?) -> Int>>>(104).value = value }
    
    var xBegin: CPointer<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(112).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(112).value = value }
    
    var xSync: CPointer<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(120).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(120).value = value }
    
    var xCommit: CPointer<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(128).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(128).value = value }
    
    var xRollback: CPointer<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(136).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?) -> Int>>>(136).value = value }
    
    var xFindFunction: CPointer<CFunction<(CPointer<sqlite3_vtab>?, Int, CPointer<ByteVar>?, CPointer<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>>?, CPointer<COpaquePointerVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int, CPointer<ByteVar>?, CPointer<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>>?, CPointer<COpaquePointerVar>?) -> Int>>>(144).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int, CPointer<ByteVar>?, CPointer<CPointerVar<CFunction<(CPointer<sqlite3_context>?, Int, CPointer<CPointerVar<sqlite3_value>>?) -> Unit>>>?, CPointer<COpaquePointerVar>?) -> Int>>>(144).value = value }
    
    var xRename: CPointer<CFunction<(CPointer<sqlite3_vtab>?, CPointer<ByteVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, CPointer<ByteVar>?) -> Int>>>(152).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, CPointer<ByteVar>?) -> Int>>>(152).value = value }
    
    var xSavepoint: CPointer<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>>(160).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>>(160).value = value }
    
    var xRelease: CPointer<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>>(168).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>>(168).value = value }
    
    var xRollbackTo: CPointer<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>>(176).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_vtab>?, Int) -> Int>>>(176).value = value }
    
}

class sqlite3_index_info(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var nConstraint: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var aConstraint: CPointer<sqlite3_index_constraint>?
        get() = memberAt<CPointerVar<sqlite3_index_constraint>>(8).value
        set(value) { memberAt<CPointerVar<sqlite3_index_constraint>>(8).value = value }
    
    var nOrderBy: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var aOrderBy: CPointer<sqlite3_index_orderby>?
        get() = memberAt<CPointerVar<sqlite3_index_orderby>>(24).value
        set(value) { memberAt<CPointerVar<sqlite3_index_orderby>>(24).value = value }
    
    var aConstraintUsage: CPointer<sqlite3_index_constraint_usage>?
        get() = memberAt<CPointerVar<sqlite3_index_constraint_usage>>(32).value
        set(value) { memberAt<CPointerVar<sqlite3_index_constraint_usage>>(32).value = value }
    
    var idxNum: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var idxStr: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(48).value
        set(value) { memberAt<CPointerVar<ByteVar>>(48).value = value }
    
    var needToFreeIdxStr: Int
        get() = memberAt<IntVar>(56).value
        set(value) { memberAt<IntVar>(56).value = value }
    
    var orderByConsumed: Int
        get() = memberAt<IntVar>(60).value
        set(value) { memberAt<IntVar>(60).value = value }
    
    var estimatedCost: Double
        get() = memberAt<DoubleVar>(64).value
        set(value) { memberAt<DoubleVar>(64).value = value }
    
}

class sqlite3_index_constraint(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var iColumn: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var op: UByte
        get() = memberAt<UByteVar>(4).value
        set(value) { memberAt<UByteVar>(4).value = value }
    
    var usable: UByte
        get() = memberAt<UByteVar>(5).value
        set(value) { memberAt<UByteVar>(5).value = value }
    
    var iTermOffset: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class sqlite3_index_orderby(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var iColumn: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var desc: UByte
        get() = memberAt<UByteVar>(4).value
        set(value) { memberAt<UByteVar>(4).value = value }
    
}

class sqlite3_index_constraint_usage(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var argvIndex: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var omit: UByte
        get() = memberAt<UByteVar>(4).value
        set(value) { memberAt<UByteVar>(4).value = value }
    
}

class sqlite3_vtab_cursor(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var pVtab: CPointer<sqlite3_vtab>?
        get() = memberAt<CPointerVar<sqlite3_vtab>>(0).value
        set(value) { memberAt<CPointerVar<sqlite3_vtab>>(0).value = value }
    
}


class sqlite3_mutex_methods(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var xMutexInit: CPointer<CFunction<() -> Int>>?
        get() = memberAt<CPointerVar<CFunction<() -> Int>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<() -> Int>>>(0).value = value }
    
    var xMutexEnd: CPointer<CFunction<() -> Int>>?
        get() = memberAt<CPointerVar<CFunction<() -> Int>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<() -> Int>>>(8).value = value }
    
    var xMutexAlloc: CPointer<CFunction<(Int) -> CPointer<sqlite3_mutex>?>>?
        get() = memberAt<CPointerVar<CFunction<(Int) -> CPointer<sqlite3_mutex>?>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(Int) -> CPointer<sqlite3_mutex>?>>>(16).value = value }
    
    var xMutexFree: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(24).value = value }
    
    var xMutexEnter: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(32).value = value }
    
    var xMutexTry: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(40).value = value }
    
    var xMutexLeave: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Unit>>>(48).value = value }
    
    var xMutexHeld: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(56).value = value }
    
    var xMutexNotheld: CPointer<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_mutex>?) -> Int>>>(64).value = value }
    
}


class sqlite3_pcache_methods(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(88, 8)
    
    var pArg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var xInit: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(8).value = value }
    
    var xShutdown: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value = value }
    
    var xCreate: CPointer<CFunction<(Int, Int) -> CPointer<sqlite3_pcache>?>>?
        get() = memberAt<CPointerVar<CFunction<(Int, Int) -> CPointer<sqlite3_pcache>?>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(Int, Int) -> CPointer<sqlite3_pcache>?>>>(24).value = value }
    
    var xCachesize: CPointer<CFunction<(CPointer<sqlite3_pcache>?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, Int) -> Unit>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, Int) -> Unit>>>(32).value = value }
    
    var xPagecount: CPointer<CFunction<(CPointer<sqlite3_pcache>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Int>>>(40).value = value }
    
    var xFetch: CPointer<CFunction<(CPointer<sqlite3_pcache>?, UInt, Int) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, UInt, Int) -> COpaquePointer?>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, UInt, Int) -> COpaquePointer?>>>(48).value = value }
    
    var xUnpin: CPointer<CFunction<(CPointer<sqlite3_pcache>?, COpaquePointer?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, COpaquePointer?, Int) -> Unit>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, COpaquePointer?, Int) -> Unit>>>(56).value = value }
    
    var xRekey: CPointer<CFunction<(CPointer<sqlite3_pcache>?, COpaquePointer?, UInt, UInt) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, COpaquePointer?, UInt, UInt) -> Unit>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, COpaquePointer?, UInt, UInt) -> Unit>>>(64).value = value }
    
    var xTruncate: CPointer<CFunction<(CPointer<sqlite3_pcache>?, UInt) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, UInt) -> Unit>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?, UInt) -> Unit>>>(72).value = value }
    
    var xDestroy: CPointer<CFunction<(CPointer<sqlite3_pcache>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Unit>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<sqlite3_pcache>?) -> Unit>>>(80).value = value }
    
}


class sqlite3_rtree_geometry(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var pContext: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var nParam: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var aParam: CPointer<DoubleVar>?
        get() = memberAt<CPointerVar<DoubleVar>>(16).value
        set(value) { memberAt<CPointerVar<DoubleVar>>(16).value = value }
    
    var pUser: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(24).value
        set(value) { memberAt<COpaquePointerVar>(24).value = value }
    
    var xDelUser: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(32).value = value }
    
}

typealias sqlite_int64Var = LongVarOf<sqlite_int64>
typealias sqlite_int64 = Long

typealias sqlite_uint64Var = ULongVarOf<sqlite_uint64>
typealias sqlite_uint64 = ULong

typealias sqlite3_int64Var = LongVarOf<sqlite3_int64>
typealias sqlite3_int64 = sqlite_int64

typealias sqlite3_uint64Var = ULongVarOf<sqlite3_uint64>
typealias sqlite3_uint64 = sqlite_uint64

typealias sqlite3_callbackVar = CPointerVarOf<sqlite3_callback>
typealias sqlite3_callback = CPointer<CFunction<(COpaquePointer?, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>

typealias sqlite3_syscall_ptrVar = CPointerVarOf<sqlite3_syscall_ptr>
typealias sqlite3_syscall_ptr = CPointer<CFunction<() -> Unit>>

typealias sqlite3_value = Mem

typealias sqlite3_destructor_typeVar = CPointerVarOf<sqlite3_destructor_type>
typealias sqlite3_destructor_type = CPointer<CFunction<(COpaquePointer?) -> Unit>>

@SymbolName("sqlite3_kniBridge0")
private external fun kniBridge0(): NativePtr
@SymbolName("sqlite3_kniBridge1")
private external fun kniBridge1(): NativePtr
@SymbolName("sqlite3_kniBridge2")
private external fun kniBridge2(): Int
@SymbolName("sqlite3_kniBridge3")
private external fun kniBridge3(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge4")
private external fun kniBridge4(p0: Int): NativePtr
@SymbolName("sqlite3_kniBridge5")
private external fun kniBridge5(): Int
@SymbolName("sqlite3_kniBridge6")
private external fun kniBridge6(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sqlite3_kniBridge8")
private external fun kniBridge8(): Int
@SymbolName("sqlite3_kniBridge9")
private external fun kniBridge9(): Int
@SymbolName("sqlite3_kniBridge10")
private external fun kniBridge10(): Int
@SymbolName("sqlite3_kniBridge11")
private external fun kniBridge11(): Int
@SymbolName("sqlite3_kniBridge12")
private external fun kniBridge12(): NativePtr
@SymbolName("sqlite3_kniBridge13")
private external fun kniBridge13(): NativePtr
@SymbolName("sqlite3_kniBridge14")
private external fun kniBridge14(p0: NativePtr, p1: Int): Int
@SymbolName("sqlite3_kniBridge15")
private external fun kniBridge15(p0: NativePtr): Long
@SymbolName("sqlite3_kniBridge16")
private external fun kniBridge16(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge17")
private external fun kniBridge17(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge18")
private external fun kniBridge18(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge19")
private external fun kniBridge19(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge20")
private external fun kniBridge20(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge21")
private external fun kniBridge21(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sqlite3_kniBridge22")
private external fun kniBridge22(p0: NativePtr, p1: Int): Int
@SymbolName("sqlite3_kniBridge23")
private external fun kniBridge23(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Int
@SymbolName("sqlite3_kniBridge24")
private external fun kniBridge24(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge25")
private external fun kniBridge25(): NativePtr
@SymbolName("sqlite3_kniBridge26")
private external fun kniBridge26(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge27")
private external fun kniBridge27(): NativePtr
@SymbolName("sqlite3_kniBridge28")
private external fun kniBridge28(p0: Int, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge29")
private external fun kniBridge29(p0: Int): NativePtr
@SymbolName("sqlite3_kniBridge30")
private external fun kniBridge30(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge31")
private external fun kniBridge31(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge32")
private external fun kniBridge32(): Long
@SymbolName("sqlite3_kniBridge33")
private external fun kniBridge33(p0: Int): Long
@SymbolName("sqlite3_kniBridge34")
private external fun kniBridge34(p0: Int, p1: NativePtr): Unit
@SymbolName("sqlite3_kniBridge35")
private external fun kniBridge35(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sqlite3_kniBridge36")
private external fun kniBridge36(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge37")
private external fun kniBridge37(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge38")
private external fun kniBridge38(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("sqlite3_kniBridge39")
private external fun kniBridge39(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sqlite3_kniBridge40")
private external fun kniBridge40(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sqlite3_kniBridge41")
private external fun kniBridge41(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("sqlite3_kniBridge42")
private external fun kniBridge42(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge43")
private external fun kniBridge43(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge44")
private external fun kniBridge44(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge45")
private external fun kniBridge45(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge46")
private external fun kniBridge46(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("sqlite3_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sqlite3_kniBridge49")
private external fun kniBridge49(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sqlite3_kniBridge50")
private external fun kniBridge50(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sqlite3_kniBridge51")
private external fun kniBridge51(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sqlite3_kniBridge52")
private external fun kniBridge52(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge53")
private external fun kniBridge53(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge54")
private external fun kniBridge54(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int, p4: NativePtr): Int
@SymbolName("sqlite3_kniBridge55")
private external fun kniBridge55(p0: NativePtr, p1: Int, p2: Double): Int
@SymbolName("sqlite3_kniBridge56")
private external fun kniBridge56(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("sqlite3_kniBridge57")
private external fun kniBridge57(p0: NativePtr, p1: Int, p2: Long): Int
@SymbolName("sqlite3_kniBridge58")
private external fun kniBridge58(p0: NativePtr, p1: Int): Int
@SymbolName("sqlite3_kniBridge59")
private external fun kniBridge59(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int, p4: NativePtr): Int
@SymbolName("sqlite3_kniBridge60")
private external fun kniBridge60(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int, p4: NativePtr): Int
@SymbolName("sqlite3_kniBridge61")
private external fun kniBridge61(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("sqlite3_kniBridge62")
private external fun kniBridge62(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("sqlite3_kniBridge63")
private external fun kniBridge63(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge64")
private external fun kniBridge64(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge65")
private external fun kniBridge65(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sqlite3_kniBridge66")
private external fun kniBridge66(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge67")
private external fun kniBridge67(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge68")
private external fun kniBridge68(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge69")
private external fun kniBridge69(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge70")
private external fun kniBridge70(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge71")
private external fun kniBridge71(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge72")
private external fun kniBridge72(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge73")
private external fun kniBridge73(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge74")
private external fun kniBridge74(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge75")
private external fun kniBridge75(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge76")
private external fun kniBridge76(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge77")
private external fun kniBridge77(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge78")
private external fun kniBridge78(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge79")
private external fun kniBridge79(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge80")
private external fun kniBridge80(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge81")
private external fun kniBridge81(p0: NativePtr, p1: Int): Int
@SymbolName("sqlite3_kniBridge82")
private external fun kniBridge82(p0: NativePtr, p1: Int): Int
@SymbolName("sqlite3_kniBridge83")
private external fun kniBridge83(p0: NativePtr, p1: Int): Double
@SymbolName("sqlite3_kniBridge84")
private external fun kniBridge84(p0: NativePtr, p1: Int): Int
@SymbolName("sqlite3_kniBridge85")
private external fun kniBridge85(p0: NativePtr, p1: Int): Long
@SymbolName("sqlite3_kniBridge86")
private external fun kniBridge86(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge87")
private external fun kniBridge87(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge88")
private external fun kniBridge88(p0: NativePtr, p1: Int): Int
@SymbolName("sqlite3_kniBridge89")
private external fun kniBridge89(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge90")
private external fun kniBridge90(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge91")
private external fun kniBridge91(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge92")
private external fun kniBridge92(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr): Int
@SymbolName("sqlite3_kniBridge93")
private external fun kniBridge93(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr): Int
@SymbolName("sqlite3_kniBridge94")
private external fun kniBridge94(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr, p8: NativePtr): Int
@SymbolName("sqlite3_kniBridge95")
private external fun kniBridge95(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge96")
private external fun kniBridge96(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge97")
private external fun kniBridge97(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sqlite3_kniBridge98")
private external fun kniBridge98(): Int
@SymbolName("sqlite3_kniBridge99")
private external fun kniBridge99(): Unit
@SymbolName("sqlite3_kniBridge100")
private external fun kniBridge100(p0: NativePtr, p1: NativePtr, p2: Long): Int
@SymbolName("sqlite3_kniBridge101")
private external fun kniBridge101(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge102")
private external fun kniBridge102(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge103")
private external fun kniBridge103(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge104")
private external fun kniBridge104(p0: NativePtr): Double
@SymbolName("sqlite3_kniBridge105")
private external fun kniBridge105(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge106")
private external fun kniBridge106(p0: NativePtr): Long
@SymbolName("sqlite3_kniBridge107")
private external fun kniBridge107(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge108")
private external fun kniBridge108(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge109")
private external fun kniBridge109(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge110")
private external fun kniBridge110(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge111")
private external fun kniBridge111(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge112")
private external fun kniBridge112(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge113")
private external fun kniBridge113(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge114")
private external fun kniBridge114(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge115")
private external fun kniBridge115(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge116")
private external fun kniBridge116(p0: NativePtr, p1: Int): NativePtr
@SymbolName("sqlite3_kniBridge117")
private external fun kniBridge117(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("sqlite3_kniBridge118")
private external fun kniBridge118(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Unit
@SymbolName("sqlite3_kniBridge119")
private external fun kniBridge119(p0: NativePtr, p1: Double): Unit
@SymbolName("sqlite3_kniBridge120")
private external fun kniBridge120(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("sqlite3_kniBridge121")
private external fun kniBridge121(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("sqlite3_kniBridge122")
private external fun kniBridge122(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge123")
private external fun kniBridge123(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge124")
private external fun kniBridge124(p0: NativePtr, p1: Int): Unit
@SymbolName("sqlite3_kniBridge125")
private external fun kniBridge125(p0: NativePtr, p1: Int): Unit
@SymbolName("sqlite3_kniBridge126")
private external fun kniBridge126(p0: NativePtr, p1: Long): Unit
@SymbolName("sqlite3_kniBridge127")
private external fun kniBridge127(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge128")
private external fun kniBridge128(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Unit
@SymbolName("sqlite3_kniBridge129")
private external fun kniBridge129(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Unit
@SymbolName("sqlite3_kniBridge130")
private external fun kniBridge130(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Unit
@SymbolName("sqlite3_kniBridge131")
private external fun kniBridge131(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Unit
@SymbolName("sqlite3_kniBridge132")
private external fun kniBridge132(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sqlite3_kniBridge133")
private external fun kniBridge133(p0: NativePtr, p1: Int): Unit
@SymbolName("sqlite3_kniBridge134")
private external fun kniBridge134(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sqlite3_kniBridge135")
private external fun kniBridge135(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr, p5: NativePtr): Int
@SymbolName("sqlite3_kniBridge136")
private external fun kniBridge136(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sqlite3_kniBridge137")
private external fun kniBridge137(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sqlite3_kniBridge138")
private external fun kniBridge138(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sqlite3_kniBridge139")
private external fun kniBridge139(p0: Int): Int
@SymbolName("sqlite3_kniBridge140")
private external fun kniBridge140(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge141")
private external fun kniBridge141(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge142")
private external fun kniBridge142(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge143")
private external fun kniBridge143(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge144")
private external fun kniBridge144(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge145")
private external fun kniBridge145(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge146")
private external fun kniBridge146(p0: Int): Int
@SymbolName("sqlite3_kniBridge147")
private external fun kniBridge147(p0: Int): Int
@SymbolName("sqlite3_kniBridge148")
private external fun kniBridge148(p0: Long): Long
@SymbolName("sqlite3_kniBridge149")
private external fun kniBridge149(p0: Int): Unit
@SymbolName("sqlite3_kniBridge150")
private external fun kniBridge150(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr, p8: NativePtr): Int
@SymbolName("sqlite3_kniBridge151")
private external fun kniBridge151(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sqlite3_kniBridge152")
private external fun kniBridge152(p0: NativePtr, p1: Int): Int
@SymbolName("sqlite3_kniBridge153")
private external fun kniBridge153(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge154")
private external fun kniBridge154(): Unit
@SymbolName("sqlite3_kniBridge155")
private external fun kniBridge155(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sqlite3_kniBridge156")
private external fun kniBridge156(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sqlite3_kniBridge157")
private external fun kniBridge157(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sqlite3_kniBridge158")
private external fun kniBridge158(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sqlite3_kniBridge159")
private external fun kniBridge159(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Long, p5: Int, p6: NativePtr): Int
@SymbolName("sqlite3_kniBridge160")
private external fun kniBridge160(p0: NativePtr, p1: Long): Int
@SymbolName("sqlite3_kniBridge161")
private external fun kniBridge161(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge162")
private external fun kniBridge162(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge163")
private external fun kniBridge163(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int): Int
@SymbolName("sqlite3_kniBridge164")
private external fun kniBridge164(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int): Int
@SymbolName("sqlite3_kniBridge165")
private external fun kniBridge165(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge166")
private external fun kniBridge166(p0: NativePtr, p1: Int): Int
@SymbolName("sqlite3_kniBridge167")
private external fun kniBridge167(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge168")
private external fun kniBridge168(p0: Int): NativePtr
@SymbolName("sqlite3_kniBridge169")
private external fun kniBridge169(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge170")
private external fun kniBridge170(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge171")
private external fun kniBridge171(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge172")
private external fun kniBridge172(p0: NativePtr): Unit
@SymbolName("sqlite3_kniBridge173")
private external fun kniBridge173(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge174")
private external fun kniBridge174(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge175")
private external fun kniBridge175(p0: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge176")
private external fun kniBridge176(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("sqlite3_kniBridge177")
private external fun kniBridge177(): NativePtr
@SymbolName("sqlite3_kniBridge178")
private external fun kniBridge178(p0: Int, p1: NativePtr, p2: NativePtr, p3: Int): Int
@SymbolName("sqlite3_kniBridge179")
private external fun kniBridge179(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr, p4: Int): Int
@SymbolName("sqlite3_kniBridge180")
private external fun kniBridge180(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("sqlite3_kniBridge181")
private external fun kniBridge181(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge182")
private external fun kniBridge182(p0: NativePtr, p1: Int): Int
@SymbolName("sqlite3_kniBridge183")
private external fun kniBridge183(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge184")
private external fun kniBridge184(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge185")
private external fun kniBridge185(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge186")
private external fun kniBridge186(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sqlite3_kniBridge187")
private external fun kniBridge187(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("sqlite3_kniBridge188")
private external fun kniBridge188(): NativePtr
@SymbolName("sqlite3_kniBridge189")
private external fun kniBridge189(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sqlite3_kniBridge190")
private external fun kniBridge190(p0: NativePtr, p1: Int): Int
@SymbolName("sqlite3_kniBridge191")
private external fun kniBridge191(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sqlite3_kniBridge192")
private external fun kniBridge192(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr): Int
@SymbolName("sqlite3_kniBridge193")
private external fun kniBridge193(): NativePtr
@SymbolName("sqlite3_kniBridge194")
private external fun kniBridge194(p0: NativePtr): Int
@SymbolName("sqlite3_kniBridge195")
private external fun kniBridge195(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("sqlite3_kniBridge196")
private external fun kniBridge196(): NativePtr
@SymbolName("sqlite3_kniBridge197")
private external fun kniBridge197(): NativePtr
@SymbolName("sqlite3_kniBridge198")
private external fun kniBridge198(): NativePtr
@SymbolName("sqlite3_kniBridge199")
private external fun kniBridge199(): NativePtr
@SymbolName("sqlite3_kniBridge200")
private external fun kniBridge200(p0: NativePtr): Unit
