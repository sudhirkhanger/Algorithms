class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val result = mutableListOf<List<String>>()
    val skip = mutableSetOf<Int>()
    for (i in strs.indices) {
        if (skip.contains(i).not()) {
            val intermediateList = mutableListOf<String>()
            intermediateList.add(strs[i])
            for (j in i + 1..<strs.size) {
                if (isAnagram(strs[i], strs[j])) {
                    intermediateList.add(strs[j])
                    skip.add(i)
                    skip.add(j)
                }
            }
            result.add(intermediateList)
        }
    }
    return result
}

fun isAnagram(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) return false
    val word1Map = mutableMapOf<Char, Int>()
    word1.forEach { char ->
        if (word1Map.containsKey(char)) {
            word1Map[char] = word1Map[char]!! + 1
        } else {
            word1Map[char] = 1
        }
    }

    val word2Map = mutableMapOf<Char, Int>()
    word2.forEach { char ->
        if (word2Map.containsKey(char)) {
            word2Map[char] = word2Map[char]!! + 1
        } else {
            word2Map[char] = 1
        }
    }

    word1Map.entries.forEach { (k, v) ->
        val word2MapValue = word2Map[k]
        if (word2MapValue == null || word2MapValue != v) return false
    }

    return true
}

}
