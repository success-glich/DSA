package com.learn.leetcode.linkedlist;


//Floyd’s Tortoise and Hare Algorithm
//In this algorithm, we use two pointers, one slow pointer (the tortoise) and one fast pointer (the hare).
// The slow pointer moves one step at a time, while the fast pointer moves two steps at a time.
// If there is a cycle in the linked list, the fast pointer will eventually meet the slow pointer.
// If there is no cycle, the fast pointer will reach the end of the list (null) before the slow pointer. Here’s how you can implement this in Java:

public class LinkedLIstCycle {

    public boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle
        System.out.println("Test Case 1 (Cycle): " + new LinkedLIstCycle().hasCycle(head)); // Should return true

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.println("Test Case 2: " + new LinkedLIstCycle().hasCycle(head2)); // Should return false
        System.out.println("Test Case 2 (No cycle): " + new LinkedLIstCycle().hasCycle(head2));
    }
}


