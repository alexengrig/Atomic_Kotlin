package dataClasses2

import atomictest.eq

data class Book(val title: String, val authors: List<Author>)

data class Author(val name: String)

fun createAuthorToBooksMap(books: List<Book>): Map<Author, List<Book>> {
    TODO()
}

fun main(args: Array<String>) {
    val books = listOf(
            Book("Computer Interfacing with Pascal & C", listOf(Author("Bruce Eckel"))),
            Book("Using C++", listOf(Author("Bruce Eckel"))),
            Book("C++ Inside & Out", listOf(Author("Bruce Eckel"))),
            Book("Blackbelt C++: The Masters Collection", listOf(Author("Bruce Eckel"))),
            Book("Thinking in C++: Introduction to Standard C++", listOf(Author("Bruce Eckel"))),
            Book("Thinking in C++, Vol. 2: Practical Programming", listOf(Author("Bruce Eckel"), Author("Chuck Allison"))),
            Book("Thinking in Java", listOf(Author("Bruce Eckel"))),
            Book("First Steps in Flex", listOf(Author("Bruce Eckel"))),
            Book("Atomic Scala", listOf(Author("Bruce Eckel"), Author("Dianne Marsh"))),
            Book("On Java 8", listOf(Author("Bruce Eckel"))),
            Book("Kotlin in Action", listOf(Author("Dmitry Jemerov"), Author("Svetlana Isakova"))),
            Book("Atomic Kotlin", listOf(Author("Bruce Eckel"), Author("Svetlana Isakova")))
    )
    val authorToBooksMap = createAuthorToBooksMap(books)
    authorToBooksMap.getValue(Author("Bruce Eckel")).size eq 11
    authorToBooksMap.getValue(Author("Svetlana Isakova")).first().title eq "Kotlin in Action"
}