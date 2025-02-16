open class Vehiculo(
    val marca: String,
    val modelo: String,
    val capacidadCombustible: Int
) {
    open fun mostrarInformacion() {
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Capacidad de Combustible: $capacidadCombustible litros")
    }

    open fun calcularAutonomia(): Int {
        return capacidadCombustible * 10  // Cada litro da para 10 km
    }
}