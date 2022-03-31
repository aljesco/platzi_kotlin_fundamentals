fun main(args: Array<String>) {
    println("Hello World!")
    println("Hello again!")
    println("Hello once again!")

    var numeroEntero = 10
    val cadenaCaracteres = "String constante"
    val constanteBooleana = true
    val numeroLargo = 3L
    val numeroDouble = 2.7182
    val numeroFloat = 1.1f

    // Dos diferentes maneras de concatenar cadenas de texto
    val nombre = "Alberto"
    val apellido = "Escobar"
    val nombreCompleto1 = nombre + " " + apellido
    val nombreCompleto2 = "$nombre $apellido" //Interpolación para concatenar

    // Estructura de control if, else if, else
    if (nombreCompleto1.isNotEmpty()) println("El largo de nombreCompleto1 ($nombreCompleto1) es: ${nombreCompleto1.length}") else println("Error, la variable nombreCompleto1 está vacía.")

    val mensaje : String = if (nombre.length > 4) {
        "El nombre es largo."
    } else if (nombre.isEmpty()) {
        "El nombre está vacío."
    } else {
        "El nombre es corto."
    }
    println(mensaje)

    // Estructura de control when
    val nombreColor = "Amarillo"
    when (nombreColor) {
        "Amarillo" -> println("El color es amarillo.")
        "Rojo" -> println("El color es rojo.")
        "Verde claro", "Verde oscuro" -> println("El color es verde.")
        else -> println("Es otro color.")
    }

    val codigo = 404
    when (codigo) {
        in 200..299 -> println("Está entre 200 y 299.")
        in 300..399 -> println("Está entre 300 y 399.")
        in 400..499 -> println("Está entre 400 y 499.")
        else -> println("Código desconocido.")
    }

    //When con asignación
    val tallaDeZapatos = 41
    val mensajeCliente = when(tallaDeZapatos) {
        41, 43 -> "Disponibles"
        42, 44 -> "Poca existencia"
        45 -> "Sin stock"
        else -> "Las tallas están entre 41 y 45"
    }
    println(mensajeCliente)

    // While
    var contador = 10
    while (contador > 0) {
        println("El valor de contador es $contador.")
        contador --
    }

    // Do while
    do {
        println("Generando un número aleatorio ...")
        val numeroAleatorio = (0..100).random()
        println("El número generado es $numeroAleatorio")
    } while (numeroAleatorio > 50)

    // For
    val listaDeFrutas = listOf("Manzana", "Pera", "Durazno")
    for (fruta in listaDeFrutas) {
        println("Fruta con FOR es $fruta")
    }

    // El mismo FOR en sintaxis comprimida
    for (fruta in listaDeFrutas) println("Fruta con FOR comprimido es $fruta")

    // El mismo FOR usando una función anónima
    listaDeFrutas.forEach { fruta -> println("Fruta con FOREACH es $fruta") }

    // Map
    val cantidadCaracteresFrutas = listaDeFrutas.map { fruta -> fruta.length }
    println(cantidadCaracteresFrutas)

    // Función filter
    val listaFiltrada = cantidadCaracteresFrutas.filter { cantidadCaracteresFruta -> cantidadCaracteresFruta > 5 }
    println(listaFiltrada)

        // Try adding program arguments via Run/Debug configuration.
        // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
        println("Program arguments: ${args.joinToString()}")
}