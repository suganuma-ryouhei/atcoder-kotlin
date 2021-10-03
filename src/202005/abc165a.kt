fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    var a = "NG"
    for (i in 0 until 1000) {
        if (n * i in x..y) {
            a = "OK"
        }
    }
    println(a)
}
