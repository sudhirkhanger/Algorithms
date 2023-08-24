class Solution {
    fun fizzBuzz(n: Int): List<String> {
        return List(n) { index -> 
        val num = index + 1
        when {
            num % 3 == 0 && num % 5 == 0 -> "FizzBuzz"
            num % 3 == 0 -> "Fizz"
            num % 5 == 0 -> "Buzz"
            else -> "$num"
        }
        }
    }
}