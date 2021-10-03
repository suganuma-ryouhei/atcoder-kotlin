fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map{ it.toInt() }
    val n = readLine()!!.split(' ').map { it.toInt() }.sum()
    (if (x < n) -1 else x - n).let{ println(it) }
}
