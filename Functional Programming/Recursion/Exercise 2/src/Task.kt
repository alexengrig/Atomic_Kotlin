package recursion2

import atomictest.eq

// For comparison
fun fibonacciRecursive(n: Int): Long {
    tailrec fun fibonacci(
            n: Int,
            current: Long,
            next: Long
    ): Long {
        if (n == 0) return current
        return fibonacci(
                n - 1, next, current + next)
    }

    return fibonacci(n, 0L, 1L)
}

fun fibonacciIterative(n: Int): Long {
    TODO()
}

fun main(args: Array<String>) {
    (0..8).map { fibonacciRecursive(it) } eq
            "[0, 1, 1, 2, 3, 5, 8, 13, 21]"
    fibonacciRecursive(22) eq 17711
    fibonacciRecursive(50) eq 12586269025

    (0..8).map { fibonacciIterative(it) } eq
            "[0, 1, 1, 2, 3, 5, 8, 13, 21]"
    fibonacciIterative(22) eq 17711
    fibonacciIterative(50) eq 12586269025

    println(fibonacciIterative(17))
    println(fibonacciIterative(33))
    println(fibonacciIterative(39))
}