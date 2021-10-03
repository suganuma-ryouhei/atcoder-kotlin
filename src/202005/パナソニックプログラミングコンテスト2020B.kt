fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toLong() }
    when {
        x == 1L || y == 1L -> 1
        x * y % 2 == 1L -> x * y / 2 + 1L
        else -> x * y / 2
    }.let { println(it) }
}
