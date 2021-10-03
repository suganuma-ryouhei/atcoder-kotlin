fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }
    if (n < 3) println(0)
    else {
        var a = 0
        for(i in 0 until n){
            for (j in i + 1 until n){
                for (k in j + 1 until n){
                    if (l[i] != l[j] && l[j] != l[k] && l[k] != l[i]){
                        if (l[i] + l[j] > l[k] && l[j] + l[k] > l[i] && l[k] + l[i] > l[j] )
                        {
                            a += 1
                        }
                    }
                }
            }
        }
        println(a)
    }
}
