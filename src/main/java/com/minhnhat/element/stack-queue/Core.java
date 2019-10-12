import java.util.Deque;
import java.util.LinkedList;

import com.minhnhat.algo.linkedlist.ListNode;

public class Core {
  public static void printLinkedListInReverse(ListNode<Integer> head) {
    Deque<Integer> nodes = new LinkedList<>();
    while (head != null) {
      nodes.addFirst(head.data);
      head = head.next;
    }
    while(!nodes.isEmpty()){
      System.out.println(nodes.poll());
    }
  }
}