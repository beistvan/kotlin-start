interface A {
    fun foo() { println("A foo") }
    fun bar()
}

interface B {
    fun foo() { println("B foo") }
    fun bar() { println("B bar") }
}

class C : A {
    override fun bar() { println("C bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }
    
    override fun bar() {
        super<B>.bar()
    }
}

fun main() {
    
    val c = C()
    val d = D() 
    println("val c:") 
    c.bar() // C bar
    c.foo() // A foo
    
    println("val d:") 
    d.bar() // B bar
    d.foo() // A foo 
            // B foo
/* outputs:
val c:
C bar
A foo
val d:
B bar
A foo
B foo
*/
        
}
