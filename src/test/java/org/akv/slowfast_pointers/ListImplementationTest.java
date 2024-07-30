package org.akv.slowfast_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListImplementationTest {


    ListImplementation g1 = new ListImplementation();

    @Test
    void getMiddleElement() {


        LinkListNode head = new LinkListNode(19);
        LinkListNode curr = head;
        head.next = new LinkListNode(20);
        head = head.next;
        head.next = new LinkListNode(21);
        head = head.next;
        head.next = new LinkListNode(22);
        head = head.next;
        head.next = new LinkListNode(23);
        head = head.next;
        head.next = new LinkListNode(24);
        head = head.next;

        assertEquals(21, g1.getMiddleNodeOfLinkedList(curr).getData());
        assertEquals(21, g1.getMiddleNodeOfLinkedList(head).getData());
    }
}