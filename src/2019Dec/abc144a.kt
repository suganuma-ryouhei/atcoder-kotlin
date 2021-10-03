fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map{ it.toInt() }
    (if(x < 10 && y < 10) x * y else -1).let{println(it)}
}