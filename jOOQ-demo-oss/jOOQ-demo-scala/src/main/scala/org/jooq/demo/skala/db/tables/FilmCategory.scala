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
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row3
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.demo.skala.db.Keys
import org.jooq.demo.skala.db.Public
import org.jooq.demo.skala.db.tables.records.FilmCategoryRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array


object FilmCategory {

  /**
   * The reference instance of <code>public.film_category</code>
   */
  val FILM_CATEGORY = new FilmCategory
}

/**
 * This class is generated by jOOQ.
 */
class FilmCategory(
  alias: Name,
  child: Table[_ <: Record],
  path: ForeignKey[_ <: Record, FilmCategoryRecord],
  aliased: Table[FilmCategoryRecord],
  parameters: Array[ Field[_] ]
)
extends TableImpl[FilmCategoryRecord](
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
  override def getRecordType: Class[FilmCategoryRecord] = classOf[FilmCategoryRecord]

  /**
   * The column <code>public.film_category.film_id</code>.
   */
  val FILM_ID: TableField[FilmCategoryRecord, Long] = createField(DSL.name("film_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.film_category.category_id</code>.
   */
  val CATEGORY_ID: TableField[FilmCategoryRecord, Long] = createField(DSL.name("category_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.film_category.last_update</code>.
   */
  val LAST_UPDATE: TableField[FilmCategoryRecord, LocalDateTime] = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), "")

  private def this(alias: Name, aliased: Table[FilmCategoryRecord]) = this(alias, null, null, aliased, null)

  /**
   * Create an aliased <code>public.film_category</code> table reference
   */
  def this(alias: String) = this(DSL.name(alias), org.jooq.demo.skala.db.tables.FilmCategory.FILM_CATEGORY)

  /**
   * Create an aliased <code>public.film_category</code> table reference
   */
  def this(alias: Name) = this(alias, org.jooq.demo.skala.db.tables.FilmCategory.FILM_CATEGORY)

  /**
   * Create a <code>public.film_category</code> table reference
   */
  def this() = this(DSL.name("film_category"), null)

  def this(child: Table[_ <: Record], key: ForeignKey[_ <: Record, FilmCategoryRecord]) = this(Internal.createPathAlias(child, key), child, key, org.jooq.demo.skala.db.tables.FilmCategory.FILM_CATEGORY, null)

  override def getSchema: Schema = if (aliased()) null else Public.PUBLIC

  override def getPrimaryKey: UniqueKey[FilmCategoryRecord] = Keys.FILM_CATEGORY_PKEY

  override def getReferences: List[ ForeignKey[FilmCategoryRecord, _] ] = Arrays.asList[ ForeignKey[FilmCategoryRecord, _] ](Keys.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY, Keys.FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY)

  /**
   * Get the implicit join path to the <code>public.film</code> table.
   */
  lazy val film: Film = { new Film(this, Keys.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY) }

  /**
   * Get the implicit join path to the <code>public.category</code> table.
   */
  lazy val category: Category = { new Category(this, Keys.FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY) }
  override def as(alias: String): FilmCategory = new FilmCategory(DSL.name(alias), this)
  override def as(alias: Name): FilmCategory = new FilmCategory(alias, this)
  override def as(alias: Table[_]): FilmCategory = new FilmCategory(alias.getQualifiedName(), this)

  /**
   * Rename this table
   */
  override def rename(name: String): FilmCategory = new FilmCategory(DSL.name(name), null)

  /**
   * Rename this table
   */
  override def rename(name: Name): FilmCategory = new FilmCategory(name, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): FilmCategory = new FilmCategory(name.getQualifiedName(), null)

  // -------------------------------------------------------------------------
  // Row3 type methods
  // -------------------------------------------------------------------------
  override def fieldsRow: Row3[Long, Long, LocalDateTime] = super.fieldsRow.asInstanceOf[ Row3[Long, Long, LocalDateTime] ]

  /**
   * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
   */
  def mapping[U](from: (Long, Long, LocalDateTime) => U): SelectField[U] = convertFrom(r => from.apply(r.value1(), r.value2(), r.value3()))

  /**
   * Convenience mapping calling {@link SelectField#convertFrom(Class,
   * Function)}.
   */
  def mapping[U](toType: Class[U], from: (Long, Long, LocalDateTime) => U): SelectField[U] = convertFrom(toType,r => from.apply(r.value1(), r.value2(), r.value3()))
}
