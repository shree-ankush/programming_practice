package org.akv.practice.easy;

import java.util.Arrays;

public class ProblemsRelatedBinarySearch {

    public int binarySearch(int [] inputArr,int target){

        if(inputArr.length==0){
            return -1;
        }
        if(inputArr.length==1){
            if(target==inputArr[0])
                return 0;
        }
        Arrays.sort(inputArr);
        int left=0,right=inputArr.length-1;
        int mid ;

        while (left<=right){
            mid = (left+right)/2;
            if(inputArr[mid]==target){
                return  mid;
            }
            else if (target>inputArr[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return -1;
    }

    public boolean binarySearch(int target,int [] inputArr){

        if(inputArr.length==0){
            return false;
        }
        if(inputArr.length==1){
            if(target==inputArr[0])
                return true;
            return false;
        }
        Arrays.sort(inputArr);
        int left=0,right=inputArr.length-1;
        int mid ;
        mid = (left+right)/2;
        while (left<=right){

            if(inputArr[mid]==target){
                return  true;
            }
            else if (target>inputArr[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            mid = (left+right)/2;

        }
        return false;
    }


    public boolean checkIfNumAndDoubleExists(int [] arr){

        /*
            given an array arr of integers, check if there exist two indices i and j such that
            Input: arr = [10,2,5,3], o/p = true
            10 = 5*2
        * */
        int x=0;

        if(arr.length<=1){
            return false;
        }

        for (int i = 0; i < arr.length; i++) {

            if( binarySearch(arr[i]*2,arr )){
                System.out.println("found:"+arr[i]+" "+(arr[i]*2));
                if(x!=i) {
                    x = 0;
                    return true;
                }
            }
            x++;

        }


        return false;
    }
}
