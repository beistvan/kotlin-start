interface MyInterface {
    fun bar()
    fun foo() {
      // body can be empty
    }
}

class Child : MyInterface {
    override fun bar() {
        // must be implenented
    }
}

fun main() {    
        
}
