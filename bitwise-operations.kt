fun main() {
    println("Bitwise Operations:")
    
    var x: Int
    var y: Int
    
    x = 1 shl 3 // << 
    println(x.toString(2))
    
    x = 0b111 shr 1 // >>
    println(x.toString(2))
    
    x = -63532
    println(x.toString(2))
    
    y = x shr 1
    println(y.toString(2))
    
    y = x ushr 1 // >>>
    println(x.toUInt().toString(2))
    println(y.toString(2))
    
    println((0b0101 and 0b0110).toString(2))
    println((0b0101 or 0b0110).toString(2))
    println((0b0101 xor 0b0110).toString(2))
    println(0b0101.toUInt().inv().toString(2))
    println(0b0101.inv().toString(2))
    println(5.inv())
}
