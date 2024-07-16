package org.akv;

import org.akv.slowfast_pointers.GetMidOfList;
import org.akv.slowfast_pointers.LinklistNode;
import org.akv.two_pointers.CountPairsWhoseSumIsThanTarget;
import org.akv.two_pointers.SquaresOfASortedArray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int [] numsArr = {-1,1,2,3,1};

        int target=-2;
        CountPairsWhoseSumIsThanTarget objCountPairs = new CountPairsWhoseSumIsThanTarget();
        System.out.println("No of Pairs : "+objCountPairs.countPairs(numsArr,target));
        System.out.println("No of Pairs : "+objCountPairs.countPairsWithLoop(numsArr,target));

        String [] words = {"abc","car","ada","racecar","cool"};
        String [] words1 = {"notapalindrome","dwcblqnxtrwtqmtqenidhxnifdbmdvobwmcvwjxgbyjzgvrqzlskjbfirauguhyyjhlotuckssrkqzppzbqd","racecar"};

//        FindFirstPallindromicStringInArray obj = new FindFirstPallindromicStringInArray();
//        System.out.println("First pallindrome : "+obj.firstPalindrome(words1));

        SquaresOfASortedArray obj = new SquaresOfASortedArray();
        int [] nums = {-4,-3,1,5,10};
        System.out.println("Squares array is : ");
        int [] res = obj.sortedSquares(nums);
        for (int x :res
             ) {
            System.out.println(x);
        }
        LinklistNode head = new LinklistNode(19);
        LinklistNode curr = head;
        head.next  = new LinklistNode(20);
        head=head.next;
        head.next  = new LinklistNode(21);
        head=head.next;
        head.next  = new LinklistNode(22);
        head=head.next;
        head.next  = new LinklistNode(23);
        head=head.next;
        head.next  = new LinklistNode(24);
        head=head.next;
        head.display(curr);
        GetMidOfList getMidOfList = new GetMidOfList();
        System.out.println(curr);
        System.out.println("this is middle of list :"+getMidOfList.getMiddleElement(curr).getData());

    }
}