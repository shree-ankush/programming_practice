package org.akv.leetcode.practice.easy.two_pointers;


import java.util.*;


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


//            for (int i = 0; i < sArr.length; i++) {
//                System.out.print(s.charAt(i) + " ");
//            }
//            System.out.println();
//            for (int i = 0; i < sArr.length; i++) {
//                System.out.print(answer[i] + " ");
//            }
            currIndex = s.indexOf(c, currIndex + 1);
//            System.out.println();
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


    /**
     * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
     * @param words
     * @return String
     * @TimeComplexity O(n)
     * @SpaceComplexity O(1)
     * @TimeTaken N/A
     */
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (checkPalindrome(words[i])) return words[i];
        }
        return "";
    }

    public boolean checkPalindrome(String word) {
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

    /**
     *  Given a List of integers, count the number of pairs whose sum is less than a given target.
     * @param nums
     * @param target
     * @return int
     * @TimeComplexity O(n)
     * @SpaceComplexity O(1)
     */
    public int countPairsWithLoop(List<Integer> nums, int target) {

        Integer[] arr = nums.toArray(new Integer[0]);
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
    public int arithmeticTriplets(int[] nums, int diff) {



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
    public int[] findPerms(String di) {


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
    /**
     *Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
     * @param nums
     * @return Integer Array
     * @TimeComplexity 0(n ^ 2)
     * @SpaceComplexity O(n)
     */
    public int[] sortedSquares(int[] nums) {

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
    public double minAvgOfSmallestLargestNum(int[] arr) {

        double answer = Double.MAX_VALUE;
        int start = 0, end = arr.length - 1;
        Arrays.sort(arr);
        while (start <= end) {
            answer = answer < ((float) arr[start] + arr[end]) / 2 ? answer : ((float) arr[start] + arr[end]) / 2;
            start++;
            end--;
        }
        return answer;
    }
    /**
     * Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.
     * Return the positive integer k. If there is no such integer, return -1.
     * @param arr array of integers
     * @return int
     * @TimeComplexity O(n logn)
     * @SpaceComplexity O(n)
     * @TimeTaken 24min46sec
     */
    public int largestPositiveIntWithItsNegative(int[] arr) {

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

    /**
     * it checks whether the negative of the input target element is present in an array or not
     * @param arr
     * @param target
     * @return boolean
     * @TimeComplexity O(nlogn)
     * @SpaceComplexity O(n)
     * @TimeTaken 5min
     */
    public boolean isNegativePresent(int[] arr, int target) {

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
    /**
     * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
     * To flip an image horizontally means that each row of the image is reversed.
     * For example, flipping [1,1,0] horizontally results in [0,1,1].
     * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
     * For example, inverting [0,1,1] results in [1,0,0].
     * @param image 2d array of integers having only 0 and 1
     * @return int[][]
     * @TimeComplexity O(n ^ 2)
     * @SpaceComplexity O(n)
     * @TimeTaken 13min59sec
     */
    public int[][] flipImage(int[][] image) {


        int imageLen = image.length-1;
        int count=0;
        int start = 0, end = imageLen ;
       while(count<=imageLen) {

            if (start < end) {
                int temp = image[count][start];
                image[count][start] = image[count][end];
                image[count][end] = temp;
                start++;
                end--;
            }
            else{
                start = 0;
                end = imageLen ;
                count++;
            }

        }

        return invertImage(image, imageLen);


    }

    /**
     * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
     * @param image
     * @param imageLen
     * @return int[][]
     * @TimeComplexity O(n^2)
     * @SpaceComplexity O(1)
     * @TimeTaken 4min
     */
    public int[][] invertImage(int[][] image, int imageLen) {


        int count = 0;
        int start = 0, end = imageLen ;

        while (count <= imageLen ) {
            if (start <= end) {
                if (start != end) {
                    image[count][start] = image[count][start] == 1 ? 0 : 1;
                }
                image[count][end] = image[count][end] == 1 ? 0 : 1;
                start++;
                end--;
            } else {
                start = 0;
                end = imageLen;
                count++;
            }

        }

        return image;

    }
    /**
     * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
     * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
     * Return the resulting string.
     * @param word
     * @param ch
     * @return String
     * @TimeComplexity O()
     * @SpaceComplexity O()
     * @TimeTaken 12min
     */
    public String reversePrefixOfWord(String word, char ch) {

        if (!word.contains(ch + "")) {
            return word;
        }
        char[] wordArr = word.toCharArray();
        int charIndex = word.indexOf(ch);
        String answer = "";
        if (charIndex != -1) {
            char[] strToReverse = word.substring(0, charIndex + 1).toCharArray();
            int start = 0, end = strToReverse.length - 1;
            while (start <= end) {
                char temp = strToReverse[start];
                strToReverse[start] = strToReverse[end];
                strToReverse[end] = temp;
                start++;
                end--;
            }


            for (int i = 0; i < wordArr.length; i++) {
                if (i <= charIndex) {
                    answer += strToReverse[i];
                } else {
                    answer += wordArr[i];
                }


            }
            return answer;


        }

        return word;


    }

    /**
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
     * Given a string s, return true if it is a palindrome, or false otherwise.
     * @param s
     * @return boolean
     * @TimeComplexity O(nlogn)
     * @SpaceComplexity O(n)
     * @TimeTaken 16min 8sec
     */
    public boolean isPalindrome(String s) {


        if (s.trim().isEmpty()){
            return true;
        }

        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for (String word :
                s.split("[^0-9a-z]")) {
            str.append(word);
        }
        int start = 0, end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public String reversePrefix(String word, char ch) {
        if (!word.contains(ch + "")) {
            return word;
        }
        char[] wordArr = word.toCharArray();
        int charIndex = word.indexOf(ch);
        StringBuilder answer =new StringBuilder();

        if (charIndex != -1) {
            char[] strToReverse = word.substring(0,charIndex+1).toCharArray();
            int start = 0, end = charIndex;
            while (start <= end) {
                char temp = strToReverse[start];
                strToReverse[start] = strToReverse[end];
                strToReverse[end] = temp;
                start++;
                end--;
            }

            for (int i = 0; i < wordArr.length; i++) {

                answer.append(strToReverse[i]);
            }
            answer.append(word.substring(charIndex+1,word.length()));
            return answer.toString();


        }

        return word;
    }

    public String reverseWords(String s){
        char[] wordArr = s.toCharArray();
        for(String word : s.split(" ")){
            int start =0,end=word.length()-1;
            System.out.println(start+" "+end);
            while( start<end){
                char temp=wordArr[start];
                wordArr[start]=wordArr[end];
                wordArr[end]=temp;

                start++;
                end--;
            }


        }
        for (char c : wordArr) {
            System.out.print(c);
        }
        return "word";
    }
    /**
     * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
     * @param s
     * @return boolean
     * @TimeComplexity O()
     * @SpaceComplexity O()
     * @TimeTaken 40min INCOMPLETE
     */
    public boolean validPalindromeAfterRemovingAtMostOneChar(String s) {

        int start = 0;
        int end = s.length() - 1;
        boolean isCharDeleted = false;
        System.out.println(s);
        if (s.length() == 3 && (s.charAt(0) != s.charAt(2))) {
            return false;
        }//eedede
        while (start <= end) {
            System.out.println("char start " + start + " " + s.charAt(start) + " char end " + end + " " + s.charAt(end));
            System.out.println("val of ischardel:" + isCharDeleted);
            if (s.charAt(start) != s.charAt(end)) {
                if (isCharDeleted) {
                    return false;
                } else {

                    isCharDeleted = true;
                    start++;
                    end--;
                    System.out.println("char start " + start + " " + s.charAt(start) + " char end " + end + " " + s.charAt(end));

                }
            } else {
                start++;
                end--;
            }
        }

        return true;
    }
    /**
     *Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
     * The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
     * @param arr1
     * @param arr2
     * @param d
     * @return int[] array of integers
     * @TimeComplexity O(N ^ 2)
     * @SpaceComplexity O(1)
     * @TimeTaken 13min57sec
     */
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int distance = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    distance++;
                    break;

                }

            }
        }
        return arr1.length - distance;
    }


    /**
     * Given two integer arrays nums1 and nums2, return an array of their
     * intersection
     * . Each element in the result must be unique, and you may return the result in any order.
     * @param nums1
     * @param nums2
     * @return int[]
     * @TimeComplexity O(N^2)
     * @SpaceComplexity O(n)
     */
    public int[] arrayIntersection(int[] nums1,int[] nums2){


        HashSet<Integer> intersectedSet = new HashSet<>();

        int nums1Len = nums1.length;
        int nums2Len = nums2.length;


        if(nums1Len<=nums2Len){
            for (int i =0;i<nums1Len;i++){
                if(isTargetPresent(nums1[i],nums2)){
                    intersectedSet.add(nums1[i]);
                }
            }
        }else {
            for (int i =0;i<nums2Len;i++){
                if(isTargetPresent(nums2[i],nums1)){
                    intersectedSet.add(nums2[i]);
                }
            }
        }



        int[] arr = new int[intersectedSet.size()];
        int count=0;
        for (Integer x :
                intersectedSet) {
            arr[count]=x;
            count++;
        }


        return arr;
    }

    public boolean isTargetPresent(int target, int[] inputArr) {
        if (inputArr.length == 0) {
            return false;
        }

        Arrays.sort(inputArr);
        int left = 0, right = inputArr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (inputArr[mid] == target) {
                return true;
            } else if (target > inputArr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return false;
    }

    public int[] arrangeNumbersAccordingToIdx(int[] nums){
        //NOT SOLVED
        int start = 0, end = nums.length - 1, temp = -1;
        while (start < end) {
          if(start%2==nums[start]%2){
              start++;
              if(end%2==nums[end]%2){
                  end--;
              }
          }
          else{
              if(end%2==nums[end]%2){
                  end--;
              }
              else{
                  nums[end]=nums[start]+nums[end];
                  nums[start]=nums[end]-nums[start];
                  nums[end]=nums[end]-nums[start];
                  start++;
                  end--;
              }
          }

        }
        for (int x :
                nums) {
            System.out.print(x+" ");
        }
        System.out.println();
        return nums;
    }



}
