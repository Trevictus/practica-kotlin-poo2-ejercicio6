class Domicilio(private val calle: String, private val numero: Int) {

    fun dirCompleta() = "$calle, $numero"
}