package leetcode

fun main() {
    println(isSubsequence("abc", "ahbgdc"))
    println(isSubsequence("axc", "ahbgdc"))
    println(isSubsequence("acb", "ahbgdc"))
    println(isSubsequence("acb", "ahbgdc"))
    println(isSubsequence("aaaaaa", "bbaaaa"))
}

fun isSubsequence(s: String, t: String): Boolean {
    var start = 0
    s.forEach() { letter ->
        var found = false
        for (i in start until t.length) {
            if (letter == t[i]) {
                found = true
                start = i + 1
                break
            }
        }
        if (!found) return false
    }
    return true
}