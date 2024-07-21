package org.akv.practice.leetcode.easy.slowfast_pointers;

public class GetMidOfList {

    /**
     * Time Taken : 30min
     * Time Complexity : O(n/2)
     * Space Complexity : n
     */

    public LinkListNode getMiddleNodeInLinkedList(LinkListNode head){
        if(head==null||head.next==null){
            return head;
        }

        else{
            LinkListNode slow = head;
            LinkListNode fast = head;
            while(fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

    }

}
