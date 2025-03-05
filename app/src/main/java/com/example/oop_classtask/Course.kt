package com.example.oop_classtask

// Data class Course
data class Course(val courseName: String, val courseCode: String, val credits: Int)

fun main() {
    // Instantiate a course
    val course1 = Course("Mathematics", "MATH101", 3)
    println(course1) // toString()

    // Use copy() to create a modified copy
    val course2 = course1.copy(courseName = "Advanced Mathematics")
    println(course2) // toString()

    // Check hashCode() and equals()
    println("HashCode of course1: ${course1.hashCode()}")
    println("HashCode of course2: ${course2.hashCode()}")
    println("Are course1 and course2 equal? ${course1 == course2}") // false
}