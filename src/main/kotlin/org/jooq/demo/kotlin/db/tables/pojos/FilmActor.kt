/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.pojos


import java.io.Serializable
import java.time.LocalDateTime


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class FilmActor(
    val actorId: Long? = null,
    val filmId: Long? = null,
    val lastUpdate: LocalDateTime? = null
): Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other === null)
            return false
        if (this::class != other::class)
            return false
        val o: FilmActor = other as FilmActor
        if (this.actorId === null) {
            if (o.actorId !== null)
                return false
        }
        else if (this.actorId != o.actorId)
            return false
        if (this.filmId === null) {
            if (o.filmId !== null)
                return false
        }
        else if (this.filmId != o.filmId)
            return false
        if (this.lastUpdate === null) {
            if (o.lastUpdate !== null)
                return false
        }
        else if (this.lastUpdate != o.lastUpdate)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.actorId === null) 0 else this.actorId.hashCode())
        result = prime * result + (if (this.filmId === null) 0 else this.filmId.hashCode())
        result = prime * result + (if (this.lastUpdate === null) 0 else this.lastUpdate.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("FilmActor (")

        sb.append(actorId)
        sb.append(", ").append(filmId)
        sb.append(", ").append(lastUpdate)

        sb.append(")")
        return sb.toString()
    }
}
