package introductiontoGenerics2

import atomictest.eq

fun <T> List<T>.reversed(): List<T> {
    val result = mutableListOf<T>()
    TODO()
    return result
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    list.reversed() eq listOf(3, 2, 1)
}