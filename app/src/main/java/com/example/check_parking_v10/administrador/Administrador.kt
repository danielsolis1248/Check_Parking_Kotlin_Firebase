package com.example.check_parking_v10.administrador

data class Administrador(
    var id:Int?, //Autoincrementable
    var nombre:String?,
    var apellido:String?,
    var email:String?,
    var telefono:Int?,
    var nameUsuario: String? = null,
    var password:String? = null

) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Administrador

        if (id != other.id) return false
        if (nombre != other.nombre) return false
        if (apellido != other.apellido) return false
        if (email != other.email) return false
        if (telefono != other.telefono) return false
        if (nameUsuario != other.nameUsuario) return false
        if (password != other.password) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id ?: 0
        result = 31 * result + (nombre?.hashCode() ?: 0)
        result = 31 * result + (apellido?.hashCode() ?: 0)
        result = 31 * result + (email?.hashCode() ?: 0)
        result = 31 * result + (telefono ?: 0)
        result = 31 * result + (nameUsuario?.hashCode() ?: 0)
        result = 31 * result + (password?.hashCode() ?: 0)
        return result
    }
}
