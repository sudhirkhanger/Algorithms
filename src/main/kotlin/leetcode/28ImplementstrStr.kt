package leetcode

fun main() {
    println("${strStr("hello", "ll")} = 2")
    println("${strStr("aaaaa", "bba")} = -1")
    println("${strStr("", "")} = 0")
    println("${strStr("mississippi", "issipi")} = -1")
    println("${strStr("mississippi", "issip")} = 4")
    println("${strStr("a", "a")} = 0")
}

fun strStr(haystack: String, needle: String): Int {
    if (needle.length == 0) return 0
    for (i in 0..(haystack.length - needle.length)) {
        if (haystack[i] == needle[0]) {
            for (j in 1..needle.length) {
                if (j == needle.length) return i
                if (haystack[i + j] != needle[j]) break
            }
        }
    }
    return -1
}