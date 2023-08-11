import java.text.DecimalFormat;
fun main() {
    println("Symbolic constants:")
    
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    
    println("oneMillion:")
    println("%,dL".format(oneMillion))
    println(oneMillion)
    println("creditCardNumber:")
    println(creditCardNumber)
    println("socialSecurityNumber:")
    println(socialSecurityNumber)
    println("hexBytes:")
    println(java.lang.Long.toHexString(hexBytes).uppercase())
    println("bytes:")
    println(bytes.toString(2).uppercase())
}
