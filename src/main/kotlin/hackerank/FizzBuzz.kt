fun main() {
    val n = readLine()!!.trim().toInt()
    fizzBuzz(n)
}

fun fizzBuzz(n: Int): Unit {
    for (i in 1..n) {
        val mod3 = i % 3
        val mod5 = i % 5
        when {
            mod3 == 0 && mod5 == 0 -> println("FizzBuzz")
            mod3 == 0 && mod5 != 0 -> println("Fizz")
            mod3 != 0 && mod5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}