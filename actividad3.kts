val pacientes = listOf("Max", "Luna", "Rocky", "Bella")

for ((i, nombre) in pacientes.withIndex()) {
    println("Turno ${i + 1}: $nombre")
}

for (minuto in 5 downTo 1) {
    println("La clínica abre en $minuto minutos")
}