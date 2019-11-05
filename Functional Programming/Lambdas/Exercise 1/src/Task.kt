package lambdas1

import atomictest.eq

fun transform(list: List<String>): List<Int> {
    return list.map { TODO() }
}

fun main(args: Array<String>) {
    transform(listOf("abc", "ab")) eq listOf(3, 2)
    transform(listOf("", "abdef", "x")) eq listOf(0, 5, 1)
    transform(listOf("123456789")) eq listOf(9)
}