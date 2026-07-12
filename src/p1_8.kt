fun main() {

    val arr1 = arrayOf(10, 90, 60, 80, 100)
    println("Create Array-1:")
    println(arr1.joinToString())

    val arr2 = Array(5) { 0 }
    println("\nCreate Array-2:")
    println(arr2.joinToString())

    val arr3 = Array(8) { it }
    println("\nCreate Array-3:")
    println(arr3.joinToString())

    val arr4 = IntArray(5)
    println("\nCreate Array-4:")
    println(arr4.joinToString())

    val arr5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("\nCreate Array-5:")
    println(arr5.joinToString())

    val arr6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println("\n2D Array:")
    println(arr6.contentDeepToString())

    val a = IntArray(5)
    println("\nEnter 5 Array Values:")
    for (i in a.indices) {
        print("a[$i] = ")
        a[i] = readLine()!!.toInt()
    }

    println("Entered Array:")
    println(a.joinToString())

    val b = a.copyOf()
    b.sort()
    println("\nAfter Sorting (Built-in):")
    println(b.joinToString())

    val c = a.copyOf()
    for (i in c.indices) {
        for (j in 0 until c.size - i - 1) {
            if (c[j] > c[j + 1]) {
                val temp = c[j]
                c[j] = c[j + 1]
                c[j + 1] = temp
            }
        }
    }

    println("\nAfter Sorting (Without Built-in):")
    println(c.joinToString())
}