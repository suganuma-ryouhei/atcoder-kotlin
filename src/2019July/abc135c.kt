fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val monsterL = readLine()!!.split(" ").map { it.toLong() }.toMutableList()
    val heroL = readLine()!!.split(" ").map { it.toLong() }
    var kill = 0L
    for (i in 0 until n) {
        when {
            monsterL[n - i] < heroL[n - i - 1] ->{
                kill += Math.min(monsterL[n - i] + monsterL[n - i - 1], heroL[n - i - 1])
                monsterL[n - i - 1] =  Math.max(monsterL[n - i] + monsterL[n - i - 1] - heroL[n - i - 1], 0)
            }
            else -> kill += heroL[n - i - 1]
        }
    }

    println(kill)
}