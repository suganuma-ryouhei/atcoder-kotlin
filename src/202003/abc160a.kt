fun main(args: Array<String>) {
    val s = readLine()!!.split("").toList()
    (if(s[3] == s[4] && s[5] == s[6]) "Yes" else "No").let { println(it) }
}
