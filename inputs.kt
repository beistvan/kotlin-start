val scan = java.util.Scanner(System.`in`)

fun main() {
    println("Inputs:")
        
    //Reading Int input
    val a = scan.nextInt()
    
    //Reading Float Input
    val b = scan.nextFloat()
	
    //Reading Double Input
    val c = scan.nextDouble()
    
    //Reading Boolean Input
    val d = scan.nextBoolean()
    
    //Reading Short Input
    val e = scan.nextShort()
	
    //Reading Long Input
    val f = scan.nextLong()
	
    scan.nextLine() // consuming next line character after nextLong()
    //Reading String Input
    var g = scan.nextLine()
    
    println("Int: " + a)
    println("Float: " + b)
    println("Double: " + c)
    println("Boolean: " + d)
    println("Short: " + e)
    println("Long: " + f)
    println("Line: " + g)
}
