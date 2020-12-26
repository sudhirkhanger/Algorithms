import java.util.*

// TODO: couldn't solve
fun removeDuplicates(nums: IntArray): Int {
    var i = 0
    var unique = 1
    while (i < nums.size - 1) {
        if (nums[i] == nums[i + 1]) {
            for (j in (i + 1)..(nums.size - (i + 2))) {
                val x = nums[j]
                nums[j] = nums[j + 1]
                nums[j + 1] = x
            }
            unique++
        } else {
            i++
        }
    }
    return unique
}

fun main() {
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
}