fun main(args: Array<String>) {
    val s = readLine().toString()
    var a = 'A'
    for (i in 'a' .. 'z'){
        if (s.first() == i){
            a = 'a'
        }
    }
    println(a)
}
