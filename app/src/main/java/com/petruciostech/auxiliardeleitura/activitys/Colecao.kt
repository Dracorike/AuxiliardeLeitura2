package com.petruciostech.auxiliardeleitura.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.petruciostech.auxiliardeleitura.BancoDeDados.DataBase
import com.petruciostech.auxiliardeleitura.BancoDeDados.LivroDAO
import com.petruciostech.auxiliardeleitura.BancoDeDados.LivroModel
import com.petruciostech.auxiliardeleitura.Models.RecycleAdapter
import com.petruciostech.auxiliardeleitura.R



class Colecao : AppCompatActivity() {
    private lateinit var listaDeLivro:RecyclerView
    private lateinit var adaptador:RecycleAdapter
    private val listaLivro = ArrayList<LivroModel>()
    private lateinit var livroDAO:LivroDAO


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colecao)

        livroDAO = DataBase.getInstance(context = this.applicationContext).livroDao()

        livroDAO.insertAll(LivroModel(0, "Teste 1", "Pedro", 100, 10))

        listaLivro.addAll(livroDAO.getAll())
        listaDeLivro = findViewById(R.id.listaLivro)
        adaptador = RecycleAdapter(listaLivro, this)
        var layotManeger:RecyclerView.LayoutManager = LinearLayoutManager(applicationContext)

        listaDeLivro.layoutManager = layotManeger
        listaDeLivro.itemAnimator = DefaultItemAnimator()
        listaDeLivro.adapter = adaptador


    }
}