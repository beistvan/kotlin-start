object MyObject { // singleton
    var age = 10;
}

fun main() {
    
    // creating instances
    val a = MyObject
    a.age = 12 // changing
    
    val b = MyObject
    println(b.age) //  12
    
}
