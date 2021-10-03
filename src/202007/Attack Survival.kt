fun main(args: Array<String>) {
    val (x, y, z) = readLine()!!.split(" ").map { it.toInt() }
    var array = Array(x) { y - z }
    for (i in 0 until z) {
        array[readLine()!!.toInt() - 1] += 1
    }
    array.forEach {
        (if (it > 0) "Yes" else "No").let { a ->
            println(a)
        }
    }
}
