package manipulatingLists5

import atomictest.eq

fun <T, R> List<T>.flatMap(f: (T) -> List<R>): List<R> =
        TODO("???.flatten()")

fun main(args: Array<String>) {
    val list = listOf(3, 1, 4)

    list.flatMap { (0..it).toList() } eq
            listOf(0, 1, 2, 3, 0, 1, 0, 1, 2, 3, 4)
}