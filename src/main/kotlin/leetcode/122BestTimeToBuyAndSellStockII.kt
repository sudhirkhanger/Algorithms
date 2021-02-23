package leetcode

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    val prices2 = intArrayOf(1, 2, 3, 4, 5)
    val prices3 = intArrayOf(7, 6, 4, 3, 1)
    println(maxProfit(prices3))
}

fun maxProfit(prices: IntArray): Int {
    var low = Int.MAX_VALUE
    var high = Int.MIN_VALUE
    var findLow = true
    var findHigh = false
    var profit = 0

    for (i in prices.indices) {
        if (findLow) {
            if (low > prices[i]) {
                low = prices[i]
            } else {
                findLow = false
                findHigh = true
                high = low
            }
        }
        if (findHigh) {
            if (high < prices[i]) {
                high = prices[i]
            } else {
                findHigh = false
            }
        }
        if (i + 1 == prices.size) findHigh = false
        if (!findHigh && !findLow) {
            profit += (high - low)
            findLow = true
            low = prices[i]
        }
    }

    return profit
}
