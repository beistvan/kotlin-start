fun main() {
    println("Arrays:")
    
    val words: Array<String> = arrayOf("a", "b", "c", "d", "e")
    
    println("words: ${words.joinToString()}") // words
    
    val n = words[1]  // b
    
    println("n: " + n)
    
    println("words[1] = ${words[1]}") // words[1] = b
    
    words[2] = "f"      // f
    
    println("words[2] = ${words[2]}") // words[2] = f
    
    // intArrayOf(), charArrayOf(), booleanArrayOf(), longArrayOf(), shortArrayOf(), byteArrayOf(), arrayOfNulls()
}
