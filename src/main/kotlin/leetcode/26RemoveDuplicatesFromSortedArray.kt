package leetcode

fun main() {
    val arr = intArrayOf(8)
    removeDuplicates(arr)
}

fun removeDuplicates(nums: IntArray): Int {
    val n = nums.size
    if (n == 0) return 0
    var index = 0

    for (j in 1 until n) {
        if (nums[index] != nums[j]) nums[++index] = nums[j]
    }
    return index + 1
}
