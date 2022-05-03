/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.pojos


import java.io.Serializable
import java.time.LocalDateTime
import java.util.Arrays


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Staff(
    val staffId: Long? = null,
    val firstName: String? = null,
    val lastName: String? = null,
    val addressId: Long? = null,
    val email: String? = null,
    val storeId: Long? = null,
    val active: Boolean? = null,
    val username: String? = null,
    val password: String? = null,
    val lastUpdate: LocalDateTime? = null,
    val picture: ByteArray? = null
): Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other === null)
            return false
        if (this::class != other::class)
            return false
        val o: Staff = other as Staff
        if (this.staffId === null) {
            if (o.staffId !== null)
                return false
        }
        else if (this.staffId != o.staffId)
            return false
        if (this.firstName === null) {
            if (o.firstName !== null)
                return false
        }
        else if (this.firstName != o.firstName)
            return false
        if (this.lastName === null) {
            if (o.lastName !== null)
                return false
        }
        else if (this.lastName != o.lastName)
            return false
        if (this.addressId === null) {
            if (o.addressId !== null)
                return false
        }
        else if (this.addressId != o.addressId)
            return false
        if (this.email === null) {
            if (o.email !== null)
                return false
        }
        else if (this.email != o.email)
            return false
        if (this.storeId === null) {
            if (o.storeId !== null)
                return false
        }
        else if (this.storeId != o.storeId)
            return false
        if (this.active === null) {
            if (o.active !== null)
                return false
        }
        else if (this.active != o.active)
            return false
        if (this.username === null) {
            if (o.username !== null)
                return false
        }
        else if (this.username != o.username)
            return false
        if (this.password === null) {
            if (o.password !== null)
                return false
        }
        else if (this.password != o.password)
            return false
        if (this.lastUpdate === null) {
            if (o.lastUpdate !== null)
                return false
        }
        else if (this.lastUpdate != o.lastUpdate)
            return false
        if (this.picture === null) {
            if (o.picture !== null)
                return false
        }
        else if (!Arrays.equals(this.picture, o.picture))
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.staffId === null) 0 else this.staffId.hashCode())
        result = prime * result + (if (this.firstName === null) 0 else this.firstName.hashCode())
        result = prime * result + (if (this.lastName === null) 0 else this.lastName.hashCode())
        result = prime * result + (if (this.addressId === null) 0 else this.addressId.hashCode())
        result = prime * result + (if (this.email === null) 0 else this.email.hashCode())
        result = prime * result + (if (this.storeId === null) 0 else this.storeId.hashCode())
        result = prime * result + (if (this.active === null) 0 else this.active.hashCode())
        result = prime * result + (if (this.username === null) 0 else this.username.hashCode())
        result = prime * result + (if (this.password === null) 0 else this.password.hashCode())
        result = prime * result + (if (this.lastUpdate === null) 0 else this.lastUpdate.hashCode())
        result = prime * result + (if (this.picture === null) 0 else Arrays.hashCode(this.picture))
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("Staff (")

        sb.append(staffId)
        sb.append(", ").append(firstName)
        sb.append(", ").append(lastName)
        sb.append(", ").append(addressId)
        sb.append(", ").append(email)
        sb.append(", ").append(storeId)
        sb.append(", ").append(active)
        sb.append(", ").append(username)
        sb.append(", ").append(password)
        sb.append(", ").append(lastUpdate)
        sb.append(", ").append("[binary...]")

        sb.append(")")
        return sb.toString()
    }
}
