class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numsMap = mutableMapOf<Int, Int>()

        nums.forEachIndexed { i, n ->
            numsMap[n] = i
        }

        nums.forEachIndexed { i1, item1 ->
	        val item2 = target - item1
	        if (numsMap.containsKey(item2)) {
	            val i2 = numsMap[item2]
	            if (i2 != null && i2 != i1) return intArrayOf(i1, i2)
	        }
        }
    
    return intArrayOf(0)
    }
}