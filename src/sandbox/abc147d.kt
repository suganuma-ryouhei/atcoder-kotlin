fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map{it.toLong()}
    var bits = LongArray(1000) { i -> 0}.toMutableList()
    var a = 0.0
    l.forEach{
        var tmp = it
        var runk = 0
        while (tmp >= 1){
            if (tmp % 2 == 1L){
                bits[runk] += 1L
            }
            runk += 1
            tmp /= 2
        }
        bits[runk] += tmp
    }
    l.forEach {
        var tmp = it
        var runk = 0
        bits.forEach{
            if (tmp % 2 == 0L){
                a += bits[runk] * Math.pow(2.0,runk.toDouble()) % 100000007
            }
            else {
                a += (n - bits[runk]) * Math.pow(2.0,runk.toDouble()) % 100000007
            }
            runk += 1
            tmp /= 2
        }
    }
    println(a.toInt())
}