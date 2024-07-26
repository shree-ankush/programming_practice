package org.akv.leetcode.practice.easy.two_pointers;


import java.util.Arrays;


public class TwoPointerProblem {


    public int[] shortestDistanceToChar(String s, char c) {
        int[] answer = new int[s.length()];
        char[] sArr = s.toCharArray();
        int currIndex = s.indexOf(c, 0);


        while (currIndex != -1) {
            int left = currIndex - 1, right = currIndex + 1;
            answer[currIndex] = 0;

            boolean isLeftFinished = true, isRightDone = true;

            for (int i = 0; i <= (s.length() - currIndex) + 1; i++) {
                if (left < 0) {
                    isLeftFinished = false;
                }

                if (isLeftFinished && sArr[left] != c) {
                    if (answer[left] == 0)
                        answer[left] = Math.abs(currIndex - left);
                    answer[left] = Math.min(Math.abs(currIndex - left), answer[left]);

                }

                if (right > s.length() - 1) {
                    isRightDone = false;
                }

                if (isRightDone && sArr[right] != c) {
                    if (answer[right] == 0) {

                        answer[right] = Math.abs(currIndex - right);

                    } else
                        answer[right] = Math.min(Math.abs(currIndex - right), answer[right]);

                }

                answer[currIndex] = 0;
                right++;
                left--;

            }


            for (int i = 0; i < sArr.length; i++) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
            for (int i = 0; i < sArr.length; i++) {
                System.out.print(answer[i] + " ");
            }
            currIndex = s.indexOf(c, currIndex + 1);
            System.out.println();
        }
        return answer;

    }


    public long findArrConcatValue(int[] arr) {
        int left = 0, right = arr.length - 1;
        long answer = 0;

        while (left <= right) {
            String s = "";
            if (left != right) {
                s += arr[left] + "" + arr[right];
            } else {
                s += arr[left];
            }
            System.out.print(s + " ");
            System.out.println();
            answer += Long.parseLong(s);
            System.out.print(answer + " ");
            left++;
            right--;
        }
        return answer;
    }


    public String firstPalindrome(String[] words) {

        /**
         * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
         * @param words
         * @return String
         * @TimeComplexity O(n)
         * @SpaceComplexity O(1)
         * @TimeTaken N/A
         */

        for (int i = 0; i < words.length; i++) {
            if (checkPallindrome(words[i])) return words[i];
        }
        return "";
    }

    public boolean checkPallindrome(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public int countPairsWithLoop(int[] arr, int target) {

        /**
         * // Given an array of integers, count the number of pairs whose sum is less than a given target.
         * @param arr
         * @param target
         * @return int
         * @TimeComplexity O(n)
         * @SpaceComplexity O(1)
         */

        int countPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] < target) {
                    countPairs++;
                }

            }

        }
        return countPairs;
    }

    public int arithmeticTriplets(int[] nums, int diff) {

        /**
         * You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
         *
         * i < j < k,
         * nums[j] - nums[i] == diff, and
         * nums[k] - nums[j] == diff.
         * Return the number of unique arithmetic triplets.
         * @param nums
         * @param diff
         * @return int
         * @TimeComplexity O(n ^ 3)
         * @SpaceComplexity O(1)
         */

        int count = 0;
        if (nums.length < 3) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == diff) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] - nums[j] == diff) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    public int[] findPerms(String di) {

        /**
         * A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
         *
         * s[i] == 'I' if perm[i] < perm[i + 1], and
         * s[i] == 'D' if perm[i] > perm[i + 1].
         * Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
         * @param di
         * @return Integer Array
         * @TimeComplexity O(n)
         * @SpaceComplexity O(n)
         */

        int[] perm = new int[di.length() + 1];
        int high = di.length(), low = 0, i = 0;
        while (low < high) {
            if (di.charAt(i) == 'I') {
                perm[i] = low;
                low++;
            } else if (di.charAt(i) == 'D') {
                perm[i] = high;
                high--;
            }
            i++;
        }
        if (di.charAt(di.length() - 1) == 'I') {
            perm[i] = low;
        } else
            perm[i] = high;
        return perm;
    }

    public int[] sortedSquares(int[] nums) {

        /**
         *Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
         * @param nums
         * @return Integer Array
         * @TimeComplexity 0(n ^ 2)
         * @SpaceComplexity O(n)
         */

        int[] arr = new int[nums.length];

        int i = 0;
        for (int num : nums
        ) {
            arr[i] = num * num;
            i++;
        }

        return sortArr(arr);
    }

    public int[] sortArr(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public double minAvgOfSmallestLargestNum(int[] arr) {

        /**
         * You have an array of floating point numbers averages which is initially empty. You are given an array nums of n integers where n is even.
         * You repeat the following procedure n / 2 times:
         * Remove the smallest element, minElement, and the largest element maxElement, from nums.
         * Add (minElement + maxElement) / 2 to averages.
         * Return the minimum element in averages.
         * @param arr array of integers
         * @return integer
         * @TimeComplexity O(n logn)
         * @SpaceComplexity O(1)
         * @TimeTaken 6min
         */

        double answer = Double.MAX_VALUE;
        int start = 0, end = arr.length - 1;
        Arrays.sort(arr);
        while (start <= end) {
            answer = answer < ((float) arr[start] + arr[end]) / 2 ? answer : ((float) arr[start] + arr[end]) / 2;
            System.out.println(answer + " " + arr[start] + " " + arr[end]);
            start++;
            end--;
        }
        return answer;
    }

    public int largestPositiveIntWithItsNegative(int[] arr) {

        /**
         * Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.
         * Return the positive integer k. If there is no such integer, return -1.
         * @param arr array of integers
         * @return int
         * @TimeComplexity O(n logn)
         * @SpaceComplexity O(n)
         * @TimeTaken 24min46sec
         */
        if (arr.length == 1) {
            return -1;
        }


        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {

            if (isNegativePresent(arr, arr[i])) {
                return arr[i];
            }
        }

        return -1;
    }

    public boolean isNegativePresent(int[] arr, int target) {
        /**
         * it checks whether the negative of the input target element is present in an array or not
         * @param arr
         * @param target
         * @return boolean
         * @TimeComplexity O(nlogn)
         * @SpaceComplexity O(n)
         * @TimeTaken 5min
         */
        int left = 0, right = arr.length - 1;


        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == (target * -1)) {
                return true;
            }
            if ((target * -1) < arr[mid]) {
                right = mid - 1;
            }
            if ((target * -1) > arr[mid]) {
                left = mid + 1;
            }
        }
        return false;
    }

    public int[][] flipImage(int[][] image) {

        /**
         * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
         * To flip an image horizontally means that each row of the image is reversed.
         * For example, flipping [1,1,0] horizontally results in [0,1,1].
         * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
         * For example, inverting [0,1,1] results in [1,0,0].
         * @param image 2d array of integers having only 0 and 1
         * @return int[][]
         * @TimeComplexity O(n^2)
         * @SpaceComplexity O(n)
         * @TimeTaken 13min59sec
         */
        int imageLen = image.length;
        for (int i = 0; i < imageLen; i++) {
            int start = 0, end = imageLen - 1;
            while (start <= end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }

        }
        return invertImage(image, imageLen);


    }

    public int[][] invertImage(int[][] image, int imageLen) {
        int count = 0;

        for (int j = 0; j < imageLen; j++) {
            for (int i = 0; i < imageLen; i++) {
                image[j][i] = image[j][i] == 1 ? 0 : 1;

            }
        }
        return image;

    }

}
