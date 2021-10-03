fun main(args: Array<String>) {
    val n = readLine()!!.toLong()
    println( (n / 500) * 1000 + (n % 500 / 5) * 5  )
}
