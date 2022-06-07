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
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row3
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.demo.skala.db.Indexes
import org.jooq.demo.skala.db.Keys
import org.jooq.demo.skala.db.Public
import org.jooq.demo.skala.db.tables.records.FilmActorRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array


object FilmActor {

  /**
   * The reference instance of <code>public.film_actor</code>
   */
  val FILM_ACTOR = new FilmActor
}

/**
 * This class is generated by jOOQ.
 */
class FilmActor(
  alias: Name,
  child: Table[_ <: Record],
  path: ForeignKey[_ <: Record, FilmActorRecord],
  aliased: Table[FilmActorRecord],
  parameters: Array[ Field[_] ]
)
extends TableImpl[FilmActorRecord](
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
  override def getRecordType: Class[FilmActorRecord] = classOf[FilmActorRecord]

  /**
   * The column <code>public.film_actor.actor_id</code>.
   */
  val ACTOR_ID: TableField[FilmActorRecord, Long] = createField(DSL.name("actor_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.film_actor.film_id</code>.
   */
  val FILM_ID: TableField[FilmActorRecord, Long] = createField(DSL.name("film_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.film_actor.last_update</code>.
   */
  val LAST_UPDATE: TableField[FilmActorRecord, LocalDateTime] = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), "")

  private def this(alias: Name, aliased: Table[FilmActorRecord]) = this(alias, null, null, aliased, null)

  /**
   * Create an aliased <code>public.film_actor</code> table reference
   */
  def this(alias: String) = this(DSL.name(alias), org.jooq.demo.skala.db.tables.FilmActor.FILM_ACTOR)

  /**
   * Create an aliased <code>public.film_actor</code> table reference
   */
  def this(alias: Name) = this(alias, org.jooq.demo.skala.db.tables.FilmActor.FILM_ACTOR)

  /**
   * Create a <code>public.film_actor</code> table reference
   */
  def this() = this(DSL.name("film_actor"), null)

  def this(child: Table[_ <: Record], key: ForeignKey[_ <: Record, FilmActorRecord]) = this(Internal.createPathAlias(child, key), child, key, org.jooq.demo.skala.db.tables.FilmActor.FILM_ACTOR, null)

  override def getSchema: Schema = if (aliased()) null else Public.PUBLIC

  override def getIndexes: List[Index] = Arrays.asList[ Index ](Indexes.IDX_FK_FILM_ID)

  override def getPrimaryKey: UniqueKey[FilmActorRecord] = Keys.FILM_ACTOR_PKEY

  override def getReferences: List[ ForeignKey[FilmActorRecord, _] ] = Arrays.asList[ ForeignKey[FilmActorRecord, _] ](Keys.FILM_ACTOR__FILM_ACTOR_ACTOR_ID_FKEY, Keys.FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY)

  /**
   * Get the implicit join path to the <code>public.actor</code> table.
   */
  lazy val actor: Actor = { new Actor(this, Keys.FILM_ACTOR__FILM_ACTOR_ACTOR_ID_FKEY) }

  /**
   * Get the implicit join path to the <code>public.film</code> table.
   */
  lazy val film: Film = { new Film(this, Keys.FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY) }
  override def as(alias: String): FilmActor = new FilmActor(DSL.name(alias), this)
  override def as(alias: Name): FilmActor = new FilmActor(alias, this)
  override def as(alias: Table[_]): FilmActor = new FilmActor(alias.getQualifiedName(), this)

  /**
   * Rename this table
   */
  override def rename(name: String): FilmActor = new FilmActor(DSL.name(name), null)

  /**
   * Rename this table
   */
  override def rename(name: Name): FilmActor = new FilmActor(name, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): FilmActor = new FilmActor(name.getQualifiedName(), null)

  // -------------------------------------------------------------------------
  // Row3 type methods
  // -------------------------------------------------------------------------
  override def fieldsRow: Row3[Long, Long, LocalDateTime] = super.fieldsRow.asInstanceOf[ Row3[Long, Long, LocalDateTime] ]

  /**
   * Convenience mapping calling {@link #convertFrom(Function)}.
   */
  def mapping[U](from: (Long, Long, LocalDateTime) => U): SelectField[U] = convertFrom(r => from.apply(r.value1(), r.value2(), r.value3()))

  /**
   * Convenience mapping calling {@link #convertFrom(Class, Function)}.
   */
  def mapping[U](toType: Class[U], from: (Long, Long, LocalDateTime) => U): SelectField[U] = convertFrom(toType,r => from.apply(r.value1(), r.value2(), r.value3()))
}
