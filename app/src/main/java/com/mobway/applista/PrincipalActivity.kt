package com.mobway.applista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mobway.applista.adapter.AdapterDeProdutos
import com.mobway.applista.model.Produto

class PrincipalActivity : AppCompatActivity() {

    lateinit var listaComponente: RecyclerView
    lateinit var arrayDeProdutos: ArrayList<Produto>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        /**
         * Carregar lista de produtos
         */
        arrayDeProdutos = Produto.carregarListaMock()

        /**
         *  Componente (RecyclerView)
         *  -> adapter
         *      -> ViewHolder -> (Manipula cada item da lista - linha)
         *
         *
         */
        listaComponente = findViewById(R.id.nosso_componente_lista)
        listaComponente.adapter = AdapterDeProdutos(arrayDeProdutos, this)
        listaComponente.layoutManager = LinearLayoutManager(this)

    }


}