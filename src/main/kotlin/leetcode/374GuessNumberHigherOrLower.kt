package leetcode

fun main() {
    // -1: The number I picked is lower than your guess (i.e. pick < num).
    // 1: The number I picked is higher than your guess (i.e. pick > num).
    // 0: The number I picked is equal to your guess (i.e. pick == num).
}

override fun guessNumber(n:Int):Int {
    var start = 1
    var end = n
    while (start <= end) {
        val mid = start + (end - start) / 2
        val guess = guess(mid)
        if (guess == 0) return mid
        if (guess == 1) start = mid + 1
        else end = mid - 1
    }
    return 0
}