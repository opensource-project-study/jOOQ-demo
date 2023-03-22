/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import java.math.BigDecimal
import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record14
import org.jooq.Row14
import org.jooq.demo.kotlin.db.enums.MpaaRating
import org.jooq.demo.kotlin.db.tables.Film
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FilmRecord() : UpdatableRecordImpl<FilmRecord>(Film.FILM), Record14<Long?, String?, String?, Int?, Long?, Long?, Short?, BigDecimal?, Short?, BigDecimal?, MpaaRating?, LocalDateTime?, Array<String?>?, Any?> {

    open var filmId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var title: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var description: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var releaseYear: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    open var languageId: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var originalLanguageId: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var rentalDuration: Short?
        set(value): Unit = set(6, value)
        get(): Short? = get(6) as Short?

    open var rentalRate: BigDecimal?
        set(value): Unit = set(7, value)
        get(): BigDecimal? = get(7) as BigDecimal?

    open var length: Short?
        set(value): Unit = set(8, value)
        get(): Short? = get(8) as Short?

    open var replacementCost: BigDecimal?
        set(value): Unit = set(9, value)
        get(): BigDecimal? = get(9) as BigDecimal?

    open var rating: MpaaRating?
        set(value): Unit = set(10, value)
        get(): MpaaRating? = get(10) as MpaaRating?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(11, value)
        get(): LocalDateTime? = get(11) as LocalDateTime?

    open var specialFeatures: Array<String?>?
        set(value): Unit = set(12, value)
        get(): Array<String?>? = get(12) as Array<String?>?

    open var fulltext: Any?
        set(value): Unit = set(13, value)
        get(): Any? = get(13) as Any?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row14<Long?, String?, String?, Int?, Long?, Long?, Short?, BigDecimal?, Short?, BigDecimal?, MpaaRating?, LocalDateTime?, Array<String?>?, Any?> = super.fieldsRow() as Row14<Long?, String?, String?, Int?, Long?, Long?, Short?, BigDecimal?, Short?, BigDecimal?, MpaaRating?, LocalDateTime?, Array<String?>?, Any?>
    override fun valuesRow(): Row14<Long?, String?, String?, Int?, Long?, Long?, Short?, BigDecimal?, Short?, BigDecimal?, MpaaRating?, LocalDateTime?, Array<String?>?, Any?> = super.valuesRow() as Row14<Long?, String?, String?, Int?, Long?, Long?, Short?, BigDecimal?, Short?, BigDecimal?, MpaaRating?, LocalDateTime?, Array<String?>?, Any?>
    override fun field1(): Field<Long?> = Film.FILM.FILM_ID
    override fun field2(): Field<String?> = Film.FILM.TITLE
    override fun field3(): Field<String?> = Film.FILM.DESCRIPTION
    override fun field4(): Field<Int?> = Film.FILM.RELEASE_YEAR
    override fun field5(): Field<Long?> = Film.FILM.LANGUAGE_ID
    override fun field6(): Field<Long?> = Film.FILM.ORIGINAL_LANGUAGE_ID
    override fun field7(): Field<Short?> = Film.FILM.RENTAL_DURATION
    override fun field8(): Field<BigDecimal?> = Film.FILM.RENTAL_RATE
    override fun field9(): Field<Short?> = Film.FILM.LENGTH
    override fun field10(): Field<BigDecimal?> = Film.FILM.REPLACEMENT_COST
    override fun field11(): Field<MpaaRating?> = Film.FILM.RATING
    override fun field12(): Field<LocalDateTime?> = Film.FILM.LAST_UPDATE
    override fun field13(): Field<Array<String?>?> = Film.FILM.SPECIAL_FEATURES
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    override fun field14(): Field<Any?> = Film.FILM.FULLTEXT
    override fun component1(): Long? = filmId
    override fun component2(): String? = title
    override fun component3(): String? = description
    override fun component4(): Int? = releaseYear
    override fun component5(): Long? = languageId
    override fun component6(): Long? = originalLanguageId
    override fun component7(): Short? = rentalDuration
    override fun component8(): BigDecimal? = rentalRate
    override fun component9(): Short? = length
    override fun component10(): BigDecimal? = replacementCost
    override fun component11(): MpaaRating? = rating
    override fun component12(): LocalDateTime? = lastUpdate
    override fun component13(): Array<String?>? = specialFeatures
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    override fun component14(): Any? = fulltext
    override fun value1(): Long? = filmId
    override fun value2(): String? = title
    override fun value3(): String? = description
    override fun value4(): Int? = releaseYear
    override fun value5(): Long? = languageId
    override fun value6(): Long? = originalLanguageId
    override fun value7(): Short? = rentalDuration
    override fun value8(): BigDecimal? = rentalRate
    override fun value9(): Short? = length
    override fun value10(): BigDecimal? = replacementCost
    override fun value11(): MpaaRating? = rating
    override fun value12(): LocalDateTime? = lastUpdate
    override fun value13(): Array<String?>? = specialFeatures
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    override fun value14(): Any? = fulltext

    override fun value1(value: Long?): FilmRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): FilmRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): FilmRecord {
        set(2, value)
        return this
    }

    override fun value4(value: Int?): FilmRecord {
        set(3, value)
        return this
    }

    override fun value5(value: Long?): FilmRecord {
        set(4, value)
        return this
    }

    override fun value6(value: Long?): FilmRecord {
        set(5, value)
        return this
    }

    override fun value7(value: Short?): FilmRecord {
        set(6, value)
        return this
    }

    override fun value8(value: BigDecimal?): FilmRecord {
        set(7, value)
        return this
    }

    override fun value9(value: Short?): FilmRecord {
        set(8, value)
        return this
    }

    override fun value10(value: BigDecimal?): FilmRecord {
        set(9, value)
        return this
    }

    override fun value11(value: MpaaRating?): FilmRecord {
        set(10, value)
        return this
    }

    override fun value12(value: LocalDateTime?): FilmRecord {
        set(11, value)
        return this
    }

    override fun value13(value: Array<String?>?): FilmRecord {
        set(12, value)
        return this
    }

    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    override fun value14(value: Any?): FilmRecord {
        set(13, value)
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?, value4: Int?, value5: Long?, value6: Long?, value7: Short?, value8: BigDecimal?, value9: Short?, value10: BigDecimal?, value11: MpaaRating?, value12: LocalDateTime?, value13: Array<String?>?, value14: Any?): FilmRecord {
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
        this.value11(value11)
        this.value12(value12)
        this.value13(value13)
        this.value14(value14)
        return this
    }

    /**
     * Create a detached, initialised FilmRecord
     */
    constructor(filmId: Long? = null, title: String? = null, description: String? = null, releaseYear: Int? = null, languageId: Long? = null, originalLanguageId: Long? = null, rentalDuration: Short? = null, rentalRate: BigDecimal? = null, length: Short? = null, replacementCost: BigDecimal? = null, rating: MpaaRating? = null, lastUpdate: LocalDateTime? = null, specialFeatures: Array<String?>? = null, fulltext: Any? = null): this() {
        this.filmId = filmId
        this.title = title
        this.description = description
        this.releaseYear = releaseYear
        this.languageId = languageId
        this.originalLanguageId = originalLanguageId
        this.rentalDuration = rentalDuration
        this.rentalRate = rentalRate
        this.length = length
        this.replacementCost = replacementCost
        this.rating = rating
        this.lastUpdate = lastUpdate
        this.specialFeatures = specialFeatures
        this.fulltext = fulltext
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised FilmRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.Film?): this() {
        if (value != null) {
            this.filmId = value.filmId
            this.title = value.title
            this.description = value.description
            this.releaseYear = value.releaseYear
            this.languageId = value.languageId
            this.originalLanguageId = value.originalLanguageId
            this.rentalDuration = value.rentalDuration
            this.rentalRate = value.rentalRate
            this.length = value.length
            this.replacementCost = value.replacementCost
            this.rating = value.rating
            this.lastUpdate = value.lastUpdate
            this.specialFeatures = value.specialFeatures
            this.fulltext = value.fulltext
            resetChangedOnNotNull()
        }
    }
}
