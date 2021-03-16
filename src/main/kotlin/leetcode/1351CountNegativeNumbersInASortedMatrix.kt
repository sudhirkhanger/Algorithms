package leetcode

fun main() {
    val grid = arrayOf(
        intArrayOf(4, 3, 2, -1),
        intArrayOf(3, 2, 1, -1),
        intArrayOf(1, 1, -1, -2),
        intArrayOf(-1, -1, -2, -3)
    )
    val grid2 = arrayOf(
        intArrayOf(3, 2),
        intArrayOf(1, 0)
    )
    println("${countNegatives(grid)}")
    println("${countNegatives(grid2)}")
}

fun countNegatives(grid: Array<IntArray>): Int {
    var negatives = 0
    grid.forEach { negatives += negatives(it) }
    return negatives
}

fun negatives(array: IntArray): Int {
    var l = 0
    var r = array.size - 1
    while (l <= r) {
        val mid = l + (r - l) / 2
        if (array[mid] >= 0) l = mid + 1
        else r = mid - 1
    }
    return array.size - l
}