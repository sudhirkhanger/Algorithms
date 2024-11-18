class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val list = mutableListOf<String>()
        for(i in 1..n) {
            val answer = when {
                i.mod(3) == 0 && i.mod(5) == 0 -> "FizzBuzz"
                i.mod(3) == 0 -> "Fizz"
                i.mod(5) == 0 -> "Buzz"
                else -> "$i"
            }
            list.add(answer)
        }
        return list
    }
}