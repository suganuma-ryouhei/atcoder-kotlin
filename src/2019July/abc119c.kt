fun main(args: Array<String>) {
	val (n, a, b, c) = readLine()!!.split(" ").map { it.toInt() }
	val v = IntArray(n)
	for (i in 0 until n) {
		v[i] = readLine()!!.toInt()
	}

	var answer = Long.MAX_VALUE

	for (i in 0 until (1 shl (n * 2))) {
		var tmp = IntArray(3, { 0 })
		var now = i
		var cost = 0L
		for (j in 0 until n) {
			val currentchecking = now % 4
			now /= 4
			if (currentchecking < 3) {
				if (tmp[currentchecking] != 0) {
					cost += 10
				}
				tmp[currentchecking] += v[j]
			}
		}
		var flag = true
		for (j in 0 until 3) if (tmp[j] == 0) flag = false
		if (flag) {
			answer = Math.min(answer, (cost + Math.abs(a - tmp[0]) + Math.abs(b - tmp[1]) + Math.abs(c - tmp[2]).toLong()))

		}

	}
	println(answer)
}