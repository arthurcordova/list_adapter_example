package com.mobway.applista.model

class Produto(
    val id: Int,
    val nome: String,
    val categoria: String,
    val preco: Double
) {

    companion object {

        fun carregarListaMock(): ArrayList<Produto> {
            val lista = arrayListOf<Produto>()
            Produto(1097645, "Macarrao", "Comida", 10.99).let {
                lista.add(it)
            }
            Produto(9876667, "Fralda", "Higiene", 50.99).let {
                lista.add(it)
            }
            Produto(9655555, "Cerveja", "Bebida", 5.99).let {
                lista.add(it)
            }
            Produto(9843254, "Sabonete", "Higiene", 10.99).let {
                lista.add(it)
            }
            Produto(6543223, "Refrigerante", "Bebida", 6.99).let {
                lista.add(it)
            }
            return lista
        }

    }
}



