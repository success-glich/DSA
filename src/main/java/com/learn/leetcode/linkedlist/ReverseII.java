package com.learn.leetcode.linkedlist;

public class ReverseII {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;

        int i = 1;
        while (curr != null && i != left) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        ListNode pointerToStart = prev;
        ListNode start = curr;
        prev = null;

        while (curr != null && i != right + 1) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        start.next = curr;
        if(pointerToStart!=null){
            pointerToStart.next = prev;

        }else{
            return prev; // if left is index 0 then it will become new head
        }
        return head;
    }
}
