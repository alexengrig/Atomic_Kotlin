package extensionsforNullableTypes2

import atomictest.eq

fun Boolean?.and(that: Boolean?): Boolean? =
        TODO()

fun Boolean?.or(that: Boolean?): Boolean? =
        TODO()

fun main(args: Array<String>) {
    val b = true
    b.and(null) eq null
    null.or(b) eq null
    b.or(false) eq true
}