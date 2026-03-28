package com.learn.leetcode.linkedlist;

public class RemoveDuplicateFromSortedList {

    public  ListNode deleteDuplicates(ListNode head) {


        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {

                current.next = current.next.next;
            } else {

                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        RemoveDuplicateFromSortedList obj = new RemoveDuplicateFromSortedList();

        ListNode head = new ListNode(1);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        System.out.println(    obj.deleteDuplicates(head));

        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }


    }
}
