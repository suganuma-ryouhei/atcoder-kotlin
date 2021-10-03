fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val l = readLine()!!.split(" ").map { it.toInt() }.sorted()
    println( l.take(y).sum() )
}
