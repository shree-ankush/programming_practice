package org.akv.practice.leetcode.easy.slowfast_pointers;

public class GetMidOfList {


    public LinkListNode getMiddleNodeInLinkedList(LinkListNode head) {
        /**
         * Returns the middle node of the linked list
         * @param head head of Link list
         * @return LinkListNode
         * @TimeComplexity O(n / 2)
         * @SpaceComplexity O(n)
         * @TimeTaken 30min
         */
        if (head == null || head.next == null) {
            return head;
        } else {
            LinkListNode slow = head;
            LinkListNode fast = head;
            while (fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

    }

}
