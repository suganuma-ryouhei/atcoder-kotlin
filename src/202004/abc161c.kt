fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map{ it.toLong() }
    println(Math.min( x % y, Math.abs(x % y - y ) ) )
}
