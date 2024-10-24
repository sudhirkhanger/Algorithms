class Solution {
    fun singleNumber(nums: IntArray): Int {
        val numMap = mutableMapOf<Int, Int>()
        nums.forEach { num -> 
            val count = numMap[num]
            if (count == null) {
                numMap[num] = 1
            } else {
                numMap[num] = 2
            }
        }
        numMap.forEach {
            if(it.value == 1) return it.key
        }
        return -1
    }
}