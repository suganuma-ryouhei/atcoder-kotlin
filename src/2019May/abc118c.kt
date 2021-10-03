fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }
    var currentGcd = l[0]
    for(i in 0 until n){
        currentGcd = gcd(currentGcd, l[i])
    }
    println(currentGcd)
}

