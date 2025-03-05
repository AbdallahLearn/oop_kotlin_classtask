package com.example.oop_classtask

// Enum class DepartmentType
enum class DepartmentType(val maxCredits: Int) {
    COMPUTER_SCIENCE(18),
    MATHEMATICS(15),
    PHYSICS(12),
    ENGINEERING(20);

    // Method to check if a student can register for a course
    fun canRegister(currentCredits: Int, courseCredits: Int): Boolean {
        return currentCredits + courseCredits <= maxCredits
    }
}

fun main() {
    // Example usage of DepartmentType
    val department = DepartmentType.COMPUTER_SCIENCE
    val currentCredits = 15
    val courseCredits = 4

    if (department.canRegister(currentCredits, courseCredits)) {
        println("Registration allowed!")
    } else {
        println("Registration denied! Exceeds max credits.")
    }
}