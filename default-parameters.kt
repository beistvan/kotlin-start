fun displayUser(name: String, age: Int = 18, position: String="unemployed"){
    println("Name: $name   Age: $age  Position: $position")
}
 
fun main() {
    displayUser("Tom", 23, "Manager")
    displayUser("Alice", 21)
    displayUser("Kate")
}
