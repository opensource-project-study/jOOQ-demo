/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables


import java.lang.Class
import java.lang.Long
import java.lang.String
import java.time.LocalDateTime
import java.util.Arrays
import java.util.List
import java.util.function.Function

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row8
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.demo.skala.db.Indexes
import org.jooq.demo.skala.db.Keys
import org.jooq.demo.skala.db.Public
import org.jooq.demo.skala.db.tables.records.AddressRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array


object Address {

  /**
   * The reference instance of <code>public.address</code>
   */
  val ADDRESS = new Address
}

/**
 * This class is generated by jOOQ.
 */
class Address(
  alias: Name,
  child: Table[_ <: Record],
  path: ForeignKey[_ <: Record, AddressRecord],
  aliased: Table[AddressRecord],
  parameters: Array[ Field[_] ]
)
extends TableImpl[AddressRecord](
  alias,
  Public.PUBLIC,
  child,
  path,
  aliased,
  parameters,
  DSL.comment(""),
  TableOptions.table
) {

  /**
   * The class holding records for this type
   */
  override def getRecordType: Class[AddressRecord] = classOf[AddressRecord]

  /**
   * The column <code>public.address.address_id</code>.
   */
  val ADDRESS_ID: TableField[AddressRecord, Long] = createField(DSL.name("address_id"), SQLDataType.BIGINT.nullable(false).identity(true), "")

  /**
   * The column <code>public.address.address</code>.
   */
  val ADDRESS_ : TableField[AddressRecord, String] = createField(DSL.name("address"), SQLDataType.VARCHAR(50).nullable(false), "")

  /**
   * The column <code>public.address.address2</code>.
   */
  val ADDRESS2: TableField[AddressRecord, String] = createField(DSL.name("address2"), SQLDataType.VARCHAR(50), "")

  /**
   * The column <code>public.address.district</code>.
   */
  val DISTRICT: TableField[AddressRecord, String] = createField(DSL.name("district"), SQLDataType.VARCHAR(20).nullable(false), "")

  /**
   * The column <code>public.address.city_id</code>.
   */
  val CITY_ID: TableField[AddressRecord, Long] = createField(DSL.name("city_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.address.postal_code</code>.
   */
  val POSTAL_CODE: TableField[AddressRecord, String] = createField(DSL.name("postal_code"), SQLDataType.VARCHAR(10), "")

  /**
   * The column <code>public.address.phone</code>.
   */
  val PHONE: TableField[AddressRecord, String] = createField(DSL.name("phone"), SQLDataType.VARCHAR(20).nullable(false), "")

  /**
   * The column <code>public.address.last_update</code>.
   */
  val LAST_UPDATE: TableField[AddressRecord, LocalDateTime] = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), "")

  private def this(alias: Name, aliased: Table[AddressRecord]) = this(alias, null, null, aliased, null)

  /**
   * Create an aliased <code>public.address</code> table reference
   */
  def this(alias: String) = this(DSL.name(alias), org.jooq.demo.skala.db.tables.Address.ADDRESS)

  /**
   * Create an aliased <code>public.address</code> table reference
   */
  def this(alias: Name) = this(alias, org.jooq.demo.skala.db.tables.Address.ADDRESS)

  /**
   * Create a <code>public.address</code> table reference
   */
  def this() = this(DSL.name("address"), null)

  def this(child: Table[_ <: Record], key: ForeignKey[_ <: Record, AddressRecord]) = this(Internal.createPathAlias(child, key), child, key, org.jooq.demo.skala.db.tables.Address.ADDRESS, null)

  override def getSchema: Schema = if (aliased()) null else Public.PUBLIC

  override def getIndexes: List[Index] = Arrays.asList[ Index ](Indexes.IDX_FK_CITY_ID)

  override def getIdentity: Identity[AddressRecord, Long] = super.getIdentity.asInstanceOf[ Identity[AddressRecord, Long] ]

  override def getPrimaryKey: UniqueKey[AddressRecord] = Keys.ADDRESS_PKEY

  override def getReferences: List[ ForeignKey[AddressRecord, _] ] = Arrays.asList[ ForeignKey[AddressRecord, _] ](Keys.ADDRESS__ADDRESS_CITY_ID_FKEY)

  /**
   * Get the implicit join path to the <code>public.city</code> table.
   */
  lazy val city: City = { new City(this, Keys.ADDRESS__ADDRESS_CITY_ID_FKEY) }
  override def as(alias: String): Address = new Address(DSL.name(alias), this)
  override def as(alias: Name): Address = new Address(alias, this)
  override def as(alias: Table[_]): Address = new Address(alias.getQualifiedName(), this)

  /**
   * Rename this table
   */
  override def rename(name: String): Address = new Address(DSL.name(name), null)

  /**
   * Rename this table
   */
  override def rename(name: Name): Address = new Address(name, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): Address = new Address(name.getQualifiedName(), null)

  // -------------------------------------------------------------------------
  // Row8 type methods
  // -------------------------------------------------------------------------
  override def fieldsRow: Row8[Long, String, String, String, Long, String, String, LocalDateTime] = super.fieldsRow.asInstanceOf[ Row8[Long, String, String, String, Long, String, String, LocalDateTime] ]

  /**
   * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
   */
  def mapping[U](from: (Long, String, String, String, Long, String, String, LocalDateTime) => U): SelectField[U] = convertFrom(r => from.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8()))

  /**
   * Convenience mapping calling {@link SelectField#convertFrom(Class,
   * Function)}.
   */
  def mapping[U](toType: Class[U], from: (Long, String, String, String, Long, String, String, LocalDateTime) => U): SelectField[U] = convertFrom(toType,r => from.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8()))
}
