fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    if (y == 1) {
        println(0)
    } else {
        var a = 1
        var tmpx = x
        while (tmpx < y) {
            a += 1
            tmpx += x - 1
        }
        println(a)
    }
}
