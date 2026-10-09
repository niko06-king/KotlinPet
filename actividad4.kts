val contactoEmergencia: String? = null

println("Longitud: ${contactoEmergencia?.length}")

val contactoFinal = contactoEmergencia ?: "Sin contacto registrado"
println(contactoFinal)