package com.example.oop_classtask

// Subclass Student inheriting from Person
open class Student(name: String, age: Int, val studentId: Int, val grade: String) : Person(name, age) {
    // Override displayInfo() to include student details
    override fun displayInfo() {
        println("Name: $name, Age: $age, Student ID: $studentId, Grade: $grade")
    }
}

// Interface ScholarshipEligible
interface ScholarshipEligible {
    fun isEligible(): Boolean
}

// Implement ScholarshipEligible in Student
class EligibleStudent(name: String, age: Int, studentId: Int, grade: String) : Student(name, age, studentId, grade), ScholarshipEligible {
    override fun isEligible(): Boolean {
        return grade == "A" || grade == "B"
    }
}