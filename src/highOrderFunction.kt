//These functions live inside other
fun suma(num: Int, num2: Int, func: () -> Unit) {
    println("Suma de $num y $num2 es ${num + num2}")
    func()
}

fun String.function(func: (String) -> Unit) {
    func(this)
    println(this.length)
}

fun String.function2(func: String.() -> Unit) {
    func(this)
}

fun main(args: Array<String>) {
    suma(6, 8, func = {
        println("6 + 5 = ${6 + 5}")
    })

    println("----------------------")

    suma(6, 8) {
        println("6 + 6 = ${6 + 6}")
    }

    println("----------------------")

    "Hola".function { println(it) }

    println("----------------------")

    "Holas".function2 { println(length) }
}