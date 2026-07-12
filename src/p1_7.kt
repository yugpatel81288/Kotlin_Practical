fun factorial(n: Int): Int {
    return if (n == 0 || n == 1)
        1
    else
        n * factorial(n - 1)
}

tailrec fun factorialTail(n: Int, result: Int = 1): Int {
    return if (n == 0 || n == 1)
        result
    else
        factorialTail(n - 1, result * n)
}

fun main() {
    print("Enter Number: ")
    val num = readLine()!!.toInt()

    println("Factorial of $num = ${factorial(num)}")
    println("By TailRec Keyword, Factorial of $num = ${factorialTail(num)}")
}