package leetcode

/**
 * Iterative approach
 * 1. Save temp next as current's next
 * 2. Point current's next to previous (null initially)
 * 3. Set previous to current
 * 4. Set current to temp next
 *
 * run until current is null
 */

/**
 * Recursive approach
 * pass head and newHead (null initially) to the recursive function
 * head's next becomes new head
 * head's next points to newHead
 * run the recursive function until head is null
 */