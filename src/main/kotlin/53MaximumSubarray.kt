fun main() {
    println(maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
}

fun maxSubArray(nums: IntArray): Int {
    val current = mutableListOf<Int>()
    val global = mutableListOf<Int>()

    nums.forEach { element ->
        if (current.sum() > element) {
            current.add(element)
        } else {
            current.clear()
            current.add(element)
        }

        if (current.sum() > global.sum()) {
            global.clear()
            global.addAll(current)
        }
    }
    return global.sum()
}