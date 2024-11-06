class Solution {
    fun majorityElement(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        val sentinal = nums.size / 2
        val numsMap = mutableMapOf<Int, Int>()
        nums.forEach { num ->
    	    val count = numsMap[num]
	    if (count != null) {
	        if (count + 1 > sentinal) return num
	        numsMap[num] = count + 1
	    } else {
	        numsMap[num] = 1
	    }
        }
    return -1   
    }
}