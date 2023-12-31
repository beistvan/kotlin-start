open class A(x: Int) {
    public open val y: Int = x
}

interface B { /*...*/ }


// Object expression inheritance
fun main() {
    
    val ab: A = object : A(1), B {
        override val y = 15
    }
    
    println(ab.y) 
    
}
