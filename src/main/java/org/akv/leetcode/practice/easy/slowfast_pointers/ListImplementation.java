package org.akv.leetcode.practice.easy.slowfast_pointers;

public class ListImplementation {


    public LinkListNode getMiddleNodeOfLinkedList(LinkListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
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
