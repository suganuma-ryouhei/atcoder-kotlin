fun main(args: Array<String>) {
    var a = 0
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }
    val sortedl = l.sorted()
    for (i in 0 until n) {
        if(l[i] != sortedl[i]) a += 1
    }
    println(if(a == 0 || a == 2) "YES" else "NO")
}