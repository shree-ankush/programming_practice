package org.akv;

import org.akv.two_pointers.CountPairsWhoseSumIsThanTarget;
import org.akv.two_pointers.FindFirstPallindromicStringInArray;
import org.akv.two_pointers.SquaresOfASortedArray;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int [] numsArr = {-1,1,2,3,1};

        int target=2;
        CountPairsWhoseSumIsThanTarget objCountPairs = new CountPairsWhoseSumIsThanTarget();
        System.out.println("No of Pairs : "+objCountPairs.countPairs(numsArr,target));
        System.out.println("No of Pairs : "+objCountPairs.countPairsWithLoop(numsArr,target));

        String [] words = {"abc","car","ada","racecar","cool"};
        String [] words1 = {"notapalindrome","dwcblqnxtrwtqmtqenidhxnifdbmdvobwmcvwjxgbyjzgvrqzlskjbfirauguhyyjhlotuckssrkqzppzbqd","racecar"};

        FindFirstPallindromicStringInArray objP = new FindFirstPallindromicStringInArray();
        System.out.println("First pallindrome : "+objP.firstPalindrome(words1));

        SquaresOfASortedArray obj = new SquaresOfASortedArray();
        int [] nums = {-4,-3,1,5,10};
        System.out.println("Squares array is : ");
        int [] res = obj.sortedSquares(nums);
        for (int x :res
             ) {
            System.out.print(x+" " );
        }

    }
}