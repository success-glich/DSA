package com.learn.leetcode.linkedlist;

public class DeleteMiddleNode {

    public ListNode deleteMiddle(ListNode head) {

        if(head==null  || head.next==null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode curr = null;

        while(fast!=null  && fast.next!=null){
             curr = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        curr.next = slow.next;
        return head;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        DeleteMiddleNode solution = new DeleteMiddleNode();
        ListNode result = solution.deleteMiddle(head);

        // Print the modified linked list
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
