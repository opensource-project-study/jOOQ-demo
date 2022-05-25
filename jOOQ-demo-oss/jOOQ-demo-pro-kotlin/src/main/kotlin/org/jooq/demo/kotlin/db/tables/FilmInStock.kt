/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


import java.util.function.Function

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row1
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.tables.records.FilmInStockRecord
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FilmInStock(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, FilmInStockRecord>?,
    aliased: Table<FilmInStockRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<FilmInStockRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.function()
) {
    companion object {

        /**
         * The reference instance of <code>public.film_in_stock</code>
         */
        val FILM_IN_STOCK: FilmInStock = FilmInStock()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<FilmInStockRecord> = FilmInStockRecord::class.java

    /**
     * The column <code>public.film_in_stock.p_film_count</code>.
     */
    val P_FILM_COUNT: TableField<FilmInStockRecord, Int?> = createField(DSL.name("p_film_count"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<FilmInStockRecord>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.BIGINT),
        DSL.value(null, SQLDataType.BIGINT)
    ))
    private constructor(alias: Name, aliased: Table<FilmInStockRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.film_in_stock</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.film_in_stock</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.film_in_stock</code> table reference
     */
    constructor(): this(DSL.name("film_in_stock"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): FilmInStock = FilmInStock(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): FilmInStock = FilmInStock(alias, this, parameters)
    override fun `as`(alias: Table<*>): FilmInStock = FilmInStock(alias.getQualifiedName(), this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): FilmInStock = FilmInStock(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): FilmInStock = FilmInStock(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): FilmInStock = FilmInStock(name.getQualifiedName(), null, parameters)

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row1<Int?> = super.fieldsRow() as Row1<Int?>

    /**
     * Call this table-valued function
     */
    fun call(
          pFilmId: Long?
        , pStoreId: Long?
    ): FilmInStock = FilmInStock(DSL.name("film_in_stock"), null, arrayOf(
        DSL.value(pFilmId, SQLDataType.BIGINT),
        DSL.value(pStoreId, SQLDataType.BIGINT)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          pFilmId: Field<Long?>
        , pStoreId: Field<Long?>
    ): FilmInStock = FilmInStock(DSL.name("film_in_stock"), null, arrayOf(
        pFilmId,
        pStoreId
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    fun <U> mapping(from: (Int?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Int?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
