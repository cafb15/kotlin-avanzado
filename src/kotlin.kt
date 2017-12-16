fun main(args: Array<String>) {

    var d: Any = 4

    if (d is Int) {
        println(d)
    } else if (d is String) {
        println(d.length)
    } else if (d is Persona) {
        println(d.nombre)
    }

    println("---------------")

    for (a in 4 downTo 1 step 2) {
        println(a)
    }

    val isOnce = (1..12 step 2).last == 11
    println(isOnce)

    val a: Any = 14
    when(a) {
        is Int -> {
            println("Con corchetes")
        }
        is String -> println("Es un texto")
    }

    val persona = Persona("sas", apellido = "12", edad = 12)
    val persona2 = Persona("a", "b", 14)
    val persona3 = Persona()

    println(persona)
    println(persona2)
    println(persona3)

//    val nombres = persona.nombre
//    val apellidos = persona.apellido
//    val edad = persona.edad

    val (x, y, z) = Persona("a", "qq", 23)
    println(x)
    println(y)
    println(z)
    println("---------------------")

    var resultado = 2.multiply(3)
    resultado = 4 multiply 5
    println(resultado)

    val f: String? = null
    val aa = f?.length ?: 0
}

infix fun Int.multiply(x: Int): Int {
    return this * x
}

fun plus(x: Int, y: Int): Int = x + y

data class Persona(val nombre: String = "asasa", val apellido: String = "assad", val edad: Int = 12)