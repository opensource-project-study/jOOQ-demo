/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.function.Function

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row10
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.tables.records.CustomerRecord
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class RewardsReport(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CustomerRecord>?,
    aliased: Table<CustomerRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CustomerRecord>(
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
         * The reference instance of <code>public.rewards_report</code>
         */
        val REWARDS_REPORT: RewardsReport = RewardsReport()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CustomerRecord> = CustomerRecord::class.java

    /**
     * The column <code>public.rewards_report.customer_id</code>.
     */
    val CUSTOMER_ID: TableField<CustomerRecord, Long?> = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false).identity(true).defaultValue(DSL.field(DSL.raw("nextval('customer_customer_id_seq'::regclass)"), SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>public.rewards_report.store_id</code>.
     */
    val STORE_ID: TableField<CustomerRecord, Long?> = createField(DSL.name("store_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.rewards_report.first_name</code>.
     */
    val FIRST_NAME: TableField<CustomerRecord, String?> = createField(DSL.name("first_name"), SQLDataType.VARCHAR(45).nullable(false), this, "")

    /**
     * The column <code>public.rewards_report.last_name</code>.
     */
    val LAST_NAME: TableField<CustomerRecord, String?> = createField(DSL.name("last_name"), SQLDataType.VARCHAR(45).nullable(false), this, "")

    /**
     * The column <code>public.rewards_report.email</code>.
     */
    val EMAIL: TableField<CustomerRecord, String?> = createField(DSL.name("email"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.rewards_report.address_id</code>.
     */
    val ADDRESS_ID: TableField<CustomerRecord, Long?> = createField(DSL.name("address_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.rewards_report.activebool</code>.
     */
    val ACTIVEBOOL: TableField<CustomerRecord, Boolean?> = createField(DSL.name("activebool"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field(DSL.raw("true"), SQLDataType.BOOLEAN)), this, "")

    /**
     * The column <code>public.rewards_report.create_date</code>.
     */
    val CREATE_DATE: TableField<CustomerRecord, LocalDate?> = createField(DSL.name("create_date"), SQLDataType.LOCALDATE.nullable(false).defaultValue(DSL.field(DSL.raw("('now'::text)::date"), SQLDataType.LOCALDATE)), this, "")

    /**
     * The column <code>public.rewards_report.last_update</code>.
     */
    val LAST_UPDATE: TableField<CustomerRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>public.rewards_report.active</code>.
     */
    val ACTIVE: TableField<CustomerRecord, Int?> = createField(DSL.name("active"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<CustomerRecord>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.INTEGER),
        DSL.value(null, SQLDataType.NUMERIC)
    ))
    private constructor(alias: Name, aliased: Table<CustomerRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.rewards_report</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.rewards_report</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.rewards_report</code> table reference
     */
    constructor(): this(DSL.name("rewards_report"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<CustomerRecord, Long?> = super.getIdentity() as Identity<CustomerRecord, Long?>
    override fun `as`(alias: String): RewardsReport = RewardsReport(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): RewardsReport = RewardsReport(alias, this, parameters)
    override fun `as`(alias: Table<*>): RewardsReport = RewardsReport(alias.getQualifiedName(), this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): RewardsReport = RewardsReport(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): RewardsReport = RewardsReport(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): RewardsReport = RewardsReport(name.getQualifiedName(), null, parameters)

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row10<Long?, Long?, String?, String?, String?, Long?, Boolean?, LocalDate?, LocalDateTime?, Int?> = super.fieldsRow() as Row10<Long?, Long?, String?, String?, String?, Long?, Boolean?, LocalDate?, LocalDateTime?, Int?>

    /**
     * Call this table-valued function
     */
    fun call(
          minMonthlyPurchases: Int?
        , minDollarAmountPurchased: BigDecimal?
    ): RewardsReport = RewardsReport(DSL.name("rewards_report"), null, arrayOf(
        DSL.value(minMonthlyPurchases, SQLDataType.INTEGER),
        DSL.value(minDollarAmountPurchased, SQLDataType.NUMERIC)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          minMonthlyPurchases: Field<Int?>
        , minDollarAmountPurchased: Field<BigDecimal?>
    ): RewardsReport = RewardsReport(DSL.name("rewards_report"), null, arrayOf(
        minMonthlyPurchases,
        minDollarAmountPurchased
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, Long?, String?, String?, String?, Long?, Boolean?, LocalDate?, LocalDateTime?, Int?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, Long?, String?, String?, String?, Long?, Boolean?, LocalDate?, LocalDateTime?, Int?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
