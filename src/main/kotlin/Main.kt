package org.example

fun main() {
    val toFahrenheit = toFahrenheit(30.0)
    println(toFahrenheit)

    val diameter = calculateDiameter(10.0, 20.0)
    println(diameter)

    val factorial = calculateFactorial(5)
    println(factorial)

    val a = calculateA("Hello Yusuf Can Mercan!")
    println(a)

    val sumAngles = calculateSumAngles(5)
    println(sumAngles)

    val salary = calculateSalary(30)
    println(salary)

    val price = calculatePrice(100)
    println(price)
}

fun toFahrenheit(celsius: Double): Double {
    return (celsius * 1.8) + 32
}

fun calculateDiameter(shortEdge: Double, longEdge: Double): Double {
    return 2 * (shortEdge + longEdge)
}

fun calculateFactorial(number: Int): Int {
    var result = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}

fun calculateA(word: String): Int {
    var result = 0
    for (char in word) {
        if (char == 'a') {
            result++
        }
    }
    return result
}

fun calculateSumAngles(edgeCount: Int): Double {
    return (edgeCount - 2) * 180.0
}

fun calculateSalary(day: Int): Double {
    val hour = day * 8
    return if (hour > 160) {
        val overtime = hour - 160
        hour * 10.0 + overtime * 20.0
    } else {
        hour * 10.0
    }
}

fun calculatePrice(quota: Int): Int {
    return if (quota > 50) {
        100 + (quota - 50) * 4
    } else {
        100
    }
}