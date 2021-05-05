package com.petruciostech.auxiliardeleitura.Models

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.petruciostech.auxiliardeleitura.BancoDeDados.LivroModel
import com.petruciostech.auxiliardeleitura.R

class RecycleAdapter(private val livroList:ArrayList<LivroModel>, private val context:Context):
RecyclerView.Adapter<RecycleAdapter.MyViewHolder>(){

    class MyViewHolder(view: View):RecyclerView.ViewHolder(view){
        var textLivro:TextView = view.findViewById(R.id.textTitule)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView:View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textLivro.text = livroList[position].titulo
        holder.itemView.setOnClickListener { Toast
            .makeText(context, "Click!", Toast.LENGTH_LONG).show() }
    }

    override fun getItemCount(): Int = livroList.size
}