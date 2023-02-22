package com.example.listadeprodutos.Adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listadeprodutos.R
import com.example.listadeprodutos.model.Produto

class AdapterProduto(private val context: Context, private val produtos: MutableList<Produto>): RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val foto = itemView.findViewById<ImageView>(R.id.fotoProduto)
            val nome = itemView.findViewById<TextView>(R.id.nomeProduto)
            val descriçao = itemView.findViewById<TextView>(R.id.descriçaoProduto)
            val preço = itemView.findViewById<TextView>(R.id.preçoProduto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.hardware_item, parent, false)
        val holder = ProdutoViewHolder(itemLista)
        return holder
    }

    override fun getItemCount(): Int = produtos.size


    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
                holder.foto.setImageResource(produtos[position].foto)
                holder.nome.text = produtos[position].nome
                holder.descriçao.text = produtos[position].descriçao
                holder.preço.text = produtos[position].preço
    }
}