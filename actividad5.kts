val precios = listOf(20000.0, 50000.0, 15000.0)
val conRecargo = { precio: Double -> precio * 1.10 }

precios.forEach {
    println("Original: $it | Con recargo nocturno: ${conRecargo(it)}")
}