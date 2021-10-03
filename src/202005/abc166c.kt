fun main(args: Array<String>) {
    val (n, y) = readLine()!!.split(" ").map{ it.toInt() }
    val heightOfN = readLine()!!.split(" ").map{ it.toInt() }
    var badOfN  = mutableSetOf<Int>()
    for (i in 0 until y){
        val (x, y) = readLine()!!.split(" ").map{ it.toInt() }
        if (heightOfN[x - 1] >= heightOfN[y - 1])  {
            badOfN.add(y)
        }
        if (heightOfN[x - 1] <= heightOfN[y - 1])  {
            badOfN.add(x)
        }
    }
    println(n - badOfN.size)
}
