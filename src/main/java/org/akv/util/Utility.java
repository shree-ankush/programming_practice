package org.akv.util;

/**
 * This Class contains several Utility Functions required in other programs
 */

public class Utility {
    public int[] bubbleSort(int [] arr){
        //12,1,14,11,45,9,0
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j = i+1   ; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public void printArray(int [] arr){
        System.out.println("Array is :");
        for (int num: arr){
            System.out.print(num+ " ");
        }
    }
}
