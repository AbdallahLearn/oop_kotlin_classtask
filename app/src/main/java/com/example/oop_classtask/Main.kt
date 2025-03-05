package com.example.oop_classtask

fun main() {
    // 1. Creating Classes and Objects
    val person = Person("Alice", 25)
    person.displayInfo() // Output: Name: Alice, Age: 25

    // 2. Implementing Inheritance and Interfaces
    val student = Student("Bob", 20, 101, "A")
    student.displayInfo() // Output: Name: Bob, Age: 20, Student ID: 101, Grade: A

    val eligibleStudent = EligibleStudent("Charlie", 22, 102, "B")
    println("Is ${eligibleStudent.name} eligible for scholarship? ${eligibleStudent.isEligible()}") // Output: true

    // 3. Working with Data Classes
    val course1 = Course("Mathematics", "MATH101", 3)
    println(course1) // Output: Course(courseName=Mathematics, courseCode=MATH101, credits=3)

    val course2 = course1.copy(courseName = "Advanced Mathematics")
    println(course2) // Output: Course(courseName=Advanced Mathematics, courseCode=MATH101, credits=3)

    println("HashCode of course1: ${course1.hashCode()}") // Output: HashCode of course1: <hashCode>
    println("Are course1 and course2 equal? ${course1 == course2}") // Output: false

    // 4. Enum Implementation
    val department = DepartmentType.COMPUTER_SCIENCE
    val currentCredits = 15
    val courseCredits = 4

    if (department.canRegister(currentCredits, courseCredits)) {
        println("Registration allowed!") // Output: Registration allowed!
    } else {
        println("Registration denied! Exceeds max credits.")
    }
}