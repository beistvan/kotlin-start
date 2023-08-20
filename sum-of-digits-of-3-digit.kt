val scan = java.util.Scanner(System.`in`)

fun main(args: Array<String>) {
    val n = scan.nextInt()

    println(n / 100 + n / 10 % 10 + n % 10)
}
