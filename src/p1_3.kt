fun main() {

    print("Student Enrollment No: ")
    val enrollment = readLine()!!

    print("Student Name: ")
    val name = readLine()!!

    print("Student Branch: ")
    val branch = readLine()!!

    print("Student Class: ")
    val className = readLine()!!

    print("Student Batch: ")
    val batch = readLine()!!

    print("College Name: ")
    val college = readLine()!!

    print("University Name: ")
    val university = readLine()!!

    print("Student Age: ")
    val age = readLine()!!.toInt()

    println("\n***********************")
    println("Student's Data:")
    println("Enrollment No.: $enrollment")
    println("Name          : $name")
    println("Age           : $age")
    println("Branch        : $branch")
    println("Class         : $className")
    println("Batch         : $batch")
    println("College Name  : $college")
    println("University    : $university")
}