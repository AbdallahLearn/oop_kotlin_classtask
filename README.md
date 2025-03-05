# OOP Class Task in Kotlin

This project demonstrates Object-Oriented Programming (OOP) concepts in Kotlin, including classes, inheritance, interfaces, data classes, and enums. Each class, interface, enum, and data class is defined in its own file for better organization.

---

## **Table of Contents**
1. [Project Structure](#project-structure)
2. [Functionality](#functionality)
3. [How to Run](#how-to-run)
4. [Output](#output)
5. [Dependencies](#dependencies)
6. [License](#license)

---

## **Project Structure**

The project is organized as follows:

- **`Person.kt`**: Defines the `Person` class with attributes `name` and `age`.
- **`Student.kt`**: Defines the `Student` class, which inherits from `Person` and adds `studentId` and `grade`.
- **`ScholarshipEligible.kt`**: Defines the `ScholarshipEligible` interface.
- **`EligibleStudent.kt`**: Defines the `EligibleStudent` class, which implements the `ScholarshipEligible` interface.
- **`Course.kt`**: Defines the `Course` data class with properties `courseName`, `courseCode`, and `credits`.
- **`DepartmentType.kt`**: Defines the `DepartmentType` enum with custom properties and methods.
- **`Main.kt`**: Contains the `main` function, which demonstrates the usage of all classes, interfaces, enums, and data classes.

---

## **Functionality**

### 1. **Person Class**
- Defines a `Person` class with attributes `name` and `age`.
- Includes a secondary constructor and a `displayInfo()` function to print person details.

### 2. **Student Class**
- Inherits from `Person` and adds attributes `studentId` and `grade`.
- Overrides the `displayInfo()` function to include student details.

### 3. **ScholarshipEligible Interface**
- Defines a `ScholarshipEligible` interface with a method `isEligible()`.

### 4. **EligibleStudent Class**
- Implements the `ScholarshipEligible` interface and checks if a student is eligible for a scholarship based on their grade.

### 5. **Course Data Class**
- Defines a `Course` data class with properties `courseName`, `courseCode`, and `credits`.
- Demonstrates the use of built-in functions like `copy()`, `toString()`, `hashCode()`, and `equals()`.

### 6. **DepartmentType Enum**
- Defines an `DepartmentType` enum with values like `COMPUTER_SCIENCE`, `MATHEMATICS`, etc.
- Adds a `maxCredits` property and a `canRegister()` method to check if a student can register for a course based on credit limits.

---

## **How to Run**

### Prerequisites
- Install [IntelliJ IDEA](https://www.jetbrains.com/idea/) or any Kotlin-supported IDE.
- Ensure Kotlin is installed and configured.

### Steps
1. Clone or download the project.
2. Open the project in IntelliJ IDEA or your preferred IDE.
3. Navigate to the `Main.kt` file.
4. Run the `main` function by right-clicking inside the file and selecting **Run 'MainKt'**.

---

