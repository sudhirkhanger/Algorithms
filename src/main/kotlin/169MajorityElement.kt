fun main() {
    println(majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
}

fun majorityElement(nums: IntArray): Int {
    val n = nums.size
    var b = nums[0]
    val map = HashMap<Int, Int>()

    for (i in 0 until n) {
        val count = map.getOrDefault(nums[i], 0) + 1
        map[nums[i]] = count
        if (count > map.getOrDefault(b, 0)) b = nums[i]
    }
    return b
}