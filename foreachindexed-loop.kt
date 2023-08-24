fun main() {
    println("ForEachIndexed Loop:")
    
    val allStudents = listOf("Steven", "John", "Paul", "Peter", "Samantha")
    
    allStudents.forEachIndexed{ index, item ->
        println("$index : $item")
    }
}
