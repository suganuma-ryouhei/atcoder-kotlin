fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }.groupBy { it }
    var m = mutableMapOf<Int, Int>()
    l.forEach{
        m.put(it.key, it.value.size)
    }
    val x = readLine()!!.toInt()
    for (i in 0 until x){
        val (x, y) = readLine()!!.split(" ").map{ it.toInt() }
        if(m.containsKey(y)){
            m[y] = m[x]!! + m[y]!!
            m.remove(x)
        }
        else if (m.containsKey(x)) {
            m.put(y, m[x]!!)
            m.remove(x)
        }
        var a = 0
        m.forEach {
            a += it.key * it.value
        }
        println(a)
    }
}
