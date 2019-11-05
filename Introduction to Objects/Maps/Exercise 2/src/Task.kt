package maps2

import atomictest.capture
import atomictest.eq

class Hamster(val name: String) {
    override fun toString(): String {
        return "Hamster('$name')"
    }
}

class Cage(private val maxCapacity: Int) {
    private val hamsters =
            mutableListOf<Hamster>()

    fun put(hamster: Hamster): Boolean =
            if (hamsters.size == maxCapacity)
                false
            else {
                hamsters += hamster
                true
            }

    fun takeHamsterByName(name: String): Hamster {
        TODO()
    }
}

fun main(args: Array<String>) {
    val cage = Cage(2)
    cage.put(Hamster("Alice")) eq true
    cage.takeHamsterByName("Alice") eq "Hamster('Alice')"
    capture {
        cage.takeHamsterByName("Bob")
    } eq "NoSuchElementException: " +
            "No hamster called Bob"
}