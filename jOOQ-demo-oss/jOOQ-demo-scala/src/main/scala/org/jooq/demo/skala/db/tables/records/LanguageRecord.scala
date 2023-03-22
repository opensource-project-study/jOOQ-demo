/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.records


import java.lang.Long
import java.lang.String
import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.demo.skala.db.tables.Language
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
class LanguageRecord extends UpdatableRecordImpl[LanguageRecord](Language.LANGUAGE) with Record3[Long, String, LocalDateTime] {

  /**
   * Setter for <code>public.language.language_id</code>.
   */
  def setLanguageId(value: Long): Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>public.language.language_id</code>.
   */
  def getLanguageId: Long = get(0).asInstanceOf[Long]

  /**
   * Setter for <code>public.language.name</code>.
   */
  def setName(value: String): Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>public.language.name</code>.
   */
  def getName: String = get(1).asInstanceOf[String]

  /**
   * Setter for <code>public.language.last_update</code>.
   */
  def setLastUpdate(value: LocalDateTime): Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>public.language.last_update</code>.
   */
  def getLastUpdate: LocalDateTime = get(2).asInstanceOf[LocalDateTime]

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  override def key: Record1[Long] = super.key.asInstanceOf[ Record1[Long] ]

  // -------------------------------------------------------------------------
  // Record3 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow: Row3[Long, String, LocalDateTime] = super.fieldsRow.asInstanceOf[ Row3[Long, String, LocalDateTime] ]

  override def valuesRow: Row3[Long, String, LocalDateTime] = super.valuesRow.asInstanceOf[ Row3[Long, String, LocalDateTime] ]
  override def field1: Field[Long] = Language.LANGUAGE.LANGUAGE_ID
  override def field2: Field[String] = Language.LANGUAGE.NAME
  override def field3: Field[LocalDateTime] = Language.LANGUAGE.LAST_UPDATE
  override def component1: Long = getLanguageId
  override def component2: String = getName
  override def component3: LocalDateTime = getLastUpdate
  override def value1: Long = getLanguageId
  override def value2: String = getName
  override def value3: LocalDateTime = getLastUpdate

  override def value1(value: Long): LanguageRecord = {
    setLanguageId(value)
    this
  }

  override def value2(value: String): LanguageRecord = {
    setName(value)
    this
  }

  override def value3(value: LocalDateTime): LanguageRecord = {
    setLastUpdate(value)
    this
  }

  override def values(value1 : Long, value2 : String, value3 : LocalDateTime): LanguageRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this
  }

  /**
   * Create a detached, initialised LanguageRecord
   */
  def this(languageId : Long, name : String, lastUpdate : LocalDateTime) = {
    this()

    this.setLanguageId(languageId)
    this.setName(name)
    this.setLastUpdate(lastUpdate)
    resetChangedOnNotNull()
  }

  /**
   * Create a detached, initialised LanguageRecord
   */
  def this(value: org.jooq.demo.skala.db.tables.pojos.Language) = {
    this()

    if (value != null) {
      this.setLanguageId(value.getLanguageId)
      this.setName(value.getName)
      this.setLastUpdate(value.getLastUpdate)
      resetChangedOnNotNull()
    }
  }
}
