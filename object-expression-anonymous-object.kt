// Object expression - Anonymus object
fun main() {
    
    val helloWorld = object {
        val hello = "Hello"
        val world = "World!"
        // object type - Any, needs override of toString()
        override fun toString() = "$hello, $world"
       } 
    println(helloWorld) 
    
}
