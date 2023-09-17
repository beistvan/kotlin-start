fun main (args: Array<String>) {
    
    println("Classes And Interfaces")

    val testOne = Test
    val testTwo = Test
    
    testOne.getValue()
    testTwo.getValue()
    println(testOne) 
    println(testTwo) 

    if (testOne == testTwo) {
        println("testOne and testTwo is the same")
    }

    val personOne = Person("Anna")
    val personTwo = Person("Anna")
    
    personOne.showName()
    personTwo.showName()


    if (personOne == personTwo){
        println("personOne and personTwo is the same")
    } else {
        println("The Person objects is not the same" ) 
    } 

    val cat = Cat("Cirmi")
    val dog = Dog("Bodri")

    val list: List<Animal> = listOf(cat, dog)

    list.forEach {
        it.showName()
    }
}

class Person (private val name: String) {
    
    init {
        println("Init Person $name")
    }

    fun showName() {
        println("Person name is: $name")
    }
}

object Test {
    val age = 100

    fun getValue() {
        println(age) 
    }
}

interface Animal {
    fun showName()
}

class Cat (private val name: String): Animal {
    override fun showName() {
        println("Cat's name is: $name")
    }
}

class Dog (private val name: String): Animal {
    override fun showName() {
        println("Dog's name is: $name")
    }
}
// output:
/*
Classes And Interfaces
100
100
Test@6e8cf4c6
Test@6e8cf4c6
testOne and testTwo is the same
Init Person Anna
Init Person Anna
Person name is: Anna
Person name is: Anna
The Person objects is not the same
Cat's name is: Cirmi
Dog's name is: Bodri
*/
