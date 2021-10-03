fun main(args: Array<String>) {
    val (x, k, d) = readLine()!!.split(" ").map { Math.abs(it.toLong()) }
    if (x > k * d) {
        println(x - k * d)
    }
    else
    {
        val remainder = x % d
        // 正サイド
        if (remainder < Math.abs(remainder - d)) {
            if (d - x / k != 1L) {
                println(remainder)
            } else {
                println(Math.abs(remainder - d))
            }
        }
        // 負サイド
        else {
            if (d - x / k != 1L) {
                println(remainder)
            } else {
                println(Math.abs(remainder - d))

            }
        }
    }
}
