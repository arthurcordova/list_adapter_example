package com.mobway.applista.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobway.applista.R
import com.mobway.applista.adapter.viewholder.ViewHolderItemProduto
import com.mobway.applista.model.Produto

class AdapterDeProdutos(val arrayDeProdutos: ArrayList<Produto>, val context: Context) :
    RecyclerView.Adapter<ViewHolderItemProduto>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItemProduto {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.linha_da_nossa_lista_de_produto, parent, false)
        return ViewHolderItemProduto(view)
    }

    override fun onBindViewHolder(holder: ViewHolderItemProduto, position: Int) {
        arrayDeProdutos[position].apply {
            holder.textViewIdProduto.text = this.id.toString()
            holder.textViewNomeProduto.text = this.nome
            holder.textViewCategoriaProduto.text = this.categoria
            holder.textViewPrecoProduto.text = this.preco.toString()
        }
    }

    override fun getItemCount(): Int {
        return arrayDeProdutos.size
    }

}

