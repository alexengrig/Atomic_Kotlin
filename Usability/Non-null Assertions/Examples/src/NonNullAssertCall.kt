// NonNullAssertions/NonNullAssertCall.kt
import atomictest.eq

fun main(args: Array<String>) {
  val s1: String? = "abc"
  s1!!.length eq 3
}