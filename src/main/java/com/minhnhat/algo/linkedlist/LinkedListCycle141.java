package com.minhnhat.algo.linkedlist;

public class LinkedListCycle141 {
  public static boolean hasCycle(ListNode head) {
    if (head != null) {
      ListNode slow = head;
      ListNode fast = head;
      while (slow.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        System.out.println("slow: " + slow.val);
        System.out.println("fast: " + fast.val);
        if (slow == fast) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ListNode n = new ListNode(1);
    n.next = new ListNode(2);
    n.next.next = new ListNode(3);
    n.next.next.next = new ListNode(4);
    n.next.next.next.next = n;
    hasCycle(n);
  }
}
