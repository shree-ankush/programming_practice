package org.akv.slowfast_pointers;

public class GetMidOfList {


    public LinklistNode getMiddleElement(LinklistNode head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        else{
            LinklistNode slow = head;
            LinklistNode fast = head;
            while(fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

    }

}
