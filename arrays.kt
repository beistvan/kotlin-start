fun main() {
    println("Arrays:")
    
	val squares = Array(5) { i -> (i * i).toString() }
    squares.forEach { println(it) }
    
    println(squares.joinToString())
    
    val x: IntArray = intArrayOf(1, 2, 3)
    println(x.joinToString())
    x[0] = x[1] + x[2]
    println(x.joinToString())
    
    val arr = IntArray(5)
    println(arr.joinToString())

	val arrayOfConsts = IntArray(5) { 42 }
    println(arrayOfConsts.joinToString())

	var arrayOfInts = IntArray(5) { it * 1 }
    println(arrayOfInts.joinToString())
}
