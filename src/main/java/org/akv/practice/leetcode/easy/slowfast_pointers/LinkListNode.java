package org.akv.practice.leetcode.easy.slowfast_pointers;



public class LinkListNode {

    int data;

    public LinkListNode next;


    public LinkListNode(int val){
        data = val;
     }
    public int getData() {
        return data;
    }

    public void display(LinkListNode head){

        LinkListNode curr = head;
        while(curr!=null){
            System.out.println("this is curr : "+curr.getData());
            curr=curr.next;
        }
    }
}
