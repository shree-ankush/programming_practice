package org.akv.two_pointers.easy;
//TIME TAKEN : 11min
public class FindNumberOfTripletWithSameDifference {
/*
* Input: nums = [0,1,4,6,7,10], diff = 3
Output: 2
Explanation:
(1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
(2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.
 */

    public int arithmeticTriplets(int[] nums, int diff) {

        int count=0;
        if(nums.length<3){
            return 0;
        }
        for (int i =0;i<nums.length;i++){
            for (int j =i+1;j<nums.length;j++){
                if(nums[j]-nums[i]==diff){
                    for (int k =j+1;k<nums.length;k++){
                        if(nums[k]-nums[j]==diff){
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
