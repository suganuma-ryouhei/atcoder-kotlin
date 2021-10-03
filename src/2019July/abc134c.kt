fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var a =  IntArray(n)
    for (i in 0 until n) {
        a[i] = readLine()!!.toInt()
    }
    val max = a.max()!!
    val second = a.sorted()[n - 2]
    a.forEach {
        (if (it == max) second else max ).let { println(it) }
    }

}