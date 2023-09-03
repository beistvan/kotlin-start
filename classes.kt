//annotation class cannot be local
annotation class EmptyAnnotationClass

interface Interface;

class Class;

annotation class Annotation;

sealed class SealedClass;

data class DataClass(var value: String);

object ObjectClass;

enum class EnumClass;

class CompanionClass {
    companion object
}

fun main() {
    
    class aClass {
        // body of class
    }
    
    class hasNoBodyClass
    
    class EmptyClass : Exception()
}
