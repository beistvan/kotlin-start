interface A {
    fun funFromA() {}
}

interface B

class C {
    // Retuned type is Any. x unaccessible
    fun getObject() = object {
        val x: String = "x"
    }

    // Retuned type is A; x unaccessible
    fun getObjectA() = object: A {
        override fun funFromA() {}
        val x: String = "x"
    }

    // Retuned type is B; both funFromA() and x unaccessible
    fun getObjectB(): B = object: A, B { // explicit return type needed  
        override fun funFromA() {}
        val x: String = "x"
    }
}

fun main() {
    
    val c = C() 
    
    // println(c.getObjectB().funFromA()) // Unresolved reference: funFromA 
    // println(c.getObjectB().x) // Unresolved reference: x
  
    println(c.getObjectA().funFromA() is Unit) // true
    println(c.getObject()  is Any) // true
    println(c.getObjectA() is A)   // true
    println(c.getObjectB() is B)   // true 
    
}
