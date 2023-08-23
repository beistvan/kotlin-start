fun main() {
    println("Sets:")
    
    val numbers = setOf(1, 3, 9)
    println(numbers)
    
    val students = setOf("Mary", "Jack", "Paul")
    println(students)
            
    println(students.elementAt(2))
        
    val sortedSet  = sortedSetOf(2, 4, 3, 5, 1)
    sortedSet.add(6) // add 6
    sortedSet.remove(1) // remove 1
    println(sortedSet) // [2, 3, 4, 5, 6]
    
    val linkedHashSet = linkedSetOf(5, 1, 2, 3, 9, 4)
    linkedHashSet.add(44)
    linkedHashSet.remove(2)
    println(linkedHashSet) // [5, 1, 3, 9, 4, 44]
    
    val mutableSet: MutableSet<Int> = mutableSetOf(3, 27, 66, 12, 10)
    mutableSet.add(8)
    mutableSet.remove(3)
}
