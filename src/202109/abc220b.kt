fun main(args: Array<String>) {
    val baseK = readLine()!!.toInt()
    val (x, y) = readLine()!!.split(" ").map { it.toString() }
    println(convertTo10(number = x, baseK = baseK) * convertTo10(number = y, baseK = baseK))
}

fun convertTo10(number: String, baseK: Int): Long {
    val length = number.length
    var a = 0.0
    number.forEachIndexed { index, c ->
        a += (c.toInt() - 48) * Math.pow(baseK.toDouble(), (length - index - 1).toDouble())
    }
    return a.toLong()
}
