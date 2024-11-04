class Solution {
    fun missingNumber(nums: IntArray): Int {
        val sortedList = nums.sorted()
        for (i in 0..sortedList.size) {
    	    if (i == sortedList.size || sortedList[i] != i) return i
        }
    return -1
    }
}