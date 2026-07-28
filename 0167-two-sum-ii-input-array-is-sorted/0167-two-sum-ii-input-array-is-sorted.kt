class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int> = mutableMapOf()
        for (i in 0 until numbers.size) {
	        if (map.containsKey(target - numbers[i])) {
	            val num1 = i + 1
	            val num2 = (map[target - numbers[i]] ?: -1) + 1
	            return if (num1 < num2) intArrayOf(num1, num2) else intArrayOf(num2, num1)
	        } else {
	        map[numbers[i]] = i
	        }
        }   
    return intArrayOf(-1, -1)
    }
}