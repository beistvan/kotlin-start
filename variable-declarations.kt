fun main() {
    println("Variable declarations:")
    val a: Int = 1
    val b = 2 
    val c: Int 
    c = 3 
    var y = 5 
    y += 1
    val PI = 3.14
    var x = 0
    
    fun incrementX() { 
        x += 1 
    }
    
    println("a: " + a)
    println("b: " + b)
    println("c: " + c)
    println("y: " + y)
    println("PI: " + PI)
    println("x: " + x)
    incrementX()
    println("x: " + x)   
}
