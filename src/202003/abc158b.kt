fun main(args: Array<String>) {
    var (l, x, y) = readLine()!!.split(" ").map{ it.toInt() }
    println( (l / (x + y)) * x + Math.min(x, l % (x + y)))
}
