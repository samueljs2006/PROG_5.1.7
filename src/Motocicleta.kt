class Motocicleta(
    marca: String,
    modelo: String,
    capacidadCombustible: Int,
    val cilindrada: Int // cilindrada de la motocicleta
) : Vehiculo(marca, modelo, capacidadCombustible) {

    override fun calcularAutonomia(): Int {
        val autonomiaBase = super.calcularAutonomia()
        return autonomiaBase - 40  // Motocicleta tiene 40 km menos que la autonomía base
    }

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Cilindrada: $cilindrada cc")
    }
}