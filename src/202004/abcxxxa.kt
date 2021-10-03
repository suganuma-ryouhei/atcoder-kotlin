fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var r = mutableListOf<Int>()
    var b = mutableListOf<Int>()
    for (i in 0 until n){
        var (x, c) = readLine()!!.split(" ")
        if(c == "R") r.add(x.toInt()) else b.add(x.toInt())
    }
    val manycolors = r.sorted() + b.sorted()
    for (i in 0 until n){
        println(manycolors[i])
    }
}
