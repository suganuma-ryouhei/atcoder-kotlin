
fun main(args: Array<String>) {
    val (n, a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    val v = IntArray(n)
    for(i in 0 until n){
        v[i] = readLine()!!.toInt()
    }

    var ans = 1000000000L

    for(i in 0 until (1 shl (n * 2))){
        var tmp = IntArray(3, {0})
        var now = i
        var cos = 0L
        for(j in 0 until n){
            val seica = now % 4
            now /= 4
            if(seica < 3){
                if(tmp[seica] != 0){
                    cos += 10
                }
                tmp[seica] += v[j]
            }
        }
        var flag = true
        for(j in 0 until 3)if(tmp[j] == 0)flag = false
        if(flag){
            //println(tmp.joinToString())
            cos += Math.abs(a - tmp[0])
            cos += Math.abs(b - tmp[1])
            cos += Math.abs(c - tmp[2])
            ans = Math.min(ans, cos)
        }

    }

    println(ans)
}
