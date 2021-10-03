fun main(args: Array<String>) {
    val l = readLine()!!.toCharArray()
    val l2 = readLine()!!.toCharArray()
    var a = 0
    for (i in 0 until l.size){
        if (l[i] != l2[i]){
            a += 1
        }
    }
    println(a)
}
