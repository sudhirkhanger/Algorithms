package leetcode

fun main() {
    val s = "{[]}"
    println("isValid ${isValid(s)}")
}

fun isValid(s: String): Boolean {
    val symbolArr = CharArray(s.length)
    var size = 0

    s.forEach {
        if (it == '(' || it == ')' ||
            it == '{' || it == '}' ||
            it == '[' || it == ']'
        )
            if (isOpeningChar(it)) {
                symbolArr[size] = it
                size++
            } else {
                if (size == 0) return false
                if (symbolArr[size - 1] == '(' && it == ')' ||
                    symbolArr[size - 1] == '{' && it == '}' ||
                    symbolArr[size - 1] == '[' && it == ']'
                ) {
                    size--
                } else {
                    return false
                }
            }
    }

    return size == 0
}

fun isOpeningChar(char: Char): Boolean {
    return (char == '(' || char == '{' || char == '[')
}
