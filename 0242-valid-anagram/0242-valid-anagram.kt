class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val anagramMap = mutableMapOf<Char, Int>()
        s.forEach {
            val count = anagramMap.get(it)
            if (count == null) {
                anagramMap[it] = 1
            } else {
                anagramMap[it] = count + 1
            }
        }

        t.forEach {
            val count = anagramMap.get(it)
            if (count == null) {
                anagramMap[it] = 1
            } else {
                anagramMap[it] = count - 1
            }
        }
        anagramMap.forEach {
            if (it.value != 0) return false
        }
        return true
    }
}