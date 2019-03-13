package com.minhnhat.algo.linkedlist;

public class DeleteNodeinaLinkedList237 {
  public ListNode head;
  public void deleteNode(ListNode node) {
    System.out.println(this.head.val);
    if (this.head == null || this.head.next == null) {
      return;
    } else if (this.head.next.next == null) {
      this.head = this.head.next;
    } else {
      while (this.head != null && this.head.next != null && this.head.next.next != null) {
        if (this.head.next.val == node.val) {
          this.head.next = this.head.next.next;
        }
      }
    }
  }

  public DeleteNodeinaLinkedList237(ListNode head) {
    this.head = head;
  }

  public static void main(String[] args) {

  }




}
