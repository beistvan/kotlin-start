fun main() {
    println("Maps:")
    
    val map1 = mapOf(123 to "number1", 345 to "number2", 678 to "number3")
    println(map1)
    
    val map2 = mapOf("Two" to 2, "Three" to 3, "Four" to 4)
    println(map2)
    
    println("Contains Key 'One':")
    println(map2.containsKey("One"))
    
    val map3 = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    println(map3.getValue("One"))
    println(map3["Two"])
    
    val map4 = mutableMapOf("Zero" to 0, "One" to 1, "Two" to 2)
    map4.put("Three", 3)
    println(map4)
    
    val map5 = mutableMapOf("Zero" to 0, "One" to 1, "Two" to 2)
    map5.put("Three", 3)
    println(map5) //{Zero=1, One=1, Two=2, Three=3}
    
    map5.remove("Zero")
    println(map5)
    
}
