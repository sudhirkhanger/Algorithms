fun main() {
    println(getMaxValue(arrayOf(3, 2, 3, 5)))
}

fun getMaxValue(arr: Array<Int>): Int {
    arr.sort()
    arr[0] = 1
    val n = arr.size
    for (i in 1 until n) {
        if (arr[i] - arr[i - 1] > 1) {
            arr[i] = arr[i - 1] + 1
        }
    }
    return arr[n - 1]
}