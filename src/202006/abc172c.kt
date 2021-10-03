fun main(args: Array<String>) {
    val (x, y, z) = readLine()!!.split(" ").map { it.toInt() }
    var l = (mutableListOf(0L) + readLine()!!.split(" ").map { it.toLong() }).toMutableList()
    var l2 = (mutableListOf(0L) + readLine()!!.split(" ").map { it.toLong() }).toMutableList()
    var a = 0
    for (i in 0 until x) {
        l[i + 1] = l[i] + l[i + 1]
    }
    for (i in 0 until y) {
        l2[i + 1] = l2[i] + l2[i + 1]
    }

    for (i in 0..x) {
        if (l[i] > z) break
        val j = l2.binarySearch(z - l[i])
        if (j < 0) {
            a = Math.max(i - (j + 1) - 1, a)
        } else {
            a = Math.max(i + j, a)
        }
    }
    println(a)
}
