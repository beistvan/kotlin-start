fun main() {
    println("While Loop:")
    
    var i = 1
    while (i < 9) {
        println(i)
        i = i + 1
    }
    
    println(i) // 9
    
    var j = 1
    do {
        println(j)
        j++
    } while (j < 10)
    
    println(j) // 10
}
