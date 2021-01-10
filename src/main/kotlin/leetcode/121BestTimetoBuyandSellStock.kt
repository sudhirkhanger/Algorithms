fun main() {
    val arr = intArrayOf(7, 1, 5, 3, 6, 4)
    println(maxProfit(arr))
}

fun maxProfit(prices: IntArray): Int {
    val n = prices.size
    var max = 0
    var min = 0
    for (i in 0..(n - 2)) {
        val buy = prices[i]
        for (j in (i+1) until n) {
            val sell = prices[j]
            if (buy > sell) break
            if ((sell - buy) > (max - min)) {
                max = sell
                min = buy
            }
        }
    }
    return max - min
}
