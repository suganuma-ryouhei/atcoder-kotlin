fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map{ it.toInt() }
    var list = (1..x).toList()
    for (i in 0 until y){
        val n = readLine()!!.toInt()
        readLine()!!.split(" ").map { it.toInt() }.forEach {
            list = list.minus(it)
        }
    }
    println(list.size)
}
