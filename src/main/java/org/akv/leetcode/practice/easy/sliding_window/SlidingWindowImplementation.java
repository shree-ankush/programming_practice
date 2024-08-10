package org.akv.leetcode.practice.easy.sliding_window;


import java.util.Arrays;
import java.util.HashMap;

public class SlidingWindowImplementation {

//    Logger logger = LoggerFactory.getLogger(SlidingWindowImplementation.class);

    /**
     * Find maximum sum of a sub array of size K
     *
     * @param arr
     * @param k
     * @return int
     * @TimeComplexity O(n)
     * @SpaceComplexity O(1)
     * @TimeTaken 15min
     */
    public int maxSumOfSubArrayOfSizeK(int[] arr, int k) {

        int windowStart = 0, windowEnd = k - 1;
        int maxSum = 0, currentSum = 0;
        for (int i = 0; i <= windowEnd; i++) {
            currentSum += arr[i];
        }

        maxSum = currentSum;
        windowEnd++;
        windowStart++;
        while (windowEnd < arr.length) {
            currentSum += arr[windowEnd];
            currentSum -= arr[windowStart - 1];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            windowEnd++;
            windowStart++;
        }
        return maxSum;
    }

    /**
     * You are given an integer array nums consisting of n elements, and an integer k.
     * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
     *
     * @param arr
     * @param k
     * @return double
     * @TimeComplexity O(n)
     * @SpaceComplexity O(1)
     * @TimeTaken 15mins
     */
    public double maxAvgOfSubArrayOfSizeK(int[] arr, int k) {
        int low = 0, high = k - 1;
        double maxAvg = 0, currentAvg = 0;
        for (int i = 0; i <= high; i++) {
            currentAvg += arr[i];
        }
        currentAvg /= k;
        maxAvg = currentAvg;
        high++;
        low++;
        while (high < arr.length) {
            currentAvg += ((double) arr[high] / k);
            currentAvg -= ((double) arr[low - 1] / k);
            if (currentAvg > maxAvg) {
                maxAvg = currentAvg;
            }
            high++;
            low++;
        }
        return maxAvg;
    }

    /**
     * You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
     * Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
     * Return the minimum possible difference.
     *
     * @param nums
     * @param k
     * @return int
     * @TimeComplexity O(nlogn)
     * @SpaceComplexity O(1)
     * @TimeTaken 25min
     */
    public int minDiffOfHighestAndLowestKScore(int[] nums, int k) {

        int currDiff = 0, minDiff = Integer.MAX_VALUE;
        int high = k - 1, low = 0;

        if (nums.length == 1) {
            return 0;
        }

        Arrays.sort(nums);
        currDiff = nums[high] - nums[low];
        high++;
        low++;
        if (currDiff < minDiff) {
            minDiff = currDiff;
        }

        while (high < nums.length) {

            currDiff = nums[high] - nums[low];
            if (currDiff < minDiff) {
                minDiff = currDiff;
            }
            high++;
            low++;
        }

        return minDiff;

    }

    /**
     * Returns Length of Longest Substring of input String
     *
     * @param str
     * @return int
     * @TimeComplexity O(n)
     * @SpaceComplexity O(n)
     * @TimeTaken 20mins
     */
    public int longestSubstringInAString(String str) {

        int windowStart = 0, windowSize = 0, longestStringSize = 0, index = 0;

        str = str.trim().toLowerCase();
        //leading and trailing spaces are removed.
        int length = str.length();

        HashMap<Character, Integer> lastSeenAtMap = new HashMap<>();
        if (length == 1) {
            return 1;
        }

        while (index < length) {
            char ch = str.charAt(index);
            if (lastSeenAtMap.containsKey(ch)) {
                if (lastSeenAtMap.get(ch) >= windowStart) {
                    windowSize = index - windowStart;

                    if (longestStringSize < windowSize) {
                        longestStringSize = windowSize;
                    }
                    windowStart = lastSeenAtMap.get(ch) + 1;

                }
                lastSeenAtMap.replace(ch, index);

            } else {
                lastSeenAtMap.put(ch, index);
            }

            index++;

        }
        if (longestStringSize < index - windowStart) {
            longestStringSize = index - windowStart;
        }

        return longestStringSize;
    }

    /**
     * You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.
     * To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.
     * If k > 0, replace the ith number with the sum of the next k numbers.
     * If k < 0, replace the ith number with the sum of the previous k numbers.
     * If k == 0, replace the ith number with 0.
     * As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].
     * Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!
     * @param code
     * @param k
     * @return int[]
     * @TimeComplexity O(n)
     * @SpaceComplexity O(n)
     * @TimeTaken 45min
     */
    public int[] getBombDefuseCode(int[] code, int k) {
        int[] decryptedCode = new int[code.length];

        boolean isWindowSizeSet = false;
        int index = 0, windowSize = 0;
        int windowStart = 0;
        if (k == 0) {
            Arrays.fill(decryptedCode, 0);

        } else if (k > 0) {

            while (index < code.length) {
                if (!isWindowSizeSet) {
                    if (index + (k) >= code.length) {
                        windowSize = (index + k) % code.length;
                    } else {
                        windowSize = index + k;
                    }
                    isWindowSizeSet = true;

                }
                windowStart++;
                if (windowStart >= code.length) {
                    windowStart = windowStart % code.length;
                }
                decryptedCode[index] += code[windowStart];
                if (windowStart == windowSize) {

                    index++;
                    windowStart = index;
                    isWindowSizeSet = false;
                }
            }

        } else {
            while (index < code.length) {
                if (!isWindowSizeSet) {
                    if (index + k < 0) {
                        windowSize = (code.length + k) + index;
                    } else {
                        windowSize = index + k;
                    }
                    isWindowSizeSet = true;
                }
                windowStart--;
                if (windowStart < 0) {
                    windowStart = code.length - 1;
                }
                decryptedCode[index] += code[windowStart];
                if (windowStart == windowSize) {
                    index++;
                    windowStart = index;
                    isWindowSizeSet = false;
                }
            }
        }
        return decryptedCode;

    }

    /**
     * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.
     *
     * You are also given an integer k, which is the desired number of consecutive black blocks.
     *
     * In one operation, you can recolor a white block such that it becomes a black block.
     *
     * Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
     * @param blocks
     * @param k
     * @return
     * @TimeComplexity O(n)
     * @SpaceComplexity O(1)
     * @TimeTaken 25mins11sec
     */
    public int minimumRecolors(String blocks,int k){
        int windowStart=0,windowEnd=k-1;
        int currBlackColorCount=0,maxBlackColorCount=0;
        for (int i = 0; i <= windowEnd; i++) {
            if(blocks.charAt(i)=='B'){
                currBlackColorCount++;
            }
        }
        if(currBlackColorCount>maxBlackColorCount){
            maxBlackColorCount=currBlackColorCount;
        }
        windowEnd++;
        windowStart++;
        while(windowEnd<blocks.length()){
            if(blocks.charAt(windowStart-1)=='B' ){
                currBlackColorCount--;
            }
            if(blocks.charAt(windowEnd)=='B'){
                currBlackColorCount++;
            }
            windowEnd++;
            windowStart++;
            if(currBlackColorCount>maxBlackColorCount){
                maxBlackColorCount=currBlackColorCount;
            }

        }
        return Math.max(k-maxBlackColorCount, 0);

    }

}
