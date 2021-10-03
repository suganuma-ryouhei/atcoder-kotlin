import kotlin.math.roundToInt

fun main(args: Array<String>) {
    var a = 100L
    val n = readLine()!!.toLong()
    for (i in 1 until 10000){
        a = (a * 1.01).toLong()
        if (a >= n)
        {
            println(i)
            break
        }
    }
}
