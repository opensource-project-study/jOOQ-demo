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
import org.jooq.Row6
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.indexes.IDX_FK_CUSTOMER_ID
import org.jooq.demo.kotlin.db.indexes.IDX_FK_STAFF_ID
import org.jooq.demo.kotlin.db.keys.PAYMENT_PKEY
import org.jooq.demo.kotlin.db.keys.PAYMENT__PAYMENT_CUSTOMER_ID_FKEY
import org.jooq.demo.kotlin.db.keys.PAYMENT__PAYMENT_RENTAL_ID_FKEY
import org.jooq.demo.kotlin.db.keys.PAYMENT__PAYMENT_STAFF_ID_FKEY
import org.jooq.demo.kotlin.db.tables.records.PaymentRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Payment(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, PaymentRecord>?,
    aliased: Table<PaymentRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<PaymentRecord>(
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
         * The reference instance of <code>public.payment</code>
         */
        val PAYMENT: Payment = Payment()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PaymentRecord> = PaymentRecord::class.java

    /**
     * The column <code>public.payment.payment_id</code>.
     */
    val PAYMENT_ID: TableField<PaymentRecord, Long?> = createField(DSL.name("payment_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.payment.customer_id</code>.
     */
    val CUSTOMER_ID: TableField<PaymentRecord, Long?> = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.payment.staff_id</code>.
     */
    val STAFF_ID: TableField<PaymentRecord, Long?> = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.payment.rental_id</code>.
     */
    val RENTAL_ID: TableField<PaymentRecord, Long?> = createField(DSL.name("rental_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.payment.amount</code>.
     */
    val AMOUNT: TableField<PaymentRecord, BigDecimal?> = createField(DSL.name("amount"), SQLDataType.NUMERIC(5, 2).nullable(false), this, "")

    /**
     * The column <code>public.payment.payment_date</code>.
     */
    val PAYMENT_DATE: TableField<PaymentRecord, LocalDateTime?> = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PaymentRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<PaymentRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.payment</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.payment</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.payment</code> table reference
     */
    constructor(): this(DSL.name("payment"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, PaymentRecord>): this(Internal.createPathAlias(child, key), child, key, PAYMENT, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIndexes(): List<Index> = listOf(IDX_FK_CUSTOMER_ID, IDX_FK_STAFF_ID)
    override fun getIdentity(): Identity<PaymentRecord, Long?> = super.getIdentity() as Identity<PaymentRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<PaymentRecord> = PAYMENT_PKEY
    override fun getReferences(): List<ForeignKey<PaymentRecord, *>> = listOf(PAYMENT__PAYMENT_CUSTOMER_ID_FKEY, PAYMENT__PAYMENT_STAFF_ID_FKEY, PAYMENT__PAYMENT_RENTAL_ID_FKEY)

    private lateinit var _customer: Customer
    private lateinit var _staff: Staff
    private lateinit var _rental: Rental

    /**
     * Get the implicit join path to the <code>public.customer</code> table.
     */
    fun customer(): Customer {
        if (!this::_customer.isInitialized)
            _customer = Customer(this, PAYMENT__PAYMENT_CUSTOMER_ID_FKEY)

        return _customer;
    }

    val customer: Customer
        get(): Customer = customer()

    /**
     * Get the implicit join path to the <code>public.staff</code> table.
     */
    fun staff(): Staff {
        if (!this::_staff.isInitialized)
            _staff = Staff(this, PAYMENT__PAYMENT_STAFF_ID_FKEY)

        return _staff;
    }

    val staff: Staff
        get(): Staff = staff()

    /**
     * Get the implicit join path to the <code>public.rental</code> table.
     */
    fun rental(): Rental {
        if (!this::_rental.isInitialized)
            _rental = Rental(this, PAYMENT__PAYMENT_RENTAL_ID_FKEY)

        return _rental;
    }

    val rental: Rental
        get(): Rental = rental()
    override fun `as`(alias: String): Payment = Payment(DSL.name(alias), this)
    override fun `as`(alias: Name): Payment = Payment(alias, this)
    override fun `as`(alias: Table<*>): Payment = Payment(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Payment = Payment(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Payment = Payment(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Payment = Payment(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<Long?, Long?, Long?, Long?, BigDecimal?, LocalDateTime?> = super.fieldsRow() as Row6<Long?, Long?, Long?, Long?, BigDecimal?, LocalDateTime?>

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, Long?, Long?, Long?, BigDecimal?, LocalDateTime?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, Long?, Long?, Long?, BigDecimal?, LocalDateTime?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
