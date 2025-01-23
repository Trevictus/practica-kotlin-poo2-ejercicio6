class RepositorioCompras() {

    private val compras = mutableListOf<Compra>()

    fun agregar(compra:Compra){
        compras.add(compra)

    }

    fun agregar(cliente: Cliente, dia: Int, monto: Double){
        compras.add(Compra(cliente, dia, monto))
    }

    fun domicilios(): List<Domicilio>{
        val domicilios = mutableSetOf<Domicilio>()

        for(compra in compras){
            domicilios.add(compra.cliente.domicilio)
        }
        return domicilios.toList()
    }
}