package lambdas3

import atomictest.eq

data class Student(val id: Int, val name: String)

fun registerStudents(names: List<String>, startId: Int = 0): List<Student> {
    TODO()
}

fun main(args: Array<String>) {
    val students = listOf("Alice", "Bob")
    registerStudents(students) eq
            listOf(Student(0, "Alice"), Student(1, "Bob"))

    registerStudents(students, startId = 10) eq
            listOf(Student(10, "Alice"), Student(11, "Bob"))
}