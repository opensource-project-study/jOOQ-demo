/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import java.time.LocalDate
import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record10
import org.jooq.Row10
import org.jooq.demo.kotlin.db.tables.Customer
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CustomerRecord() : UpdatableRecordImpl<CustomerRecord>(Customer.CUSTOMER), Record10<Long?, Long?, String?, String?, String?, Long?, Boolean?, LocalDate?, LocalDateTime?, Long?> {

    open var customerId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var storeId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var firstName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var lastName: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var email: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var addressId: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var activebool: Boolean?
        set(value): Unit = set(6, value)
        get(): Boolean? = get(6) as Boolean?

    open var createDate: LocalDate?
        set(value): Unit = set(7, value)
        get(): LocalDate? = get(7) as LocalDate?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(8, value)
        get(): LocalDateTime? = get(8) as LocalDateTime?

    open var active: Long?
        set(value): Unit = set(9, value)
        get(): Long? = get(9) as Long?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row10<Long?, Long?, String?, String?, String?, Long?, Boolean?, LocalDate?, LocalDateTime?, Long?> = super.fieldsRow() as Row10<Long?, Long?, String?, String?, String?, Long?, Boolean?, LocalDate?, LocalDateTime?, Long?>
    override fun valuesRow(): Row10<Long?, Long?, String?, String?, String?, Long?, Boolean?, LocalDate?, LocalDateTime?, Long?> = super.valuesRow() as Row10<Long?, Long?, String?, String?, String?, Long?, Boolean?, LocalDate?, LocalDateTime?, Long?>
    override fun field1(): Field<Long?> = Customer.CUSTOMER.CUSTOMER_ID
    override fun field2(): Field<Long?> = Customer.CUSTOMER.STORE_ID
    override fun field3(): Field<String?> = Customer.CUSTOMER.FIRST_NAME
    override fun field4(): Field<String?> = Customer.CUSTOMER.LAST_NAME
    override fun field5(): Field<String?> = Customer.CUSTOMER.EMAIL
    override fun field6(): Field<Long?> = Customer.CUSTOMER.ADDRESS_ID
    override fun field7(): Field<Boolean?> = Customer.CUSTOMER.ACTIVEBOOL
    override fun field8(): Field<LocalDate?> = Customer.CUSTOMER.CREATE_DATE
    override fun field9(): Field<LocalDateTime?> = Customer.CUSTOMER.LAST_UPDATE
    override fun field10(): Field<Long?> = Customer.CUSTOMER.ACTIVE
    override fun component1(): Long? = customerId
    override fun component2(): Long? = storeId
    override fun component3(): String? = firstName
    override fun component4(): String? = lastName
    override fun component5(): String? = email
    override fun component6(): Long? = addressId
    override fun component7(): Boolean? = activebool
    override fun component8(): LocalDate? = createDate
    override fun component9(): LocalDateTime? = lastUpdate
    override fun component10(): Long? = active
    override fun value1(): Long? = customerId
    override fun value2(): Long? = storeId
    override fun value3(): String? = firstName
    override fun value4(): String? = lastName
    override fun value5(): String? = email
    override fun value6(): Long? = addressId
    override fun value7(): Boolean? = activebool
    override fun value8(): LocalDate? = createDate
    override fun value9(): LocalDateTime? = lastUpdate
    override fun value10(): Long? = active

    override fun value1(value: Long?): CustomerRecord {
        this.customerId = value
        return this
    }

    override fun value2(value: Long?): CustomerRecord {
        this.storeId = value
        return this
    }

    override fun value3(value: String?): CustomerRecord {
        this.firstName = value
        return this
    }

    override fun value4(value: String?): CustomerRecord {
        this.lastName = value
        return this
    }

    override fun value5(value: String?): CustomerRecord {
        this.email = value
        return this
    }

    override fun value6(value: Long?): CustomerRecord {
        this.addressId = value
        return this
    }

    override fun value7(value: Boolean?): CustomerRecord {
        this.activebool = value
        return this
    }

    override fun value8(value: LocalDate?): CustomerRecord {
        this.createDate = value
        return this
    }

    override fun value9(value: LocalDateTime?): CustomerRecord {
        this.lastUpdate = value
        return this
    }

    override fun value10(value: Long?): CustomerRecord {
        this.active = value
        return this
    }

    override fun values(value1: Long?, value2: Long?, value3: String?, value4: String?, value5: String?, value6: Long?, value7: Boolean?, value8: LocalDate?, value9: LocalDateTime?, value10: Long?): CustomerRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        this.value10(value10)
        return this
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    constructor(customerId: Long? = null, storeId: Long? = null, firstName: String? = null, lastName: String? = null, email: String? = null, addressId: Long? = null, activebool: Boolean? = null, createDate: LocalDate? = null, lastUpdate: LocalDateTime? = null, active: Long? = null): this() {
        this.customerId = customerId
        this.storeId = storeId
        this.firstName = firstName
        this.lastName = lastName
        this.email = email
        this.addressId = addressId
        this.activebool = activebool
        this.createDate = createDate
        this.lastUpdate = lastUpdate
        this.active = active
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.Customer?): this() {
        if (value != null) {
            this.customerId = value.customerId
            this.storeId = value.storeId
            this.firstName = value.firstName
            this.lastName = value.lastName
            this.email = value.email
            this.addressId = value.addressId
            this.activebool = value.activebool
            this.createDate = value.createDate
            this.lastUpdate = value.lastUpdate
            this.active = value.active
        }
    }
}
