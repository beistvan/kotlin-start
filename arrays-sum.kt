val scan = java.util.Scanner(System.`in`)

fun main(args: Array<String>) {
    val n = scan.nextInt()

    val a = IntArray(n)
    val b = IntArray(n)

    for (i in 0..n - 1) {
        a[i] = scan.nextInt()       
    }
    
    for (i in 0..n - 1) {
        b[i] = scan.nextInt()        
    }
    
    for (i in 0..n - 1) {
        println(a[i] + b[i])
    }

}
