package org.akv.leetcode.practice.easy.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowImplementationTest {

    SlidingWindowImplementation slidingWindowImplementation = new SlidingWindowImplementation();
    @Test
    void maxSubArrayOfSizeK() {
        assertEquals(18,slidingWindowImplementation.maxSumOfSubArrayOfSizeK(new int[]{4,2,-1,9,7,-3,5},4));
        assertEquals(8,slidingWindowImplementation.maxSumOfSubArrayOfSizeK(new int[]{1,2,3,5},2));
    }

    @Test
    void maxAvgOfSubArrayOfSizeK() {
        assertEquals(12.75000,slidingWindowImplementation.maxAvgOfSubArrayOfSizeK(new int[]{1,12,-5,-6,50,3},4));
        assertEquals(4.00000,slidingWindowImplementation.maxAvgOfSubArrayOfSizeK(new int[]{0,4,0,3,2},1));

    }

    @Test
    void minDiffOfHighestAndLowestKScore() {
        assertEquals(0,slidingWindowImplementation.minDiffOfHighestAndLowestKScore(new int[]{90},1));
        assertEquals(2,slidingWindowImplementation.minDiffOfHighestAndLowestKScore(new int[]{9,4,1,7},2));
        assertEquals(74560,slidingWindowImplementation.minDiffOfHighestAndLowestKScore(new int[]{87063,61094,44530,21297,95857,93551,9918},6));
    }


    @Test
    void longestSubstringInAString() {
        assertEquals(6,slidingWindowImplementation.longestSubstringInAString("ab cda 933"));
        assertEquals(5,slidingWindowImplementation.longestSubstringInAString("abcdbea"));
        assertEquals(6,slidingWindowImplementation.longestSubstringInAString("abcdaef"));
        assertEquals(8,slidingWindowImplementation.longestSubstringInAString("  Abcd efg   "));
        assertEquals(7,slidingWindowImplementation.longestSubstringInAString("  Abcdaefg   "));
        assertEquals(3,slidingWindowImplementation.longestSubstringInAString("8299293348"));
        assertEquals(4,slidingWindowImplementation.longestSubstringInAString("9984981991"));
        assertEquals(4,slidingWindowImplementation.longestSubstringInAString("axa89 dfi99 "));

    }


}