fun main(args: Array<String>) {
    var (x, y) = readLine()!!.split(" ").map{ it.toInt() }
    val l = readLine()!!.split(" ").map { it.toInt() }.sorted()
    var a = 0
    for (i in 0 until x - 1){
        if(y >= l[i]){
            y -= l[i]
            a += 1
        }
    }
    if(l.last() == y){
        a += 1
    }
    println(a)
}
