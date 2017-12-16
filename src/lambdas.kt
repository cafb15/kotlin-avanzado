data class Car(val color: String, val tire: Int, val doors: Int)

fun main(args: Array<String>) {
    val num: Int? = null
    val car = Car("Black", 4, 4)

    car.let {
        it.doors
        with(it) {
            println(color)
        }
    }

    println(sum(4, 7))
    println(minFour("Holas"))
    println(different(2, 2))
}

val different:(Int, Int) -> Int = { a, b -> (a * b) - (a + b) }
val sum:(Int, Int) -> Int = { x, y -> x + y }
val minFour:(String) -> Boolean = { it.length > 4 }