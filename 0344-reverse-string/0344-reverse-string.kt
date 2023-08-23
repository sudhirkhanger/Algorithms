class Solution {
    fun reverseString(s: CharArray): Unit {
    var temp: Char
    for (i in 0..((s.size / 2)-1)) {
       temp = s[i]
       val lastPos = (s.size - 1) - i
       s[i] = s[lastPos]
       s[lastPos] = temp
    }
    }
}