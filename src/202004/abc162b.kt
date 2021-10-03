fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = (1L..n).toList()
    println(l.filter { it % 3 != 0L && it % 5 != 0L }.sum() )
}
