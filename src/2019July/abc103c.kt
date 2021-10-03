fun main(args: Array<String>) {
    val s = readLine()!!
    println(readLine()!!.split(" ").map { it.toInt() - 1 }.sum())
}
