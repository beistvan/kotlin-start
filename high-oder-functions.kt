fun main() {
    displayMessage(::morning)
    displayMessage(::evening)
    action(5, 3, ::sum)         // 8
    action(5, 3, ::multiply)    // 15
    action(5, 3, ::subtract)    // 2
    getHelloFunction().invoke()
}

fun displayMessage(mes: () -> Unit){
    mes()
}

fun morning(){
    println("Good Morning!")
}

fun evening(){
    println("Good Evening!")
}

fun action (n1: Int, n2: Int, op: (Int, Int)-> Int){
    val result = op(n1, n2)
    println(result)
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun subtract(a: Int, b: Int): Int{
    return a - b
}

fun multiply(a: Int, b: Int): Int{
    return a * b
}

fun helloFunction() {
    println("Hello!")
}

fun getHelloFunction(): () -> Unit {
    return ::helloFunction
}


fun getFunction1() : (Int) -> Unit { return {}}
fun getFunction2() : (Int, Double) -> Unit {return {_,_ -> Unit}}
fun getFunction3() : (Int, Double) -> Long {return {_, _ -> Long.MAX_VALUE}}
