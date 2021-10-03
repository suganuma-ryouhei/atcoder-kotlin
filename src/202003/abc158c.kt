fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map{ it.toInt() }
    var a = -1
    for(i in 0 until 1009){
        if((i * 0.08).toInt() == x && (i * 0.1).toInt() == y){
            a = i
            break;
        }
    }
    println (a)
}
