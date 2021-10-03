fun main() {
    val n = readLine()!!.toInt()
    val input = mutableListOf<String>()
    for (i in 0 until n) {
        input.add(readLine()!!)
    }
    val l = input.groupingBy { it }.eachCount().toList().sortedBy { it.first }.sortedByDescending { it.second }
    val maxPoll = l.first().second
    for(i in 0 until l.size) {
        if(l[i].second != maxPoll){
            break
        }
        println(l[i].first)
    }
}
