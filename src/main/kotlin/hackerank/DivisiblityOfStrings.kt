fun main() {
    val s = "bcdbcdbcdbcd"
    val t = "bcdbcd"
    println(findSmallestDivisor(s, t))
}

fun findSmallestDivisor(s: String, t: String): Int {
    val slen = s.length
    val tlen = t.length
    if (slen % tlen != 0) return -1
    val quotient = slen / tlen
    val contactedT = concat(t, quotient)
    if (s != contactedT) return -1
    val repeatSequence = repeatSequence(t)
    return if (repeatSequence.isEmpty())
        -1
    else
        repeatSequence.length
}

fun concat(str: String, n: Int): String {
    val builder = StringBuilder()
    for (i in 0 until n) {
        builder.append(str)
    }
    return builder.toString()
}

fun repeatSequence(t: String): String {
    val half = t.length / 2
    println("$half")
    for (i in 2..half) {
        val repeat = t.substring(0, i)
        val toMatch = t.substring(i, i + i)
        println("$repeat $toMatch $i")
        if (repeat == toMatch) return repeat
    }
    return t
}