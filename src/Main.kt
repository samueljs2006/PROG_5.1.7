fun main() {
    val vehiculo1 = Vehiculo("Toyota", "Corolla", 50)
    vehiculo1.mostrarInformacion()
    println("Autonomía: ${vehiculo1.calcularAutonomia()} km\n")

    val auto1 = Automovil("Ford", "Mustang", 60, "Deportivo")
    auto1.mostrarInformacion()
    println("Autonomía: ${auto1.calcularAutonomia()} km\n")

    val moto1 = Motocicleta("Yamaha", "YZF-R1", 20, 1000)
    moto1.mostrarInformacion()
    println("Autonomía: ${moto1.calcularAutonomia()} km")
}
