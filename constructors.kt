fun main() {
    
    val aClass = AClass("John") 
    println(aClass.firstName) 
    
    val anotherClass = AnotherClass("Paul") 
    println("First Name: ${anotherClass.firstName}")
    
    val initOrderDemo = InitOrderDemo("Peter") 
    println(initOrderDemo.firstProperty)
    println(initOrderDemo.secondProperty)
    
    val initClass = InitClass("Mary")
    println(initClass.customerKey) 
} 


// primary constructor
class AClass constructor(val firstName: String) {
    // The Body Of The Class
}

// if no annotations and visibility modificators constructor keyword can be omitted
class AnotherClass (val firstName: String) {
    /*...*/ 
}

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)
    
    init {
        println("First initializer block: ${name}")
    }
    
    val secondProperty = "Second property: ${name.length}".also(::println)
    
    init {
        println("Second initializer block: ${name.length}")
    }
}

class InitClass(name: String) {
    val customerKey = name.uppercase()
}

class ShortInitClass(val firstName: String, val lastName: String, var age: Int)

class DefaultInitClass(val firstName: String, val lastName: String, var isEmployed: Boolean = true)

class CommaAtEndClass(
    val firstName: String,
    val lastName: String,
    var age: Int, // comma at the end
) {
    /*...*/ 
}

//class ClassWithModificator public @Inject constructor(name: String) { /*...*/ }
