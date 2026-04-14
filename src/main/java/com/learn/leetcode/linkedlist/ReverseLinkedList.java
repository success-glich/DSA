package com.learn.leetcode.linkedlist;

public class ReverseLinkedList {
    public  ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode prev = null;
        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
            return  current;
    }

    public ListNode reverseListV1(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode a = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return a;
    }
//    1 2 3 4 5 ->

    public  void printNodes(ListNode head){
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList obj = new ReverseLinkedList();

        ListNode head = new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        System.out.println(    obj.reverseList(head));

        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }

}
