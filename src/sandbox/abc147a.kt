fun main(args: Array<String>) {
    (if (readLine()!!.split(" ").map{it.toInt()}.sum() < 22) "win" else "bust").let { println(it) }
}