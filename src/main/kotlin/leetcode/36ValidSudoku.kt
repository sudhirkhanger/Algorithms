package leetcode

fun main() {
    val board = arrayOf(
        charArrayOf('.', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )

    println(isValidSudoku(board))
}

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val subBoxes = arrayOf(
        Pair(0, 0),
        Pair(0, 3),
        Pair(0, 6),
        Pair(3, 0),
        Pair(3, 3),
        Pair(3, 6),
        Pair(6, 0),
        Pair(6, 3),
        Pair(6, 6)
    )

    subBoxes.forEachIndexed { index, pair ->
        if (!checkRow(board, index)) return false
        if (!checkCol(board, index)) return false
        if (!checkSubBox(getSubBox(board, pair))) return false
    }

    return true
}

fun getSubBox(board: Array<CharArray>, pair: Pair<Int, Int>): Array<Char> {
    return arrayOf(
        (board[pair.first])[pair.second],
        (board[pair.first])[pair.second + 1],
        (board[pair.first])[pair.second + 2],
        (board[pair.first + 1])[pair.second],
        (board[pair.first + 1])[pair.second + 1],
        (board[pair.first + 1])[pair.second + 2],
        (board[pair.first + 2])[pair.second],
        (board[pair.first + 2])[pair.second + 1],
        (board[pair.first + 2])[pair.second + 2]
    )
}

fun checkSubBox(subBox: Array<Char>): Boolean {
    val gridMap = hashMapOf<Char, Int>()
    subBox.forEach { c ->
        if (c != '.') {
            if (gridMap.containsKey(c)) return false
            else gridMap[c] = 0
        }
    }
    return true
}

fun checkRow(board: Array<CharArray>, row: Int): Boolean {
    val rowMap = hashMapOf<Char, Int>()
    board[row].forEach { num ->
        if (num != '.') {
            if (rowMap.containsKey(num)) return false
            else rowMap[num] = 0
        }
    }
    return true
}

fun checkCol(board: Array<CharArray>, col: Int): Boolean {
    val colMap = hashMapOf<Char, Int>()
    board.forEach { row ->
        if (row[col] != '.') {
            if (colMap.containsKey(row[col])) return false
            else colMap[row[col]] = 0
        }
    }
    return true
}
