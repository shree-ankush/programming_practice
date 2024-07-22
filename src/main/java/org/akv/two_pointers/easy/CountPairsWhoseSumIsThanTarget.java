package org.akv.two_pointers.easy;

import java.util.Arrays;
import java.util.List;

// Given an array of integers, count the number of pairs
// whose sum is less than a given target.
// Input: [2, 5, 7, 9, 10, 12, 15], target = 20
// Output: 5
public class CountPairsWhoseSumIsThanTarget {
    public int countPairs(int [] arr,int target){
        int arrLen = arr.length;
        int pairCount=0,start=0,end=arrLen-1;
        int startNext = start+1;
        int i=0;
        Arrays.sort(arr);
        while(i<arrLen) {

            if(arr[start] + arr[end] <target){
                System.out.println(arr[start]+" "+arr[end]);
                pairCount++;
                start++;
                end--;
            }
            else{
                end--;
            }


            i++;
        }

        return pairCount;
    }

    // Input: nums = [-1,1,2,3,1], target = 2
//     Output: 3
    public int countPairsWithLoop(int [] arr, int target){

        int countPairs=0;
        for (int i =0;i<arr.length ;i++ ) {
            for (int j = i+1 ;j<arr.length ;j++ ) {
                if(arr[i]+arr[j] < target){
                    countPairs++;
                }
//                else System.out.println("in else");

            }
            
        }
        return countPairs;
    }
}
