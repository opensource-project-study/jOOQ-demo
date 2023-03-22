/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.function.Function

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row14
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.enums.MpaaRating
import org.jooq.demo.kotlin.db.indexes.FILM_FULLTEXT_IDX
import org.jooq.demo.kotlin.db.indexes.IDX_FK_LANGUAGE_ID
import org.jooq.demo.kotlin.db.indexes.IDX_FK_ORIGINAL_LANGUAGE_ID
import org.jooq.demo.kotlin.db.indexes.IDX_TITLE
import org.jooq.demo.kotlin.db.keys.FILM_PKEY
import org.jooq.demo.kotlin.db.keys.FILM__FILM_LANGUAGE_ID_FKEY
import org.jooq.demo.kotlin.db.keys.FILM__FILM_ORIGINAL_LANGUAGE_ID_FKEY
import org.jooq.demo.kotlin.db.tables.records.FilmRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Film(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, FilmRecord>?,
    aliased: Table<FilmRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<FilmRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.film</code>
         */
        val FILM: Film = Film()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<FilmRecord> = FilmRecord::class.java

    /**
     * The column <code>public.film.film_id</code>.
     */
    val FILM_ID: TableField<FilmRecord, Long?> = createField(DSL.name("film_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.film.title</code>.
     */
    val TITLE: TableField<FilmRecord, String?> = createField(DSL.name("title"), SQLDataType.VARCHAR(255).nullable(false), this, "")

    /**
     * The column <code>public.film.description</code>.
     */
    val DESCRIPTION: TableField<FilmRecord, String?> = createField(DSL.name("description"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>public.film.release_year</code>.
     */
    val RELEASE_YEAR: TableField<FilmRecord, Int?> = createField(DSL.name("release_year"), org.jooq.demo.kotlin.db.domains.YEAR.getDataType(), this, "")

    /**
     * The column <code>public.film.language_id</code>.
     */
    val LANGUAGE_ID: TableField<FilmRecord, Long?> = createField(DSL.name("language_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.film.original_language_id</code>.
     */
    val ORIGINAL_LANGUAGE_ID: TableField<FilmRecord, Long?> = createField(DSL.name("original_language_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.film.rental_duration</code>.
     */
    val RENTAL_DURATION: TableField<FilmRecord, Short?> = createField(DSL.name("rental_duration"), SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.field("3", SQLDataType.SMALLINT)), this, "")

    /**
     * The column <code>public.film.rental_rate</code>.
     */
    val RENTAL_RATE: TableField<FilmRecord, BigDecimal?> = createField(DSL.name("rental_rate"), SQLDataType.NUMERIC(4, 2).nullable(false).defaultValue(DSL.field("4.99", SQLDataType.NUMERIC)), this, "")

    /**
     * The column <code>public.film.length</code>.
     */
    val LENGTH: TableField<FilmRecord, Short?> = createField(DSL.name("length"), SQLDataType.SMALLINT, this, "")

    /**
     * The column <code>public.film.replacement_cost</code>.
     */
    val REPLACEMENT_COST: TableField<FilmRecord, BigDecimal?> = createField(DSL.name("replacement_cost"), SQLDataType.NUMERIC(5, 2).nullable(false).defaultValue(DSL.field("19.99", SQLDataType.NUMERIC)), this, "")

    /**
     * The column <code>public.film.rating</code>.
     */
    val RATING: TableField<FilmRecord, MpaaRating?> = createField(DSL.name("rating"), SQLDataType.VARCHAR.defaultValue(DSL.field("'G'::mpaa_rating", SQLDataType.VARCHAR)).asEnumDataType(org.jooq.demo.kotlin.db.enums.MpaaRating::class.java), this, "")

    /**
     * The column <code>public.film.last_update</code>.
     */
    val LAST_UPDATE: TableField<FilmRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).readonly(true).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>public.film.special_features</code>.
     */
    val SPECIAL_FEATURES: TableField<FilmRecord, Array<String?>?> = createField(DSL.name("special_features"), SQLDataType.CLOB.getArrayDataType(), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val FULLTEXT: TableField<FilmRecord, Any?> = createField(DSL.name("fulltext"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\"").nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<FilmRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<FilmRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.film</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.film</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.film</code> table reference
     */
    constructor(): this(DSL.name("film"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, FilmRecord>): this(Internal.createPathAlias(child, key), child, key, FILM, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIndexes(): List<Index> = listOf(FILM_FULLTEXT_IDX, IDX_FK_LANGUAGE_ID, IDX_FK_ORIGINAL_LANGUAGE_ID, IDX_TITLE)
    override fun getIdentity(): Identity<FilmRecord, Long?> = super.getIdentity() as Identity<FilmRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<FilmRecord> = FILM_PKEY
    override fun getReferences(): List<ForeignKey<FilmRecord, *>> = listOf(FILM__FILM_LANGUAGE_ID_FKEY, FILM__FILM_ORIGINAL_LANGUAGE_ID_FKEY)

    private lateinit var _filmLanguageIdFkey: Language
    private lateinit var _filmOriginalLanguageIdFkey: Language

    /**
     * Get the implicit join path to the <code>public.language</code> table, via
     * the <code>film_language_id_fkey</code> key.
     */
    fun filmLanguageIdFkey(): Language {
        if (!this::_filmLanguageIdFkey.isInitialized)
            _filmLanguageIdFkey = Language(this, FILM__FILM_LANGUAGE_ID_FKEY)

        return _filmLanguageIdFkey;
    }

    val filmLanguageIdFkey: Language
        get(): Language = filmLanguageIdFkey()

    /**
     * Get the implicit join path to the <code>public.language</code> table, via
     * the <code>film_original_language_id_fkey</code> key.
     */
    fun filmOriginalLanguageIdFkey(): Language {
        if (!this::_filmOriginalLanguageIdFkey.isInitialized)
            _filmOriginalLanguageIdFkey = Language(this, FILM__FILM_ORIGINAL_LANGUAGE_ID_FKEY)

        return _filmOriginalLanguageIdFkey;
    }

    val filmOriginalLanguageIdFkey: Language
        get(): Language = filmOriginalLanguageIdFkey()
    override fun `as`(alias: String): Film = Film(DSL.name(alias), this)
    override fun `as`(alias: Name): Film = Film(alias, this)
    override fun `as`(alias: Table<*>): Film = Film(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Film = Film(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Film = Film(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Film = Film(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row14<Long?, String?, String?, Int?, Long?, Long?, Short?, BigDecimal?, Short?, BigDecimal?, MpaaRating?, LocalDateTime?, Array<String?>?, Any?> = super.fieldsRow() as Row14<Long?, String?, String?, Int?, Long?, Long?, Short?, BigDecimal?, Short?, BigDecimal?, MpaaRating?, LocalDateTime?, Array<String?>?, Any?>

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, String?, String?, Int?, Long?, Long?, Short?, BigDecimal?, Short?, BigDecimal?, MpaaRating?, LocalDateTime?, Array<String?>?, Any?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, String?, String?, Int?, Long?, Long?, Short?, BigDecimal?, Short?, BigDecimal?, MpaaRating?, LocalDateTime?, Array<String?>?, Any?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
