fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map{ it.toLong() }
    if((x + y) % 2L == 1L) println("IMPOSSIBLE") else println((x + y) / 2)
}
