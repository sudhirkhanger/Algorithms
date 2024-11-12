class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
    	    val updatedDigit = digits[i].inc()
    	    if (updatedDigit > 9) {
	            digits[i] = updatedDigit.mod(10)
	        } else {
	            digits[i] = updatedDigit
	            return digits
	        }
        }

    if (digits.first() == 0) {
       val result = IntArray(digits.size.inc())
       result[0] = 1
       digits.forEachIndexed { i, n ->
           result[i+1] = n
       }
       return result
    }

    return digits
    }
}