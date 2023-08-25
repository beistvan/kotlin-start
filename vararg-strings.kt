fun printStrings(vararg strings: String) {
    for(str in strings)
        println(str)
}

fun main() { 
    printStrings("John", "Paul", "Peter")
    printStrings("Hello", "I", "am", "Android", "Developer")
}
