class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val listOfList = mutableListOf<List<Int>>()
        for (i in 1..numRows) {
            when (i) {
                1 -> {
                    listOfList.add(listOf(1))
                }
                2 -> {
                    listOfList.add(listOf(1, 1))
                }
                else -> {
                    val previousRow = listOfList[i - 2]
                    val currentRow = createCurrentRow(previousRow, i)
                    listOfList.add(currentRow)
                }
            }
        }
        return listOfList
    }

    fun createCurrentRow(previousRow: List<Int>, row: Int): List<Int> {
        val currentRow = mutableListOf<Int>()
        for (j in 0 until row) {
            when(j) {
                0 -> currentRow.add(1)
                row - 1 -> currentRow.add(1)
                else -> currentRow.add(previousRow[j - 1] + previousRow[j])
            }
        }
        return currentRow
    }
}