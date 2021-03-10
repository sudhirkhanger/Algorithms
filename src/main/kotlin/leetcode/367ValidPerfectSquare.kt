package leetcode

fun main() {
    println(isPerfectSquare(16))
    println(isPerfectSquare(14))
    println(isPerfectSquare(1))
    println(isPerfectSquare(5))
}

fun isPerfectSquare(num: Int): Boolean {
    var start = 1
    var end = num
    while (start <= end) {
        val mid = start + (end - start) / 2
        if (mid == num / mid) {
            val square: Long = mid.toLong() * mid.toLong()
            if (square == num.toLong()) return true
        }
        if ((num / mid) > mid) start = mid + 1
        else end = mid - 1
    }
    return false
}
