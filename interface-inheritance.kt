interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String
    
    override val name: String get() = "$firstName $lastName"
}

data class Position (
    val positionName: String
) 

data class Employee (
    // name's realisation not needed
    override val firstName: String,
    override val lastName: String,
    val position: Position
) : Person

fun main() {
    
    val employee = Employee("John", "Smith", Position("CEO")) 
    println(employee) // Employee(firstName=John, lastName=Smith, position=Position(positionName=CEO))
    println(employee.name) // John Smith 
        
}
