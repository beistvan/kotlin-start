fun main() {
    println("Lists:")
    
    val list = listOf(1, 3, 9)
    println(list)
    
    var students1: List<String>
    students1 = listOf("John", "Paul", "James")
        println(students1)
    
    val students2 = mutableListOf("Mary", "Peter", "Larry")
    println(students2)
    
    val students3 = mutableListOf("Connie", "David", "Jack")
    students3.add("Dias")
    println(students3)
    
    val students4 = listOf("Anna", "Lesley", "Harry")
    println(students4[2])
    
    val students5 = listOf("Mobica", "Sunny", "Bob")
    println(students5.get(2))   

}
