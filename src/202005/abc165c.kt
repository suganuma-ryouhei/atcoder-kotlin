fun main(args: Array<String>) {
    val (x, y, z) = readLine()!!.split(" ").map { it.toInt() }
    var dp = listOf<Int>()
    //DP
    for (i in 0 until 10) {
        dp = dp.plus(i)
        dp.forEach {
            dp += listOf<Int>(it, x)
        }
    }
    println(dp)
}
