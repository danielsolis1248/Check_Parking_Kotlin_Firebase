package com.example.check_parking_v10.usuarios

import java.sql.Timestamp

data class Persona(
    var id:Int?, //Autoincrementable
    var nombre:String?,
    var numero_de_placas:String?,
    var licenciatura:String?,
    var rol:Int?,
    var fecha_entrada:Timestamp?,
    var hora_entrada:Timestamp?,
    var fecha_salida:Timestamp?,
    var hora_salida:Timestamp?
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Persona

        if (id != other.id) return false
        if (nombre != other.nombre) return false
        if (numero_de_placas != other.numero_de_placas) return false
        if (licenciatura != other.licenciatura) return false
        if (rol != other.rol) return false
        if (fecha_entrada != other.fecha_entrada) return false
        if (hora_entrada != other.hora_entrada) return false
        if (fecha_salida != other.fecha_salida) return false
        if (hora_salida != other.hora_salida) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id ?: 0
        result = 31 * result + (nombre?.hashCode() ?: 0)
        result = 31 * result + (numero_de_placas?.hashCode() ?: 0)
        result = 31 * result + (licenciatura?.hashCode() ?: 0)
        result = 31 * result + (rol ?: 0)
        result = 31 * result + (fecha_entrada?.hashCode() ?: 0)
        result = 31 * result + (hora_entrada?.hashCode() ?: 0)
        result = 31 * result + (fecha_salida?.hashCode() ?: 0)
        result = 31 * result + (hora_salida?.hashCode() ?: 0)
        return result
    }
}
