class Solution {
    fun reverseString(s: CharArray) {
        var l = 0
        var r = s.size - 1
        var temp: Char

        while (l <= r) {
	        temp = s[r]
	        s[r] = s[l]
	        s[l] = temp
            l++
            r--
        }
        println(s)
    }
}