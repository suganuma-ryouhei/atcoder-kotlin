data class Kukan(val start: Int, val login: Int)

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var kukans = mutableListOf<Kukan>()
    for (i in 0 until n) {
        readLine()!!.split(" ").map { it.toInt() }.also {
            kukans.add(Kukan(it.first() - 1, it.sum() - 1))
        }
    }
    var sortedKukans = kukans.sortedBy { it.start }
    var loginSum = mutableListOf<Int>()
    var i = 0
    while (sortedKukans.isNotEmpty()) {
        loginSum.add(sortedKukans.filter { it.start <= i }.size)
        i += 1
        while (sortedKukans.first().login <= i) {
            sortedKukans = sortedKukans.drop(1)
        }
    }
    println(loginSum)

}
