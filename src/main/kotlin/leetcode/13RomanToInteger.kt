package leetcode

fun main() {
//    println("III or 3 = ${romanToInt("III")}")
//    println("IV or 4 = ${romanToInt("IV")}")
//    println("IX or 9 = ${romanToInt("IX")}")
    println("LVIII or 58 = ${romanToInt("LVIII")}")
//    println("MCMXCIV or 1994 = ${romanToInt("MCMXCIV")}")
}

fun romanToInt(s: String): Int {
    val len = s.length
    var i = 0
    var sol = 0
    while (i < len) {
        val letter = s[i]
        val roman = when (letter) {
            'I' -> {
                if (i + 1 < len) {
                    when (s[i + 1]) {
                        'V' -> {
                            i++
                            4
                        }
                        'X' -> {
                            i++
                            9
                        }
                        else -> 1
                    }
                } else {
                    1
                }
            }
            'X' -> {
                if (i + 1 < len) {
                    when (s[i + 1]) {
                        'L' -> {
                            i++
                            40
                        }
                        'C' -> {
                            i++
                            90
                        }
                        else -> 10
                    }
                } else {
                    10
                }
            }
            'C' -> {
                if (i + 1 < len) {
                    when (s[i + 1]) {
                        'D' -> {
                            i++
                            400
                        }
                        'M' -> {
                            i++
                            900
                        }
                        else -> 100
                    }
                } else {
                    100
                }
            }
            'V' -> 5
            'L' -> 50
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
        i++
        println("$roman")
        sol = sol + roman
    }
    return sol
}