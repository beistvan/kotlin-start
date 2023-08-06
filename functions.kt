fun main() {
    println("Functions:")
    
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    
    fun sumOf(a: Int, b: Int) = a + b
    
    fun printSum(a: Int, b: Int) {
        println("Sum of $a and $b is ${a + b}.")
    }
    
    fun printSumOf(a: Int, b: Int): Unit {
        println("Sum of $a and $b is ${a + b}.")
    }
    
    println("1 + 2: " + sum(1, 2))
    println("3 + 4: " + sumOf(3, 4))
    printSum(5, 6)
    printSumOf(7, 8)
    
}
