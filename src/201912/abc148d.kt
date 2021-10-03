fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var c = 1
    var b = 0
    for(i in 0 until n){
        if(a[i] == c){
            c += 1
        }
        else b += 1
    }
    (if (c != 1) b else -1).let { println(it) }
}
