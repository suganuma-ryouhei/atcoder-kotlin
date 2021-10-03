fun main(args: Array<String>) {
    val answers = mutableSetOf<Int>(81)
    for (i in 1 until 10) for (j in 1 until 10){
        answers.add(i * j)
    }
    if(readLine()!!.toInt() in answers){
        println("Yes")
    }
    else
    {
        println("No")
    }
}