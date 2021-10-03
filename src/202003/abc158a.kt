fun main(args: Array<String>) {
    val a = readLine()!!.split("").toSet()
    (if (a.size == 3) "Yes" else "No").let { println(it) }
}
