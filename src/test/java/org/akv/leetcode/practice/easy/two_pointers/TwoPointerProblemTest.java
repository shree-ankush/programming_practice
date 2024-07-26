package org.akv.leetcode.practice.easy.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoPointerProblemTest {

    TwoPointerProblem problem = new TwoPointerProblem();

    @Test
    void shortestDistanceToChar() {

        problem.shortestDistanceToChar("aabaaaaa", 'b');

        problem.shortestDistanceToChar("aaaaaabaaa", 'b');
        problem.shortestDistanceToChar("abaaaabaaa", 'b');
        problem.shortestDistanceToChar("abaabaabaaa", 'b');
        problem.shortestDistanceToChar("loveleetcode", 'e');
//[3,2,1,0,1,0,0,1,2,2,1,0]
    }


    @Test
    void findArrConcatValue() {

        assertEquals(247, problem.findArrConcatValue(new int[]{1, 2, 33, 4}));

        assertEquals(673, problem.findArrConcatValue(new int[]{5, 14, 13, 8, 12}));

        assertEquals(585, problem.findArrConcatValue(new int[]{1, 45, 2, 33}));
        assertEquals(11, problem.findArrConcatValue(new int[]{1, 1}));


    }


    @Test
    void firstPalindrome() {
        assertEquals("", problem.firstPalindrome(new String[]{}));

        assertEquals("s", problem.firstPalindrome(new String[]{"s"}));

        assertEquals("", problem.firstPalindrome(new String[]{"sa", "sb"}));
        assertEquals("ss", problem.firstPalindrome(new String[]{"sa", "sb", "ss"}));


        assertEquals("ada", problem.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));
    }

    @Test
    void testCountPairsWithLoop() {
        assertEquals(3, problem.countPairsWithLoop(new int[]{-1, 1, 2, 3, 1}, 2));
        assertEquals(0, problem.countPairsWithLoop(new int[]{-1, 1, 2, 3, 1}, -2));
        assertEquals(10, problem.countPairsWithLoop(new int[]{-6, 2, 5, -2, -7, -1, 3}, -2));

    }

    @Test
    void arithmeticTriplets() {
        assertEquals(0, problem.arithmeticTriplets(new int[]{0, 2}, 2));
        assertEquals(2, problem.arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
        assertEquals(2, problem.arithmeticTriplets(new int[]{1, 4, 7, 10}, 3));
        assertEquals(2, problem.arithmeticTriplets(new int[]{4, 5, 6, 7, 8, 9}, 2));
    }

    @Test
    void findPerms() {
        assertEquals(new int[]{0, 4, 1, 3, 2}, problem.findPerms("IDID"));
    }

    @Test
    void sortedSquares() {
        assertArrayEquals(new int[]{0, 9, 16, 25, 100}, problem.sortedSquares(new int[]{-4, -3, 0, 5, 10}));
        assertArrayEquals(new int[]{1, 4, 9}, problem.sortedSquares(new int[]{-2, 1, 3}));

    }

    @Test
    void minAvgOfSmallestLargestNum() {
        assertEquals(5.5, problem.minAvgOfSmallestLargestNum(new int[]{7, 8, 3, 4, 15, 13, 4, 1}));
        assertEquals(8.5, problem.minAvgOfSmallestLargestNum(new int[]{1, 50, 8, 3, 50, 9}));

    }


    @Test
    void largestPositiveIntWithItsNegative() {
        assertEquals(3, problem.largestPositiveIntWithItsNegative(new int[]{-1, 2, -3, 3}));
        assertEquals(-1, problem.largestPositiveIntWithItsNegative(new int[]{-1, 2, -4, 3}));
        assertEquals(1, problem.largestPositiveIntWithItsNegative(new int[]{-1, 1}));
        assertEquals(-1, problem.largestPositiveIntWithItsNegative(new int[]{1}));
        assertEquals(7, problem.largestPositiveIntWithItsNegative(new int[]{-1, 10, 6, 7, -7, 1}));

    }

    @Test
    void flipImage() {

        assertArrayEquals(new int[][]{{1,0,0}, {0,1,0},{1,1,1}}, problem.flipImage(new int[][]{{1,1,0}, {1,0,1},{0,0,0}}));
        assertArrayEquals(new int[][]{{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}},problem.flipImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}));
    }

    @Test
    void reversePrefixOfWord() {
        assertEquals("dcbaefd", problem.reversePrefixOfWord("abcdefd", 'd'));
        assertEquals("zxyxxe", problem.reversePrefixOfWord("xyxzxe", 'z'));
        assertEquals("abcd", problem.reversePrefixOfWord("abcd", 'z'));
    }

    @Test
    void isPalindrome() {
        assertTrue(problem.isPalindrome("abba"));
        assertFalse(problem.isPalindrome("ra ce a 34car"));
        assertFalse(problem.isPalindrome("ra c:'\"e a 34car"));
        assertTrue(problem.isPalindrome("A man, a plan, a canal: Panama"));
    }
}