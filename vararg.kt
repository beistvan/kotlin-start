fun sum(vararg numbers: Int) {
    val result=numbers.sum()
    println("Sum: $result")
}

fun main() {
    sum(1, 2, 3, 4, 5)
    sum(1, 2, 3, 4, 5, 6, 7, 8, 9)
}
