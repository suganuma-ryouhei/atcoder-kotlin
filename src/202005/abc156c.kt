fun main(args: Array<String>) {
    readLine()
    val l = readLine()!!.split(" ").map { it.toInt() }.sorted()
    var a = 999999999
    for (i in l.first() .. l.last()){
        val tmp = l.map{ Math.abs(it - i) * Math.abs(it - i) }.sum()
        a = Math.min(a, tmp )
    }
    println(a)
}
