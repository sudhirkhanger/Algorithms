fun main() {
    moveZeroes(intArrayOf(0, 0, 1))
}

fun moveZeroes(nums: IntArray): Unit {
    println(nums.joinToString())
    var innerCount = nums.size - 1
    var outerCount = 0
    while (outerCount < innerCount) {
        if (nums[outerCount] == 0) {
            for (j in outerCount until innerCount) {
                nums[j] = nums[j + 1]
                nums[j + 1] = 0
            }
            innerCount--
        }
        if (nums[outerCount] != 0) outerCount++
    }
    println(nums.joinToString())
}