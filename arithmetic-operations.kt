fun main() {
    println("Artimetic Operations:")
    
    var x: Int
    var y: Int
    var z: Int
    
    x = 15
    y = 6
    
    println("x: " + x)
    println("y: " + y)
    
    z = x + y
    println("x + y = z: " + z)      // z = 21
    
    z = x - y
    println("x - y = z: " + z)      // z = 9
    
    z = x * y
    println("x * y = z: " + z)      // z = 90
    
    z = x / y    
    println("x / y = z: " + z)      // z = 2
    
    z = x % y
    println("x % y = z: " + z)      // z = 3
    
    val a = 11
    val b = 5.0
    val c = a / b   // c = 2.2
    println("a / b = c: " + c)      // 2.2
    
    var u: Int
    var v: Int
    
    u = 5
    println("u: " + u)		// u = 5
    v = ++u    
    println("v = ++u: " + v)    // v = 6
    println("u: " + u)		// u = 6
    
    u = 5
    println("u: " + u)		// u = 5
    v = u++    
    println("v = u++: " + v)    // v = 5
    println("u: " + u)		// u = 6
        
    u = 5
    println("u: " + u)		// u = 5
