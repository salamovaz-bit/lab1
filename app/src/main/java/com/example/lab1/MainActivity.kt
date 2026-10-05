package com.example.lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LabTasks()
        }
    }
}

@Composable
fun LabTasks() {

    val result = buildString {

        appendLine("LABORATORY WORK 1")
        appendLine("Variables")
        appendLine()

        // 1
        val x: Int = 10
        appendLine("1. x = $x")

        // 2
        val pi: Double = 3.14159
        appendLine("2. pi = $pi")

        // 3
        var isActive: Boolean = false
        appendLine("3. isActive = $isActive")

        // 4
        var temperature: Float = 36.6f
        appendLine("4. temperature = $temperature")

        // 5
        var count: Long = 10000000000L
        appendLine("5. count = $count")

        // 6
        var letter: Char = 'A'
        appendLine("6. letter = $letter")

        // 7
        var a: Int = 10
        var b: Int = 20
        appendLine("7. a + b = ${a + b}")

        // 8
        var radius = 5.0
        var area = pi * radius * radius
        appendLine("8. Circle area = $area")

        // 9
        var salary: Int = 1000
        salary = (salary * 1.15).toInt()
        appendLine("9. Salary after 15% increase = $salary")

        // 10
        var price = 100.0
        var priceWithTax = price * 1.12
        appendLine("10. Price with 12% tax = $priceWithTax")

        appendLine()
        appendLine("Data Types")
        appendLine()

        // 1
        val number: Int = 10
        var decimal: Double = 5.5
        var bool: Boolean = true
        var text: String = "Hello"
        val char: Char = 'A'

        appendLine("1. Int=$number, Double=$decimal, Boolean=$bool, String=$text, Char=$char")

        // 2
        var doubleNumber = 15.8
        var intNumber = doubleNumber.toInt()
        appendLine("2. Double to Int = $intNumber")

        // 3
        var num = 1234
        var numString = num.toString()
        appendLine("3. Int to String = $numString")

        // 4
        var stringNumber = "56"
        var convertedNumber = stringNumber.toInt()
        appendLine("4. 56 * 2 = ${convertedNumber * 2}")

        // 5
        var comparison: Boolean = 10 > 5
        appendLine("5. 10 > 5 = $comparison")

        // 6
        var checkNumber = 8
        var isEven = checkNumber % 2 == 0
        appendLine("6. Is $checkNumber even? $isEven")

        // 7
        var booleanValue = true
        var booleanString = booleanValue.toString()
        appendLine("7. Boolean to String = $booleanString")

        // 8
        appendLine("8. Int MIN = ${Int.MIN_VALUE}")
        appendLine("   Int MAX = ${Int.MAX_VALUE}")

        // 9
        var ch = 'b'
        var chInt = ch.code
        appendLine("9. Char 'b' to Int = $chInt")

        // 10
        var number97 = 97
        var symbol = number97.toChar()
        appendLine("10. 97 to Char = $symbol")

        appendLine()
        appendLine("String")
        appendLine()

        // 1
        val kotlinString = "Kotlin"
        appendLine("1. Length of Kotlin = ${kotlinString.length}")

        // 2
        var hello = "Hello"
        appendLine("2. First = ${hello.first()}, Last = ${hello.last()}")

        // 3
        var good = "Good"
        var morning = "Morning"
        appendLine("3. $good $morning")

        // 4
        var banana = "banana"
        appendLine("4. ${banana.replace("a", "o")}")

        // 5
        var name = "Zika"
        var age = 16
        appendLine("5. My name is $name and I am $age years old")

        // 6
        var welcome = "Welcome"
        appendLine("6. ${welcome.substring(1, 4)}")

        // 7
        var spaces = " Kotlin "
        appendLine("7. '${spaces.trim()}'")

        // 8
        var javaText = "I love Java and Kotlin"
        appendLine("8. Contains Java: ${javaText.contains("Java")}")

        // 9
        var helloWorld = "Hello, World!"
        appendLine("9. ${helloWorld.uppercase()}")

        // 10
        var helloUpper = "HELLO"
        appendLine("10. ${helloUpper.lowercase()}")

        // 11
        var funText = "Kotlin is fun"
        appendLine("11. Number of words = ${funText.split(" ").size}")

        // 12
        var abc = "abc"
        appendLine("12. ${abc.repeat(3)}")

        // 13
        var numbers = "123"
        appendLine("13. ${numbers.toList()}")

        // 14
        var palindrome = "racecar"
        appendLine("14. Is palindrome: ${palindrome == palindrome.reversed()}")

        // 15
        var fruits = "apple,banana,orange"
        appendLine("15. ${fruits.split(",")}")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Text(text = result)
    }
}