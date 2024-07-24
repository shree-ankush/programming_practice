package org.akv;

import org.akv.slowfast_pointers.GetMidOfList;
import org.akv.slowfast_pointers.LinklistNode;
import org.akv.two_pointers.CountPairsWhoseSumIsThanTarget;
import org.akv.two_pointers.SquaresOfASortedArray;

public class Main {
    public static void main(String[] args) {

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