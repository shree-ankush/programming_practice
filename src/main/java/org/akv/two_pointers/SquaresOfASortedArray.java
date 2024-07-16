package org.akv.two_pointers;

import java.util.Arrays;

/** PROBLEM : 977 , TIME TAKEN : NA
 Input: nums = [-4,-1,0,3,10]
 Output: [0,1,9,16,100]
 Explanation: After squaring, the array becomes [16,1,0,9,100].
 After sorting, it becomes [0,1,9,16,100]. */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {

        int [] arr = new int[nums.length];

        int i=0;
        for (int num:nums
             ) {
            arr[i]=num*num;
            i++;
        }
//        Arrays.sort(arr);

        return sortArr(arr);
    }
    public int[] sortArr(int[] arr){
        int temp;
        for(int i =0;i<arr.length;i++){

            for (int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
