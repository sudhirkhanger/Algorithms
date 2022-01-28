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

// using hashtable
fun twoSum(nums: IntArray, target: Int): IntArray {
    val arrMap: MutableMap<Int, Int> = mutableMapOf<Int, Int>()
    nums.forEachIndexed { index, element ->
        val index1 = arrMap.getOrDefault(target - element, -1)
            if (index1 != -1) {
                return intArrayOf(index1, index)
            }
        arrMap[element] = index
    }
    return intArrayOf()
}

fun main() {
    println(Arrays.toString(twoSum(intArrayOf(3, 2, 4), 6)))
}
