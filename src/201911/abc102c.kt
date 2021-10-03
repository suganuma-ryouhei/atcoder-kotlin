fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val aList = readLine()!!.split(" ").map { it.toLong() }
        .mapIndexed { index, i -> i - (index + 1) }
        .sorted()

    val mid = aList[aList.size / 2]

    val answer = aList.map { Math.abs(it - mid) }.sum()

    println(answer)
}
