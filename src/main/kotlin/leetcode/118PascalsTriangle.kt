package leetcode

fun main() {
    val n = readLine()?.trim()?.toInt()
    println(generate(n ?: 1).joinToString())
}

fun generate(numRows: Int): List<List<Int>> {
    if (numRows == 0) return listOf()
    if (numRows == 1) return listOf(listOf(1))
    if (numRows == 2) return listOf(listOf(1), listOf(1, 1))
    val listOfList: MutableList<List<Int>> = mutableListOf(listOf(1), listOf(1, 1))
    for (i in 2 until numRows) {
        val original = listOfList.last()
        val list: MutableList<Int> = listOfList.last().toMutableList()
        for (j in 1 until i) { list[j] = original[j] + original[j - 1] }
        list.add(i, 1)
        listOfList.add(list)
    }
    return listOfList
}
