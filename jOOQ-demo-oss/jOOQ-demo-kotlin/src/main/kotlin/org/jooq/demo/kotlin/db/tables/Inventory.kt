/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


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
import org.jooq.Row4
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.indexes.IDX_STORE_ID_FILM_ID
import org.jooq.demo.kotlin.db.keys.INVENTORY_PKEY
import org.jooq.demo.kotlin.db.keys.INVENTORY__INVENTORY_FILM_ID_FKEY
import org.jooq.demo.kotlin.db.keys.INVENTORY__INVENTORY_STORE_ID_FKEY
import org.jooq.demo.kotlin.db.tables.records.InventoryRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Inventory(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, InventoryRecord>?,
    aliased: Table<InventoryRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<InventoryRecord>(
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
         * The reference instance of <code>public.inventory</code>
         */
        val INVENTORY: Inventory = Inventory()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InventoryRecord> = InventoryRecord::class.java

    /**
     * The column <code>public.inventory.inventory_id</code>.
     */
    val INVENTORY_ID: TableField<InventoryRecord, Long?> = createField(DSL.name("inventory_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.inventory.film_id</code>.
     */
    val FILM_ID: TableField<InventoryRecord, Long?> = createField(DSL.name("film_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.inventory.store_id</code>.
     */
    val STORE_ID: TableField<InventoryRecord, Long?> = createField(DSL.name("store_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.inventory.last_update</code>.
     */
    val LAST_UPDATE: TableField<InventoryRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<InventoryRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<InventoryRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.inventory</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.inventory</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.inventory</code> table reference
     */
    constructor(): this(DSL.name("inventory"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, InventoryRecord>): this(Internal.createPathAlias(child, key), child, key, INVENTORY, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIndexes(): List<Index> = listOf(IDX_STORE_ID_FILM_ID)
    override fun getIdentity(): Identity<InventoryRecord, Long?> = super.getIdentity() as Identity<InventoryRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<InventoryRecord> = INVENTORY_PKEY
    override fun getReferences(): List<ForeignKey<InventoryRecord, *>> = listOf(INVENTORY__INVENTORY_FILM_ID_FKEY, INVENTORY__INVENTORY_STORE_ID_FKEY)

    private lateinit var _film: Film
    private lateinit var _store: Store

    /**
     * Get the implicit join path to the <code>public.film</code> table.
     */
    fun film(): Film {
        if (!this::_film.isInitialized)
            _film = Film(this, INVENTORY__INVENTORY_FILM_ID_FKEY)

        return _film;
    }

    val film: Film
        get(): Film = film()

    /**
     * Get the implicit join path to the <code>public.store</code> table.
     */
    fun store(): Store {
        if (!this::_store.isInitialized)
            _store = Store(this, INVENTORY__INVENTORY_STORE_ID_FKEY)

        return _store;
    }

    val store: Store
        get(): Store = store()
    override fun `as`(alias: String): Inventory = Inventory(DSL.name(alias), this)
    override fun `as`(alias: Name): Inventory = Inventory(alias, this)
    override fun `as`(alias: Table<*>): Inventory = Inventory(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Inventory = Inventory(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Inventory = Inventory(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Inventory = Inventory(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<Long?, Long?, Long?, LocalDateTime?> = super.fieldsRow() as Row4<Long?, Long?, Long?, LocalDateTime?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, Long?, Long?, LocalDateTime?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, Long?, Long?, LocalDateTime?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
