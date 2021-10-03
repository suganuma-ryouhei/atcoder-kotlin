fun main(args: Array<String>) {
    var l = readLine()!!.split("").filter { it.isNotEmpty() }.map { it.toLong() }.sortedDescending().toMutableList()
    var reft = l[0]
    var light = l[1]
    l = l.drop(2).toMutableList()
    for (i in 0 until l.size) {
        if ((reft * 10 + l.first()) * light > reft * (light * 10 + l.first())) reft = reft * 10 + l.first()
        else light = light * 10 + l.first()
        l = l.drop(1).toMutableList()
    }
    println(reft * light)
}
