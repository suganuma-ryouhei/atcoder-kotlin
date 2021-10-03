fun main(args: Array<String>) {
    val n = readLine()!!.toLong()
    var list = mutableListOf<Long>()
    for (i in 0 until 1000){
        list.add((i.toLong() * i * i * i * i))
    }
    var lefta = 0
    var righta = 0
    list.forEach {left:Long ->
        list.forEach {right:Long ->
            if (left - right == n) {
                lefta = list.indexOf(left)
                righta = list.indexOf(right)
            }
            else if (left + right == n) {
                lefta = list.indexOf(left)
                righta = list.indexOf(right) * -1
            }
        }
    }
    println("$lefta $righta" )
}
