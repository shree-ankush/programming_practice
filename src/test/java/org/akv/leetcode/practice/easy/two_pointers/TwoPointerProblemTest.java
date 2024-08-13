package org.akv.leetcode.practice.easy.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoPointerProblemTest {

    TwoPointerProblem twoPtrObj = new TwoPointerProblem();

    @Test
    void shortestDistanceToChar() {

        twoPtrObj.shortestDistanceToChar("aabaaaaa", 'b');

        twoPtrObj.shortestDistanceToChar("aaaaaabaaa", 'b');
        twoPtrObj.shortestDistanceToChar("abaaaabaaa", 'b');
        twoPtrObj.shortestDistanceToChar("abaabaabaaa", 'b');
        twoPtrObj.shortestDistanceToChar("loveleetcode", 'e');
    }


    @Test
    void findArrConcatValue() {

        assertEquals(247, twoPtrObj.findArrConcatValue(new int[]{1, 2, 33, 4}));

        assertEquals(673, twoPtrObj.findArrConcatValue(new int[]{5, 14, 13, 8, 12}));

        assertEquals(585, twoPtrObj.findArrConcatValue(new int[]{1, 45, 2, 33}));
        assertEquals(11, twoPtrObj.findArrConcatValue(new int[]{1, 1}));


    }


    @Test
    void firstPalindrome() {
        assertEquals("", twoPtrObj.firstPalindrome(new String[]{}));
        assertEquals("s", twoPtrObj.firstPalindrome(new String[]{"s"}));
        assertEquals("", twoPtrObj.firstPalindrome(new String[]{"sa", "sb"}));
        assertEquals("ss", twoPtrObj.firstPalindrome(new String[]{"sa", "sb", "ss"}));
        assertEquals("ada", twoPtrObj.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));
    }

//    @Test
//    void testCountPairsWithLoop() {
//        assertEquals(3, problem.countPairsWithLoop(new int[]{-1, 1, 2, 3, 1}, 2));
//        assertEquals(0, problem.countPairsWithLoop(new int[]{-1, 1, 2, 3, 1}, -2));
//        assertEquals(10, problem.countPairsWithLoop(new int[]{-6, 2, 5, -2, -7, -1, 3}, -2));
//
//    }

    @Test
    void arithmeticTriplets() {
        assertEquals(0, twoPtrObj.arithmeticTriplets(new int[]{0, 2}, 2));
        assertEquals(2, twoPtrObj.arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
        assertEquals(2, twoPtrObj.arithmeticTriplets(new int[]{1, 4, 7, 10}, 3));
        assertEquals(2, twoPtrObj.arithmeticTriplets(new int[]{4, 5, 6, 7, 8, 9}, 2));
    }

    @Test
    void findPerms() {
        assertArrayEquals(new int[]{0, 4, 1, 3, 2}, twoPtrObj.findPerms("IDID"));
    }

    @Test
    void sortedSquares() {
        assertArrayEquals(new int[]{0, 9, 16, 25, 100}, twoPtrObj.sortedSquares(new int[]{-4, -3, 0, 5, 10}));
        assertArrayEquals(new int[]{1, 4, 9}, twoPtrObj.sortedSquares(new int[]{-2, 1, 3}));

    }

    @Test
    void minAvgOfSmallestLargestNum() {
        assertEquals(5.5, twoPtrObj.minAvgOfSmallestLargestNum(new int[]{7, 8, 3, 4, 15, 13, 4, 1}));
        assertEquals(8.5, twoPtrObj.minAvgOfSmallestLargestNum(new int[]{1, 50, 8, 3, 50, 9}));

    }


    @Test
    void largestPositiveIntWithItsNegative() {
        assertEquals(3, twoPtrObj.largestPositiveIntWithItsNegative(new int[]{-1, 2, -3, 3}));
        assertEquals(-1, twoPtrObj.largestPositiveIntWithItsNegative(new int[]{-1, 2, -4, 3}));
        assertEquals(1, twoPtrObj.largestPositiveIntWithItsNegative(new int[]{-1, 1}));
        assertEquals(-1, twoPtrObj.largestPositiveIntWithItsNegative(new int[]{1}));
        assertEquals(7, twoPtrObj.largestPositiveIntWithItsNegative(new int[]{-1, 10, 6, 7, -7, 1}));

    }

    @Test
    void flipImage() {

        assertArrayEquals(new int[][]{{1,0,0}, {0,1,0},{1,1,1}}, twoPtrObj.flipImage(new int[][]{{1,1,0}, {1,0,1},{0,0,0}}));
        assertArrayEquals(new int[][]{{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}}, twoPtrObj.flipImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}));
    }

    @Test
    void reversePrefixOfWord() {
        assertEquals("dcbaefd", twoPtrObj.reversePrefixOfWord("abcdefd", 'd'));
        assertEquals("zxyxxe", twoPtrObj.reversePrefixOfWord("xyxzxe", 'z'));
        assertEquals("abcd", twoPtrObj.reversePrefixOfWord("abcd", 'z'));
    }

    @Test
    void isPalindrome() {
        assertTrue(twoPtrObj.isPalindrome("abba"));
        assertFalse(twoPtrObj.isPalindrome("ra ce a 34car"));
        assertFalse(twoPtrObj.isPalindrome("ra c:'\"e a 34car"));
        assertTrue(twoPtrObj.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void validPalindromeAfterRemovingAtMostOneChar() {
        assertTrue(twoPtrObj.validPalindromeAfterRemovingAtMostOneChar("eedede"));
        assertTrue(twoPtrObj.validPalindromeAfterRemovingAtMostOneChar("cbbcc"));
        assertTrue(twoPtrObj.validPalindromeAfterRemovingAtMostOneChar("aba"));
        assertTrue(twoPtrObj.validPalindromeAfterRemovingAtMostOneChar("abca"));
        assertFalse(twoPtrObj.validPalindromeAfterRemovingAtMostOneChar("abc"));
    }

    @Test
    void reverseWords() {
//        assertEquals("word",problem.reverseWords("word"));
        assertEquals("word", twoPtrObj.reverseWords("word is here"));
    }

    @Test
    void findTheDistanceValue() {
        assertEquals(2, twoPtrObj.findTheDistanceValue(new int[]{4,8,5},new int[]{10,9,1,8},2));
        assertEquals(2, twoPtrObj.findTheDistanceValue(new int[]{1,4,2,3},new int[]{-4,-3,6,10,20,30},3));
        assertEquals(1, twoPtrObj.findTheDistanceValue(new int[]{2,1,100,3},new int[]{-5,-2,10,-3,7},6));
    }



    @Test
    void arrayIntersection() {
        assertArrayEquals(new int[]{2}, twoPtrObj.arrayIntersection(new int[]{1,2,2,1},new int[]{2,2}));
        assertArrayEquals(new int[]{4,9}, twoPtrObj.arrayIntersection(new int[]{4,9,5},new int[]{9,4,9,8,4}));
    }

    @Test
    void arrangeNumbersAccordingToIdx() {
        assertArrayEquals(new int[]{4,5,2,7}, twoPtrObj.arrangeNumbersAccordingToIdx(new int[]{4,2,5,7}));
        assertArrayEquals(new int[]{0,1,4,3,4,3}, twoPtrObj.arrangeNumbersAccordingToIdx(new int[]{2,3,1,1,4,0,0,4,3,3}));
        assertArrayEquals(new int[]{0,1,4,3,4,3}, twoPtrObj.arrangeNumbersAccordingToIdx(new int[]{1,4,4,3,0,3}));
    }

    @Test
    void findMaxAverage() {
        assertEquals(12.75, twoPtrObj.findMaxAverage(new int[]{1, 12, -5, -6, 50,3},4));
    }
}