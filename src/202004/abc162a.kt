fun main(args: Array<String>) {
    val l = readLine()!!.toInt()
    if(l % 10 == 7 || l / 10 % 10 == 7 || l / 100 == 7 ) println("Yes") else println("No")
}
