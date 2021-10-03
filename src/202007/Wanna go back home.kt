fun main(arr:Array<String>) {
    println(if(canBackHome(readLine()!!)) "Yes" else "No")
}

fun canBackHome(log:String):Boolean {
    val list1 = "SENW"
    val list2 = "NWSE"
    for(i in list1.indices) {
        if(log.contains(list1[i])) {
            if(!log.contains(list2[i])) {
                return false
            }
        }
    }
    return true
}
