package com.learn.dsa;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class SingleLInkedList {

    public Node head;
     public SingleLInkedList(){
         this.head = null;
     }
     public void addNode(int data){
         Node newNode = new Node(data);
         if(head == null){
             head = newNode;
         }else{
             Node current = head;
             while (current.next!=null){
                 current = current.next;
             }
             current.next = newNode;
         }
     }
}
