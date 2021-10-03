fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map{ it.toInt() }
    val l = readLine()!!.split(" ").map { it.toDouble() }.sorted().reversed()
    val al = l.sum()
    val popl = l.subList(0, y)
    if (popl.all { it >= al / 4 / y }) println("Yes") else println("No")
}
