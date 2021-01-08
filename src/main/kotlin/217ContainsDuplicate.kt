fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 1)))
}

fun containsDuplicate(nums: IntArray): Boolean {
    val map = HashMap<Int, Int>()
    for (num in nums) {
        if (map.containsKey(num)) {
            return true
        } else {
            map[num] = 0
        }
    }
    return false
}