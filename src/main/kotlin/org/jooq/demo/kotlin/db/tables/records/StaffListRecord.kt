/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import org.jooq.Field
import org.jooq.Record8
import org.jooq.Row8
import org.jooq.demo.kotlin.db.tables.StaffList
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class StaffListRecord() : TableRecordImpl<StaffListRecord>(StaffList.STAFF_LIST), Record8<Long?, String?, String?, String?, String?, String?, String?, Long?> {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var address: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var zipCode: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var phone: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var city: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var country: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var sid: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row8<Long?, String?, String?, String?, String?, String?, String?, Long?> = super.fieldsRow() as Row8<Long?, String?, String?, String?, String?, String?, String?, Long?>
    override fun valuesRow(): Row8<Long?, String?, String?, String?, String?, String?, String?, Long?> = super.valuesRow() as Row8<Long?, String?, String?, String?, String?, String?, String?, Long?>
    override fun field1(): Field<Long?> = StaffList.STAFF_LIST.ID
    override fun field2(): Field<String?> = StaffList.STAFF_LIST.NAME
    override fun field3(): Field<String?> = StaffList.STAFF_LIST.ADDRESS
    override fun field4(): Field<String?> = org.jooq.demo.kotlin.db.tables.StaffList.STAFF_LIST.`ZIP CODE`
    override fun field5(): Field<String?> = StaffList.STAFF_LIST.PHONE
    override fun field6(): Field<String?> = StaffList.STAFF_LIST.CITY
    override fun field7(): Field<String?> = StaffList.STAFF_LIST.COUNTRY
    override fun field8(): Field<Long?> = StaffList.STAFF_LIST.SID
    override fun component1(): Long? = id
    override fun component2(): String? = name
    override fun component3(): String? = address
    override fun component4(): String? = zipCode
    override fun component5(): String? = phone
    override fun component6(): String? = city
    override fun component7(): String? = country
    override fun component8(): Long? = sid
    override fun value1(): Long? = id
    override fun value2(): String? = name
    override fun value3(): String? = address
    override fun value4(): String? = zipCode
    override fun value5(): String? = phone
    override fun value6(): String? = city
    override fun value7(): String? = country
    override fun value8(): Long? = sid

    override fun value1(value: Long?): StaffListRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): StaffListRecord {
        this.name = value
        return this
    }

    override fun value3(value: String?): StaffListRecord {
        this.address = value
        return this
    }

    override fun value4(value: String?): StaffListRecord {
        this.zipCode = value
        return this
    }

    override fun value5(value: String?): StaffListRecord {
        this.phone = value
        return this
    }

    override fun value6(value: String?): StaffListRecord {
        this.city = value
        return this
    }

    override fun value7(value: String?): StaffListRecord {
        this.country = value
        return this
    }

    override fun value8(value: Long?): StaffListRecord {
        this.sid = value
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?, value4: String?, value5: String?, value6: String?, value7: String?, value8: Long?): StaffListRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        return this
    }

    /**
     * Create a detached, initialised StaffListRecord
     */
    constructor(id: Long? = null, name: String? = null, address: String? = null, zipCode: String? = null, phone: String? = null, city: String? = null, country: String? = null, sid: Long? = null): this() {
        this.id = id
        this.name = name
        this.address = address
        this.zipCode = zipCode
        this.phone = phone
        this.city = city
        this.country = country
        this.sid = sid
    }

    /**
     * Create a detached, initialised StaffListRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.StaffList?): this() {
        if (value != null) {
            this.id = value.id
            this.name = value.name
            this.address = value.address
            this.zipCode = value.zipCode
            this.phone = value.phone
            this.city = value.city
            this.country = value.country
            this.sid = value.sid
        }
    }
}
