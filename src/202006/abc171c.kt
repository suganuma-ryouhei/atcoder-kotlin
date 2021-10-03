fun main() {
    val letter = ('a'..'z').toList()
    var n = readLine()!!.toLong()
    var a = ""
    var divider = 26L
    while (n / 26 > divider){
        divider *= 26
    }
    while (divider >= 26L){
        a = a.plus(letter[(n / divider - 1).toInt()])
        n %= divider
        divider /= 26
    }
    when (n % 26){
        0L -> println(a)
        else -> println(a.plus(letter[(n % 26 - 1).toInt()]))
    }
}
