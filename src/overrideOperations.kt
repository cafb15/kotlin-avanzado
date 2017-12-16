data class Time(val year: Int, val day: Int)

operator fun Time.plus(other: Time): Time {
    return Time(this.year + other.year, this.day + other.day)
}

data class Counter(private val index: Int) {
    operator fun inc(): Counter {
        return Counter(index + 1)
    }
}

fun main(args: Array<String>) {
    val time1 = Time(2000, 30)
    val time2 = Time(100, 10)

    val plusTime = time1 + time2
    val counter = Counter(5)

    println(plusTime)
    println(counter.inc())
}