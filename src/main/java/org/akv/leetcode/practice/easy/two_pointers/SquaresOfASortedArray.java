package org.akv.leetcode.practice.easy.two_pointers;

/** PROBLEM : 977 , TIME TAKEN : NA
 Input: nums = [-4,-1,0,3,10]
 Output: [0,1,9,16,100]
 Explanation: After squaring, the array becomes [16,1,0,9,100].
 After sorting, it becomes [0,1,9,16,100]. */
public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int numsLen = nums.length;
        int [] arr = new int[numsLen];
        int start = 0, end = numsLen-1,i=0;

        while(start<end){
            if(nums[start]<nums[end]){
                arr[i]=nums[start]*nums[start];
            }
            else{
                arr[i]=nums[end]*nums[end];
            }
            start++;
            end--;
            i++;
        }
        return arr;
    }

}
