val scan = java.util.Scanner(System.`in`)

fun main(args: Array<String>) {
    val n = scan.nextInt()

    var result = 0

    for (i in 1..n) {
        if (isPrime(i)) {
            result += i
        }
    }
    println(result)
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    } else if (n <= 3) {
        return true
    } else if (n % 2 == 0 || n % 3 == 0) {
        return false
    }

    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false
        }
        i += 6
    }
    return true
}
