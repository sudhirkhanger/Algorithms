package leetcode

fun main() {
    assert(peakIndexInMountainArray(intArrayOf(0, 1, 0)) == 1)
    assert(peakIndexInMountainArray(intArrayOf(0, 2, 1, 0)) == 2)
    assert(peakIndexInMountainArray(intArrayOf(3, 4, 5, 1)) == 5)
    assert(peakIndexInMountainArray(intArrayOf(24, 69, 100, 99, 79, 78, 67, 36, 26, 19)) == 100)
}

fun peakIndexInMountainArray(arr: IntArray): Int {
    var l = 1
    var r = arr.size - 2
    while (l <= r) {
        val m = l + (r - l) / 2
        if (arr[m - 1] < arr[m] && arr[m] > arr[m + 1]) return m
        if (arr[m] < arr[m + 1]) l = m + 1
        else r = m - 1
    }
    return 0
}