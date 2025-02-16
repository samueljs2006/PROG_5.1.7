class Automovil(
    marca: String,
    modelo: String,
    capacidadCombustible: Int,
    val tipo: String // tipo de automóvil (sedán, SUV, deportivo, etc.)
) : Vehiculo(marca, modelo, capacidadCombustible) {

    override fun calcularAutonomia(): Int {
        val autonomiaBase = super.calcularAutonomia()
        return autonomiaBase + 100  // Automóvil tiene 100 km más que la autonomía base
    }

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Tipo de Automóvil: $tipo")
    }
}