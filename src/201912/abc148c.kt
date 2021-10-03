import kotlin.time.measureTimedValue

fun main(args: Array<String>) {
    val (x,y) = readLine()!!.split(" ").map{it.toLong()}
    println(x * y / gcd(x.toInt(), y.toInt()).toLong())
}

