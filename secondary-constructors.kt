fun main() {
    
    val person  = Person() 
    println(person.pets)
    
    val pet = Pet(person)
    println(pet) 
    
    println(person.pets)
    
    val aPerson = APerson("John") 
    println(aPerson.name) 
    println(aPerson.children)
    
    val myPerson = APerson("Paul", aPerson) 
    println(myPerson)
    println(aPerson.children)
    
    val c = ConstructorClass(7)
    println(c)
    
    //val d = DontCreateMe() // can't access privare constructor 

    val customer = Customer()
    println(customer.customerName) // empty string
    
} 

// secondary constructors
class Person(val pets: MutableList<Pet> = mutableListOf())

class Pet {
    constructor(owner: Person) {
        owner.pets.add(this) 
    }
} 

class APerson(val name: String) {
    
    val children: MutableList<APerson> = mutableListOf()
    
    constructor(name: String, parent: APerson) : this(name) {
        parent.children.add(this)
    }
}

class ConstructorClass {
    
    init {
        println("Init block")
    }
    
    constructor(i: Int) {
        println("Constructor $i")
    }
}


class DontCreateMe private constructor () { /*...*/ }

class Customer(val customerName: String = "")

 
