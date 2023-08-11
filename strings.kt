fun main() {
    println("Strings:")
    
    val str = "abcd 123"
    for (c in str) {
        println(c)
    }
    
    val strAbcd = "abcd"
    println(strAbcd.uppercase())
    println(strAbcd)
    
    val sConcat = "abc" + 1
    println(sConcat + "def") // abc1def
    
    val sHello = "Hello, world!\n"
    println(sHello)
    
    val textA = """
    for (c in "foo")
    print(c)
    """
    println(textA)
    
    val textB = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(textB)

    val i = 10
    println("i = $i")
    
    val s = "abc"
    println("$s.length is ${s.length}")
    
    val price = """
    ${'$'}_9.99
    """
    println(price)
}
