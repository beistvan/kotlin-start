class D {
    
    private fun getObject() = object {
        val x: String = "x"
    }
    
    fun printX() {
        println(getObject().x)
    }
    
}

fun main() {
    
    val d = D() 
    
    d.printX()
    
}
