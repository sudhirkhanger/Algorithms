class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val dupMap = hashMapOf<Int, Int>()
        var result = false
        nums.forEach { num ->
            val count = dupMap[num]
            if (count != null) {
                result = true
            } else {
                dupMap[num] = 1
            }
        }
        return result
    }
}