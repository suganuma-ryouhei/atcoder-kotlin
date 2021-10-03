fun main(args: Array<String>) {
    val l = readLine()!!.split("").toList()
    (if (l[2] == "S") Math.min(1, l.filter { it == "R" }.size)
    else l.filter { it == "R" }.size).let { println(it) }
}
