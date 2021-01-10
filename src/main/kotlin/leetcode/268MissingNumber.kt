fun main() {
    val list = intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)
    println(missingNumber(list))
}

// Could do better. Try with O(n) instead of current O(n^2)
fun missingNumber(nums: IntArray): Int {
    val n = nums.size

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == nums[j]) {
                break
            }
            if (j == n - 1) return i
        }
    }
    return n
}
