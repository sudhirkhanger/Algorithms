package leetcode

import kotlin.collections.set

fun main() {
    val nums1 = intArrayOf(1, 1, 2, 2)
    val nums2 = intArrayOf(2, 2)
    println(intersect(nums1, nums2).joinToString())
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val outputMap = hashMapOf<Int, Int>()
    val outputList = mutableListOf<Int>()

    for (num1 in nums1) outputMap[num1] = outputMap.getOrElse(num1) { 0 } + 1

    for (num2 in nums2) {
        outputMap[num2]?.let {
            if (it > 0) {
                outputList.add(num2)
                outputMap[num2] = it - 1
            }
        }
    }

    return IntArray(outputList.size) { outputList[it] }
}
