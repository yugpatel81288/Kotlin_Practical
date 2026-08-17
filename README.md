# Kotlin Programming Concepts — Practical 1

## Overview

This practical demonstrates fundamental **Kotlin programming concepts** through a collection of small programs. The programs cover variables, type conversion, input/output, control flow, functions, recursion, arrays, ArrayLists, classes, constructors, operator overloading, and matrix operations.

## Practical Objectives

* Understand different Kotlin data types and variables.
* Perform type conversions in Kotlin.
* Accept and display student information.
* Use conditional statements and `when` expressions.
* Create and use user-defined functions.
* Implement recursion for factorial calculation.
* Work with arrays and different loop types.
* Find the maximum value from an `ArrayList`.
* Understand classes and constructors.
* Implement operator overloading.
* Perform matrix addition, subtraction, and multiplication.

## Programs Included

### 1.1 Store & Display Values in Different Variables

Demonstrates variables of different data types:

* `Int`
* `Double`
* `Float`
* `Long`
* `Short`
* `Byte`
* `Char`
* `Boolean`
* `String`

### 1.2 Type Conversion

Demonstrates conversion between different data types:

* Integer → Double
* String → Integer
* String → Double

### 1.3 Scan Student Information

Accepts and displays student details such as:

* Name
* Enrollment Number
* Branch
* Semester
* Other student information

### 1.4 Check Odd or Even Numbers

Accepts a number from the user and determines whether it is **odd or even** using Kotlin control flow inside `println()`.

### 1.5 Display Month Name

Uses the Kotlin `when` expression to display the month name according to the number entered by the user.

Example:

```text
Input: 8
Output: August
```

### 1.6 User-Defined Function

Creates a function to perform basic arithmetic operations on two numbers:

* Addition
* Subtraction
* Multiplication
* Division

### 1.7 Factorial Calculation with Recursion

Calculates the factorial of a number using a recursive function.

Example:

```text
5! = 5 × 4 × 3 × 2 × 1 = 120
```

### 1.8 Working with Arrays

Demonstrates:

* `Arrays.deepToString()`
* `contentDeepToString()`
* `IntArray.joinToString()`
* Array traversal
* `for` loops
* Ranges
* `downTo`
* `until`
* Sorting without built-in functions
* Sorting using built-in functions

### 1.9 Find Maximum Number from ArrayList

Creates an `ArrayList` of integers and finds the maximum number stored in it.

### 1.10 Class and Constructor Creation

Creates a `Car` class with properties such as:

* Type
* Model
* Price
* Owner
* Miles Driven

The class implements functions to:

* Get car information
* Get original car price
* Calculate current car price
* Display car information

### 1.11 Operator Overloading and Matrix Operations

Demonstrates **operator overloading** using a `Matrix` class.

The program performs:

* Matrix addition
* Matrix subtraction
* Matrix multiplication

The `toString()` function is also overloaded to provide customized matrix output.

Example:

```kotlin
operator fun plus(other: Matrix): Matrix
operator fun minus(other: Matrix): Matrix
operator fun times(other: Matrix): Matrix

override fun toString(): String
```

## Requirements

* **Language:** Kotlin
* **IDE:** Android Studio / IntelliJ IDEA
* **JDK:** Java Development Kit
* Basic knowledge of Kotlin syntax and programming concepts

## How to Run

1. Open the project in **Android Studio** or **IntelliJ IDEA**.
2. Create or open a Kotlin project.
3. Add the required Kotlin program files.
4. Select the required practical program.
5. Run the program.
6. Enter the required input when prompted.
7. View the output in the console.

## Concepts Covered

| Practical | Concept                         |
| --------- | ------------------------------- |
| 1.1       | Variables & Data Types          |
| 1.2       | Type Conversion                 |
| 1.3       | User Input & Output             |
| 1.4       | Conditional Statements          |
| 1.5       | `when` Expression               |
| 1.6       | User-Defined Functions          |
| 1.7       | Recursion                       |
| 1.8       | Arrays & Loops                  |
| 1.9       | ArrayList                       |
| 1.10      | Classes & Constructors          |
| 1.11      | Operator Overloading & Matrices |

## Conclusion

This practical provides a foundation in Kotlin programming by implementing basic programming concepts as well as object-oriented programming features. By completing these programs, students gain practical experience with Kotlin syntax, functions, arrays, classes, recursion, and operator overloading.
