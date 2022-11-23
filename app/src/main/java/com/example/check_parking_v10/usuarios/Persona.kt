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
)
