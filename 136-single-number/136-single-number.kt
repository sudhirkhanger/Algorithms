class Solution {
  fun singleNumber(nums: IntArray): Int {
    val length = nums.size
    var singleNum = nums[0]
    outerloop@ for (i in 0 until length) {
      singleNum = nums[i]
      innerloop@ for (j in 0 until length) {
        if (i != j) {
          if (nums[i] != nums[j] && j == length - 1) {
            return singleNum
          } else if (nums[i] == nums[j]) {
            continue@outerloop
          }
        }
      }
    }
    return singleNum
  }
}