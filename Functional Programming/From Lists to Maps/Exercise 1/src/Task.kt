package fromListstoMaps01

import atomictest.eq

data class Person(val name: String, val age: Int)

fun buildAgeToNamesMap(people: List<Person>): Map<Int, List<String>> {
    TODO()
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 21),
            Person("Bob", 25), Person("Charlie", 25))

    buildAgeToNamesMap(people) eq
            mapOf(21 to listOf("Alice"),
                    25 to listOf("Bob", "Charlie"))

    buildString {  }
}