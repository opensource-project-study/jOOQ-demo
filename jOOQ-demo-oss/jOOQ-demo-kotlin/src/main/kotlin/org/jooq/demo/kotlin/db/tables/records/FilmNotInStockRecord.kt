/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import org.jooq.Field
import org.jooq.Record1
import org.jooq.Row1
import org.jooq.demo.kotlin.db.tables.FilmNotInStock
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FilmNotInStockRecord() : TableRecordImpl<FilmNotInStockRecord>(FilmNotInStock.FILM_NOT_IN_STOCK), Record1<Int?> {

    open var pFilmCount: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    public override fun fieldsRow(): Row1<Int?> = super.fieldsRow() as Row1<Int?>
    public override fun valuesRow(): Row1<Int?> = super.valuesRow() as Row1<Int?>
    public override fun field1(): Field<Int?> = FilmNotInStock.FILM_NOT_IN_STOCK.P_FILM_COUNT
    public override fun component1(): Int? = pFilmCount
    public override fun value1(): Int? = pFilmCount

    public override fun value1(value: Int?): FilmNotInStockRecord {
        set(0, value)
        return this
    }

    public override fun values(value1: Int?): FilmNotInStockRecord {
        this.value1(value1)
        return this
    }

    /**
     * Create a detached, initialised FilmNotInStockRecord
     */
    constructor(pFilmCount: Int? = null): this() {
        this.pFilmCount = pFilmCount
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised FilmNotInStockRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.FilmNotInStock?): this() {
        if (value != null) {
            this.pFilmCount = value.pFilmCount
            resetChangedOnNotNull()
        }
    }
}
