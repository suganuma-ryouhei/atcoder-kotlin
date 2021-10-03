fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.filter { it != ' ' }
    var aa = ""
    for(i in 0 until n){
        aa += (a[i])
        aa += (a[i + n])
    }
    println(aa)
}
