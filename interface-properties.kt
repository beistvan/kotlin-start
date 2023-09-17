interface MyInterface {
    
    val prop: Int // abstract property

    val propertyWithImplementation: String
        get() = "in get() of interface"
       
    fun foo() {
        print(prop)
    }
}

class Child : MyInterface {
    
    override val prop: Int = 22

}

fun main() {
    
    val aChild = Child() 
    println(aChild.prop) // 22
    println(aChild.propertyWithImplementation)
    aChild.foo() // 22
        
}
