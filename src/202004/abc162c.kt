fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    val gcdList = Array(n + 1, { arrayOfNulls<Int>(n + 1) }).toMutableList()
    var sum = 0L
    for (i in 1..n) {
        for (j in 1..n) {
            gcdList[i][j] = gcd(i, j)
        }
    }
    for (i in 1..n) {
        for (j in 1..n) {
            for (k in 1..n) {
                sum += gcd(gcdList[i][j]!!, k)
            }
        }
    }
    println(sum)
}

fun gcd(a: Int, b: Int): Int {
    if (b == 0) return Math.abs(a)
    return gcd(b, a % b)
}
