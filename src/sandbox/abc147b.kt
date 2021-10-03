fun main(args: Array<String>) {
    val l = readLine()!!
    val ll = l.length
    var a = 0
    for (i in 0 until ll / 2){
        if (l[i] != l[ll - i - 1]){
            a += 1
        }
    }
    println(a)
}