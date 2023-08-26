class Student{    
    var name: String="John"
}

fun main() {
    println("Nullable and Non-Null types:")
    
    // var s: String = "Hello"    
    // s = null // Compilation Error
    
    var a: String? = "Hello"
    println(a)
    
    a = null // OK
    println(a)
    
    a = "Hi!" // OK
    println(a)
    
    val l = a?.length
    println(l)
    
    //val k = a.length // error
    
    val m = if (a != null) a.length else -1
    println(m)
    
    if (a != null && a.length > 0) {
        println("length: ${a.length}")
    } else {
        println("empty string")
    }
    
    val j: String? = null
    val i = "Android"
    
    println(j?.length)
    println(i?.length) // Unnecessary
    
    val student = Student()
    
    // If `student` or `student.name` is null, bo function call
    // student?.name?.surname = getStudentSurname()
    
    val name1: String = if (student != null) student.name else ""
    println(name1)
    
    val name2: String = student?.name ?: ""
    println(name2)
    
    val name3 = student!!.name
    println(name3)
}
