fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    if (x == 0 || y == 0 || x < 0 && y > 0) println("Zero")
    else {
        val n =  y - x
        (if (x > 0 || n % 2 != 0) "Positive" else "Negative").let { println(it) }
    }
}
