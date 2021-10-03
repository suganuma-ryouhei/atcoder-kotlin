fun main(args: Array<String>) {
    val mod = 1000000007L
    val N = readInputLine().toInt()
    val AArr = readInputLine().split(" ").map { it.toLong() }
    val bits = LongArray(64)

    var ans = 0L

    for (A in AArr) {
        for (i in 0 until 64) {
            if ((A shr i) % 2L == 1L) {
                bits[i]++
            }
        }
    }

    for (i in 0 until 64) {
        ans += (((1L shl i) % mod) * bits[i] % mod) * (N.toLong() - bits[i]) % mod
        ans %= mod
    }

    println(ans)
}

fun readInputLine(): String {
    return readLine()!!
}