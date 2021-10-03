fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(prime(100004).first { it >= n })
}

