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
data class FilmCategory(
    val filmId: Long? = null,
    val categoryId: Long? = null,
    val lastUpdate: LocalDateTime? = null
): Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other === null)
            return false
        if (this::class != other::class)
            return false
        val o: FilmCategory = other as FilmCategory
        if (this.filmId === null) {
            if (o.filmId !== null)
                return false
        }
        else if (this.filmId != o.filmId)
            return false
        if (this.categoryId === null) {
            if (o.categoryId !== null)
                return false
        }
        else if (this.categoryId != o.categoryId)
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
        result = prime * result + (if (this.filmId === null) 0 else this.filmId.hashCode())
        result = prime * result + (if (this.categoryId === null) 0 else this.categoryId.hashCode())
        result = prime * result + (if (this.lastUpdate === null) 0 else this.lastUpdate.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("FilmCategory (")

        sb.append(filmId)
        sb.append(", ").append(categoryId)
        sb.append(", ").append(lastUpdate)

        sb.append(")")
        return sb.toString()
    }
}
