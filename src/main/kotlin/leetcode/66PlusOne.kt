fun main() {
    val digits = intArrayOf(8, 9)
    println("${plusOne(digits).joinToString()}")
}

fun plusOne(digits: IntArray): IntArray {
    val n = digits.size
    var index = n
    while (index > 0) {
        when {
            digits[index - 1] == 9 -> {
                digits[index - 1] = 0
                index--
                if (index == 0) return IntArray(n + 1) { if (it == 0) 1 else 0 }
            }
            else -> {
                digits[index - 1]++
                return digits
            }
        }
    }
    return digits
}
