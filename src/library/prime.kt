fun main(args: Array<String>) {
    println(prime(10).max())
}

fun prime(max: Int):List<Int> {
    var numbersForDivide =  (2..max).toList()
    var prime = mutableListOf<Int>()
    for(i in 1 .. max){
        if(numbersForDivide.isNotEmpty() && numbersForDivide[0] == i){
            prime.add(i)
            numbersForDivide = numbersForDivide.filter { it % i != 0 && it != i}
        }
    }
    return prime
}
