package leetcode

fun main() {
    val x = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
    reverseString(x)
}

fun reverseString(s: CharArray): Unit {
    val size = s.size
    for (i in 0 until size / 2) exch(i, size - 1 - i, s)
}

fun exch(initial: Int, final: Int, s: CharArray) {
    val temp = s[initial]
    s[initial] = s[final]
    s[final] = temp
}
