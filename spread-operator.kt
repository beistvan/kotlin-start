fun sum(vararg numbers: Int) {
    val result = numbers.sum()
    println("Sum Of Aaray: $result")
}

fun main() {
    println("Spread Operator And VarArgs:") 
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    sum(*numbers)
}
