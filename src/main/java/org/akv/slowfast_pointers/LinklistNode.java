package org.akv.slowfast_pointers;



public class LinklistNode {

    int data;

    public LinklistNode next;


    public LinklistNode(int val){
        data = val;
     }
    public int getData() {
        return data;
    }

    public void display(LinklistNode head){

        LinklistNode curr = head;
        while(curr!=null){
            System.out.println("this is curr : "+curr.getData());
            curr=curr.next;
        }
    }
}
