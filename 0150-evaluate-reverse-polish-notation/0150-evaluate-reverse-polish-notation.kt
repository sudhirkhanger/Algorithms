class Solution {

    fun evalRPN(tokens: Array<String>): Int {

    val stack = mutableListOf<Int>()

    for (i in tokens) {
	if (isSymbol(i)) {
	    val last = stack.last()
	    stack.removeAt(stack.size - 1)

	    val secondLast = stack.last()
	    stack.removeAt(stack.size - 1)

	    when(i) {
		"+" -> {
		    stack.add(secondLast + last)
		}
		"-" -> {
		    stack.add(secondLast - last)
		}
		"*" -> {
		    stack.add(secondLast * last)
		}
		else -> {
		    stack.add(secondLast / last)
		}
	    }
	} else {
	    stack.add(i.toInt())
	}
    }

    println(stack.joinToString())
    
    return stack.last()
}

fun isSymbol(input: String): Boolean {
    val map = mapOf("+" to "+", "-" to "-", "*" to "*", "/" to "/")
    return (input in map)
}

}