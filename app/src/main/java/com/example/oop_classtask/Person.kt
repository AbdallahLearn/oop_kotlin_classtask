package com.example.oop_classtask

// Define the Person class
open class Person(val name: String, val age: Int) {
    // Secondary constructor
    constructor(name: String) : this(name, 0)

    // Function to display person's details
    open fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}