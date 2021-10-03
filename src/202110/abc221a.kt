fun main(args: Array<String>) {
    readLine()!!.split(" ").map{ it.toDouble() }.also {
        println(Math.pow(32.0, (it.first() - it.last())).toInt())
    }
}
