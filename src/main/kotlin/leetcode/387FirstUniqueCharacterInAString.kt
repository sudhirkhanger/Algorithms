package leetcode

fun main() {
    val s = "cc"
    println(firstUniqChar(s))
}

fun firstUniqChar(s: String): Int {
    val len = s.length
    outer@ for (i in 0 until len) {
        inner@ for (j in 0 until len) {
            if (i != j && s[i] == s[j]) {
                break@inner
            }
            if (j == len - 1) return i
        }
    }
    return -1
}
