package leetcode

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val nums1 = intArrayOf(-1, -100, 3, 99)
    rotate(nums, 3)
    rotate(nums1, 2)
    println(nums.joinToString())
    println(nums1.joinToString())
}

fun rotate(nums: IntArray, k: Int): Unit {
    val size = nums.size
    for (i in 1..k) {
        val last = nums[size - 1]
        for (j in (size - 2) downTo 0) nums[j + 1] = nums[j]
        nums[0] = last
    }
}