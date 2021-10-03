fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val hList = readLine()!!.split(' ').map(String::toLong).reversed().toMutableList()

    for (i in 0 until n - 1) {
        if (hList[i] + 1 < hList[i + 1]) {
            println("No")
            return
        } else if (hList[i] < hList[i + 1]) {
            hList[i + 1] = hList[i + 1] - 1
        }
    }
    println("Yes")
}
