fun main(args: Array<String>) {
    val n = readLine()!!.toLong()
    var  a = Long.MAX_VALUE
    for (i in 1 .. Math.sqrt(n.toDouble() + 1).toInt()) {
        if (n % i == 0L){
            a = (n / i) + i - 2
        }
    }
    println(a)
}