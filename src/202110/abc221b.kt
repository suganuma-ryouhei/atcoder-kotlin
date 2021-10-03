fun main(args: Array<String>) {
    val l:List<String> = readLine()!!.split("").filter { it.isNotEmpty() }
    val l2:List<String> = readLine()!!.split("").filter { it.isNotEmpty() }
    if (l == l2) println("Yes")
    else {
        var l3 = l.toMutableList()
        for (i in l.indices - 2){
            if (l[i] != l2[i]){
                l3[i] = l[i + 1]
                l3[i + 1] = l[i]
                if (l3 == l2) println("Yes") else println("No")
                break
            }
        }
    }
}
