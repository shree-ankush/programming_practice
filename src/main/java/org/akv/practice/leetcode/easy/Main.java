package org.akv.practice.leetcode.easy;

import org.akv.practice.leetcode.easy.slowfast_pointers.GetMidOfList;
import org.akv.practice.leetcode.easy.slowfast_pointers.LinkListNode;
import org.akv.practice.leetcode.easy.two_pointers.CountPairsWhoseSumIsThanTarget;
import org.akv.practice.leetcode.easy.two_pointers.SquaresOfASortedArray;

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
        LinkListNode head = new LinkListNode(19);
        LinkListNode curr = head;
        head.next  = new LinkListNode(20);
        head=head.next;
        head.next  = new LinkListNode(21);
        head=head.next;
        head.next  = new LinkListNode(22);
        head=head.next;
        head.next  = new LinkListNode(23);
        head=head.next;
        head.next  = new LinkListNode(24);
        head=head.next;
        head.display(curr);
        GetMidOfList getMidOfList = new GetMidOfList();
        System.out.println(curr);
        System.out.println("this is middle of list :"+getMidOfList.getMiddleElement(curr).getData());

    }
}