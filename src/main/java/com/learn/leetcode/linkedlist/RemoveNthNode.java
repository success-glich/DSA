package com.learn.leetcode.linkedlist;

public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head;
        ListNode fast = head;

//        return slow;
        for(int i=0;i<n;i++) {
            fast = fast.next;
        }
        if( fast == null){
            if (head != null) {
                return head.next;
            }
        }
        while(fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
       if(slow != null && slow.next != null){
           slow.next = slow.next.next;

       }
        return head;
    }

    public void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        RemoveNthNode obj = new RemoveNthNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        System.out.println("Original List:");
        obj.printList(head);
        System.out.println("After removing the 2nd node from the end:");
        obj.printList(obj.removeNthFromEnd(head, 1));
    }
}
// Input: head = [1,2,3,4,5], n = 2

// fast pointer = 1, slow pointer = 1
// fist iteration: fast pointer = 3 , slow pointer = 2
// second iteration: fast pointer = 5 , slow pointer = 3
// while(fast pointer != null) {}
// slow pointer.next = slow pointer.next.next;
// slow

// remove 2nd node from end
// 1->2->3->4->5->null
// 1->2->3->5->null