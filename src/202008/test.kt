
fun main(args: Array<String>) {
    val (x, y, z) = readLine()!!.split(" ").map{ it.toInt() }
    var a = -1
    for (i in 0 .. y / z)
        if (i * z in x..y) {
            a = i * z
        }
    println(a)
}
