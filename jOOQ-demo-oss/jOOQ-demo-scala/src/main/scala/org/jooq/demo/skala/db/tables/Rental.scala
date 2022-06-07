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
import org.jooq.Row7
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.demo.skala.db.Indexes
import org.jooq.demo.skala.db.Keys
import org.jooq.demo.skala.db.Public
import org.jooq.demo.skala.db.tables.records.RentalRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array


object Rental {

  /**
   * The reference instance of <code>public.rental</code>
   */
  val RENTAL = new Rental
}

/**
 * This class is generated by jOOQ.
 */
class Rental(
  alias: Name,
  child: Table[_ <: Record],
  path: ForeignKey[_ <: Record, RentalRecord],
  aliased: Table[RentalRecord],
  parameters: Array[ Field[_] ]
)
extends TableImpl[RentalRecord](
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
  override def getRecordType: Class[RentalRecord] = classOf[RentalRecord]

  /**
   * The column <code>public.rental.rental_id</code>.
   */
  val RENTAL_ID: TableField[RentalRecord, Long] = createField(DSL.name("rental_id"), SQLDataType.BIGINT.nullable(false).identity(true), "")

  /**
   * The column <code>public.rental.rental_date</code>.
   */
  val RENTAL_DATE: TableField[RentalRecord, LocalDateTime] = createField(DSL.name("rental_date"), SQLDataType.LOCALDATETIME(6).nullable(false), "")

  /**
   * The column <code>public.rental.inventory_id</code>.
   */
  val INVENTORY_ID: TableField[RentalRecord, Long] = createField(DSL.name("inventory_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.rental.customer_id</code>.
   */
  val CUSTOMER_ID: TableField[RentalRecord, Long] = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.rental.return_date</code>.
   */
  val RETURN_DATE: TableField[RentalRecord, LocalDateTime] = createField(DSL.name("return_date"), SQLDataType.LOCALDATETIME(6), "")

  /**
   * The column <code>public.rental.staff_id</code>.
   */
  val STAFF_ID: TableField[RentalRecord, Long] = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.rental.last_update</code>.
   */
  val LAST_UPDATE: TableField[RentalRecord, LocalDateTime] = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), "")

  private def this(alias: Name, aliased: Table[RentalRecord]) = this(alias, null, null, aliased, null)

  /**
   * Create an aliased <code>public.rental</code> table reference
   */
  def this(alias: String) = this(DSL.name(alias), org.jooq.demo.skala.db.tables.Rental.RENTAL)

  /**
   * Create an aliased <code>public.rental</code> table reference
   */
  def this(alias: Name) = this(alias, org.jooq.demo.skala.db.tables.Rental.RENTAL)

  /**
   * Create a <code>public.rental</code> table reference
   */
  def this() = this(DSL.name("rental"), null)

  def this(child: Table[_ <: Record], key: ForeignKey[_ <: Record, RentalRecord]) = this(Internal.createPathAlias(child, key), child, key, org.jooq.demo.skala.db.tables.Rental.RENTAL, null)

  override def getSchema: Schema = if (aliased()) null else Public.PUBLIC

  override def getIndexes: List[Index] = Arrays.asList[ Index ](Indexes.IDX_FK_INVENTORY_ID, Indexes.IDX_UNQ_RENTAL_RENTAL_DATE_INVENTORY_ID_CUSTOMER_ID)

  override def getIdentity: Identity[RentalRecord, Long] = super.getIdentity.asInstanceOf[ Identity[RentalRecord, Long] ]

  override def getPrimaryKey: UniqueKey[RentalRecord] = Keys.RENTAL_PKEY

  override def getReferences: List[ ForeignKey[RentalRecord, _] ] = Arrays.asList[ ForeignKey[RentalRecord, _] ](Keys.RENTAL__RENTAL_INVENTORY_ID_FKEY, Keys.RENTAL__RENTAL_CUSTOMER_ID_FKEY, Keys.RENTAL__RENTAL_STAFF_ID_FKEY)

  /**
   * Get the implicit join path to the <code>public.inventory</code> table.
   */
  lazy val inventory: Inventory = { new Inventory(this, Keys.RENTAL__RENTAL_INVENTORY_ID_FKEY) }

  /**
   * Get the implicit join path to the <code>public.customer</code> table.
   */
  lazy val customer: Customer = { new Customer(this, Keys.RENTAL__RENTAL_CUSTOMER_ID_FKEY) }

  /**
   * Get the implicit join path to the <code>public.staff</code> table.
   */
  lazy val staff: Staff = { new Staff(this, Keys.RENTAL__RENTAL_STAFF_ID_FKEY) }
  override def as(alias: String): Rental = new Rental(DSL.name(alias), this)
  override def as(alias: Name): Rental = new Rental(alias, this)
  override def as(alias: Table[_]): Rental = new Rental(alias.getQualifiedName(), this)

  /**
   * Rename this table
   */
  override def rename(name: String): Rental = new Rental(DSL.name(name), null)

  /**
   * Rename this table
   */
  override def rename(name: Name): Rental = new Rental(name, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): Rental = new Rental(name.getQualifiedName(), null)

  // -------------------------------------------------------------------------
  // Row7 type methods
  // -------------------------------------------------------------------------
  override def fieldsRow: Row7[Long, LocalDateTime, Long, Long, LocalDateTime, Long, LocalDateTime] = super.fieldsRow.asInstanceOf[ Row7[Long, LocalDateTime, Long, Long, LocalDateTime, Long, LocalDateTime] ]

  /**
   * Convenience mapping calling {@link #convertFrom(Function)}.
   */
  def mapping[U](from: (Long, LocalDateTime, Long, Long, LocalDateTime, Long, LocalDateTime) => U): SelectField[U] = convertFrom(r => from.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7()))

  /**
   * Convenience mapping calling {@link #convertFrom(Class, Function)}.
   */
  def mapping[U](toType: Class[U], from: (Long, LocalDateTime, Long, Long, LocalDateTime, Long, LocalDateTime) => U): SelectField[U] = convertFrom(toType,r => from.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7()))
}
