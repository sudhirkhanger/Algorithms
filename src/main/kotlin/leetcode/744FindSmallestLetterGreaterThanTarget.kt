package leetcode

fun main() {
    assert(nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'a') == 'c')
    assert(nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'c') == 'f')
    assert(nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'd') == 'f')
    assert(nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'g') == 'j')
    assert(nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'j') == 'c')
    assert(nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'k') == 'c')
    assert(nextGreatestLetter(charArrayOf('e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'), 'k') == 'c')
}

fun nextGreatestLetter(letters: CharArray, target: Char): Char {
    var l = 0
    var r = letters.size - 1
    var result = 0
    while (l <= r) {
        val m = l + (r - l) / 2
        when {
            target == letters[m] -> {
                if (target == letters[(m + 1) % letters.size]) {
                    l = m + 1
                } else return letters[(m + 1) % letters.size]
            }
            target > letters[m] -> l = m + 1
            else -> {
                result = m
                r = m - 1
            }
        }
    }
    return letters[result]
}