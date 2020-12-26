import java.util.*

fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target)
                return intArrayOf(i, j)
        }
    }
    return intArrayOf()
}

fun main() {
    println(Arrays.toString(twoSum(intArrayOf(3, 2, 4), 6)))
}
