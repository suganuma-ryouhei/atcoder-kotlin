fun main(args: Array<String>) {
    val N = readLine()!!.toInt() // 人
    val pss = Array(N) {
        val A = readLine()!!.toInt() // 証言数
        Array(A) { readLine()!!.split(" ").map { it.toInt() } } // 証言
    }

    var res = 0
    for (i in 0 until (1 shl N)) {
        println(i)
        var flag = true

        for (j in pss.indices) {
            if ((i shr j) and 1 == 0) {
                continue
            }

            for (l in pss[j]) {
                flag = flag && (i shr (l[0] - 1)) and 1 == l[1]
            }
        }

        if (flag) {
            res = Math.max(res, Integer.bitCount(i))
        }
    }

    println(res)
}
