val edad: Int = 9
val esUrgencia: Boolean = false

val categoria = when (edad) {
    in 0..1 -> "Cachorro"
    in 2..7 -> "Adulto"
    in 8..Int.MAX_VALUE -> "Senior"
    else -> "Edad no válida"
}

if (esUrgencia || categoria == "Senior") {
    println("Prioridad Alta")
} else {
    println("Atención Regular")
}