fun main(args: Array<String>) {
    val (k, n) = readLine()!!.split(" ").map { it.toInt() }
    val ll = readLine()!!.split(" ").map{it.toInt()}.toList()
    var dl = mutableListOf<Int>()
    for(i in 0 until ll.size - 1){
        dl.add(ll[i + 1]  - ll[i])
    }
    dl.add(k - ll.last() + ll.first() )
    val a = dl.reduce{l,r -> r + l} - dl.max()!!
    println(a)
}
