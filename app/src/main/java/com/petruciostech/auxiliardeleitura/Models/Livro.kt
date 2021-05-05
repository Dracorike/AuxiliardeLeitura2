package com.petruciostech.auxiliardeleitura.Models
class Livro(titulo:String, pagina:Int){
    private val titulo:String = titulo
    private val pagina:Int = pagina

    fun getTitulo():String = this.titulo
}