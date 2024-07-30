package org.akv.leetcode.practice.easy;

import java.util.Arrays;

public class BinarySearchImplementation {

    /**
     * Return the index of the target element using binary search
     *
     * @param inputArr array of integers
     * @param target   integer
     * @return int
     * @TimeComplexity O(n log n)
     * @SpaceComplexity O(1)
     */
    public int findIndexOfTarget(int[] inputArr, int target) {


        if (inputArr.length == 0) {
            return -1;
        }

        Arrays.sort(inputArr);
        int left = 0, right = inputArr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == inputArr[mid]) {
                return mid;
            } else if (target > inputArr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return -1;
    }

    /**
     * Return the index of the target element using binary search
     *
     * @param target   integer
     * @param inputArr array of integers
     * @return int
     * @TimeComplexity O(n log n)
     * @SpaceComplexity O(1)
     */
    public boolean isTargetPresent(int target, int[] inputArr) {
        if (inputArr.length == 0) {
            return false;
        }

        Arrays.sort(inputArr);
        int left = 0, right = inputArr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == inputArr[mid]) {
                return true;
            } else if (target > inputArr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return false;
    }

    /**
     * Given an array arr of integers, check if there exist two indices i and j such that :
     * <p>
     * i != j
     * 0 <= i, j < arr.length
     * arr[i] == 2 * arr[j]
     * @param arr Array of Integers
     * @return boolean
     * @TimeComplexity O(n log n)
     * @SpaceComplexity O(1)
     */
    public boolean checkIfNumAndDoublePresent(int[] arr) {

        int x = 0;

        if (arr.length <= 1) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {

            if (isTargetPresent(arr[i] * 2, arr)) {
                if (x != i) {
                    x = 0;
                    return true;
                }
            }
            x++;

        }


        return false;
    }

    /**
     * array(which is sorted and have distinct elements) Return Index of target and if present else return its index
     * @param arr    Array of Integers
     * @param target
     * @TimeComplexity O(n ^ 2)
     * @SpaceComplexity O(n)
     * @TimeTaken : 35Min
     */
    public int searchIndexOfTargetElseReturnInsertIndex(int[] arr, int target) {

        if (isTargetPresent(target, arr)) {
            return findIndexOfTarget(arr, target);
        }

        int start = 0;
        while (start <= arr.length - 1) {
            if (arr[start] <= target) {
                start++;
            } else {
                break;
            }


        }
        return --start;

    }


}
