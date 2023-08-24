fun main() {
    println("Continue:")
    
    for (i in 1..10) {
        if (i == 6) {
            continue
        }
        println(i)
    }
}
