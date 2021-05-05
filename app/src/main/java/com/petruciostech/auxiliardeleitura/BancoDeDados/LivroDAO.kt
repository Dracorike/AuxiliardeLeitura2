package com.petruciostech.auxiliardeleitura.BancoDeDados

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface LivroDAO {
    @Query("SELECT * FROM livromodel")
    fun getAll():List<LivroModel>

    @Query("SELECT * FROM livromodel WHERE livroId IN (:livrosIds)")
    fun loadAllByIds(livrosIds:IntArray):List<LivroModel>

    @Query("SELECT * FROM livromodel WHERE titulo LIKE :name LIMIT 1")
    fun findByName(name:String):LivroModel

    @Insert
    fun insertAll(vararg livros:LivroModel)

    @Delete
    fun delete(livro:LivroModel)
}