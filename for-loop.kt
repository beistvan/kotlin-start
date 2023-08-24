fun main() {
    println("For Loop:")
    
    for (i in 1..5) {
        println(i)
    }
    
    val students = arrayListOf<String>()
    students.add("Jack")
    students.add("Elvira")
    students.add("Brigitte")
    
    for(student in students) {
        println("Student $student")
    }
    
    for (index in students.indices) {
        println("Student ${students[index]}")
    }
}
