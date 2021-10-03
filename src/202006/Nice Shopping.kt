fun main(args: Array<String>) {
    val (x, y,z) = readLine()!!.split(" ").map{ it.toInt() }
    val l = readLine()!!.split(" ").map { it.toInt() }
    val l2 = readLine()!!.split(" ").map { it.toInt() }
    var a = l.min()!! + l2.min()!!
    for (i in 0 until z){
        val (alpha, bravo, charlie ) = readLine()!!.split(" ").map{ it.toInt() }
        val ticketUse =  l[alpha - 1] + l2[bravo - 1] - charlie
        if(a > ticketUse){
            a = ticketUse
        }
    }
    println(a)
}
