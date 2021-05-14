package com.mobway.applista.adapter.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mobway.applista.R

class ViewHolderItemProduto(view: View) : RecyclerView.ViewHolder(view) {

    var textViewIdProduto: TextView
    var textViewNomeProduto: TextView
    var textViewCategoriaProduto: TextView
    var textViewPrecoProduto: TextView

    init {

        textViewIdProduto = view.findViewById(R.id.textViewIdProduto)
        textViewNomeProduto = view.findViewById(R.id.textViewNomeProduto)
        textViewCategoriaProduto = view.findViewById(R.id.textViewCategoriaProduto)
        textViewPrecoProduto = view.findViewById(R.id.textViewPrecoProduto)

    }
}