fun main(args: Array<String>) {
    val (x, y,z) = readLine()!!.split(" ").map{ it.toInt() }
    val l = readLine()!!
    var ac = 0
    var bc = 0
    for (i in 0 until x){
        if (l[i] == 'a' && ac + bc < y + z){
            ac += 1
            println("Yes")
        }
        else if (l[i] == 'b' && ac + bc < y + z && bc < z){
            bc += 1
            println("Yes")
        }
        else println("No")
    }
}
