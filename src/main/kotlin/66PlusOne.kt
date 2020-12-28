import java.util.*
import kotlin.math.pow

// would fail for a an array like [0, 0] which should result into [0, 1]
fun main() {
    val digits = intArrayOf(0, 0)
    println("Given Array = ${Arrays.toString(digits)}")
    println("Result Array = ${Arrays.toString(plusOne(digits))}")
}

fun plusOne(digits: IntArray): IntArray {
    val num = arrToInt(digits)
    val sum: Long = num + 1
    return intToNum(sum, numOfDigits(sum))
}

fun arrToInt(digits: IntArray): Long {
    var sum = 0L
    for (i in digits.size downTo 1) {
        val power = 10.toDouble().pow(i - 1).toLong()
        val multiplier = digits[digits.size - i]
        sum = sum + (multiplier * power)
    }
    return sum
}

fun intToNum(num: Long, size: Int): IntArray {
    var result = num
    val arr = IntArray(size)
    for (i in size downTo 1) {
        val power = 10.toDouble().pow(i - 1).toLong()
        val arrValue = result / power
        result = result - (arrValue * power)
        arr.set(size - i, arrValue.toInt())
    }
    return arr
}

fun numOfDigits(num: Long): Int {
    var given = num
    var count = 0
    while (given != 0L) {
        given /= 10L
        ++count
    }
    return count
}
