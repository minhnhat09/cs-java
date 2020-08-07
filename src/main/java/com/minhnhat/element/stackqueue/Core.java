package com.minhnhat.element.stackqueue;
import java.util.Deque;
import java.util.LinkedList;

import com.minhnhat.algo.linkedlist.ListNode;

public class Core {
  public static void printLinkedListInReverse(ListNode head) {
    Deque<Integer> nodes = new LinkedList<>();
    while (head != null) {
      nodes.addFirst(head.val);
      head = head.next;
    }
    while (!nodes.isEmpty()) {
      System.out.println(nodes.poll());
    }
  }
}
