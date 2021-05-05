package com.petruciostech.auxiliardeleitura.BancoDeDados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LivroModel(
    @PrimaryKey(autoGenerate = true) val livroId:Int,
    @ColumnInfo(name = "titulo") val titulo:String?,
    @ColumnInfo(name = "autor") val autor:String?,
    @ColumnInfo(name = "totPaginas") val totPaginas:Int?,
    @ColumnInfo(name = "pagParou") val pagParou:Int?
)