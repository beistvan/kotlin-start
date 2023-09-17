open class A {
     companion object {
        const val a1 = "companion's data 1"
        const val a2 = "companion's data 2"
     }
 }

class B : A() {
    companion object {
        const val b1 = "companion's data 3"
    }
    val a_1 = a1
    val a_2 = a2
    val b_1 = b1
}


// Companion object access
fun main() {
    
    val b = B() 
    
    println(b.a_1)
    println(b.a_2) 
    println(b.b_1) 
    
}
