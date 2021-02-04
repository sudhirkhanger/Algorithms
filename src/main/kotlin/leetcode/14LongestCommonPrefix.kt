package leetcode

fun main() {
    val arr = arrayOf("flower", "flow", "flight")
    println(longestCommonPrefix(arr))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var prefix = ""
    if (strs.isEmpty()) return prefix
    if (strs.size == 1) return strs[0]
    val first = strs[0]
    val firstLen = first.length
    val arrSize = strs.size
    for (i in 1..firstLen) {
        val temp = first.substring(0, i)
        for (j in 1 until arrSize) {
            if (strs[j].length < i) return prefix
            if (temp != strs[j].substring(0, i)) return prefix
        }
        prefix = temp
    }
    return prefix
}
