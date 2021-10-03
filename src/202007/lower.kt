fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }.reversed()
    var current = 0
    var max = 0
    var heigth = l[0]
    for (i in 1 until l.size) {
        if (heigth <= l[i]) current += 1
        else {
            max = Math.max(max, current)
            current = 0
        }
        heigth = l[i]
    }
    println(Math.max(max, current))
}
