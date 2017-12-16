sealed class Intention {
    object Refresh : Intention() {
        override fun log() {
            println("is refreshing")
        }
    }

    object LoadMore : Intention() {
        override fun log() {
            println("load more")
        }
    }

    data class Error(private val reason: String) : Intention() {
        override fun log() {
            println(reason)
        }
    }

    abstract fun log()
//    class Refresh : Intention()
//    class Rerefresh : Intention()
}

fun validate(intention: Intention): String = when(intention) {
        is Intention.Refresh -> "Refresh"
        is Intention.LoadMore -> "Load more"
        is Intention.Error -> "Error"
}

fun main(args: Array<String>) {

    var intention: Intention = Intention.Refresh
    var output = validate(intention)

    println(output)
    println("----------------------------")

    intention = Intention.LoadMore
    output = validate(intention)
    println(output)
    println("----------------------------")

    intention = Intention.Error("eer")
    output = validate(intention)
    println(output)
//    val intention: Intention = Intention.Refresh()
//    val intention2: Intention = Intention.Rerefresh()
//
//    val output = when(intention) {
//        is Intention.Refresh -> "refresh"
//        is Intention.Rerefresh -> "rerefresh"
//    }
//
//    println(output)
}