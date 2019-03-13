package com.minhnhat.algo.linkedlist;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

public class AddTwoNumbers2 {
  public static BigInteger listNodeToNumberReverse(ListNode l) {
    String s = "";
    while (l != null) {
      s += String.valueOf(l.val);
      l = l.next;
    }
    s = new StringBuilder(s).reverse().toString();
    return new BigInteger(s);
  }

  /**
   * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
   * Output: 7 -> 0 -> 8
   * Explanation: 342 + 465 = 807.
   *
   * @param n
   * @return
   */
  public static ListNode numberToListNodeReverse(BigInteger n) {
    String s = new StringBuilder(String.valueOf(n)).reverse().toString();
    List<Character> listChars = s.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
    ListNode l = new ListNode(Character.getNumericValue(listChars.get(0)));
    for (int i = 1; i < listChars.size(); i++) {
      ListNode cursor = l;
      while (cursor.next != null) {
        cursor = cursor.next;
      }
      cursor.next = new ListNode(Character.getNumericValue(listChars.get(i)));
    }
    return l;
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    BigInteger bi1 = listNodeToNumberReverse(l1);
    BigInteger bi = listNodeToNumberReverse(l1).add(listNodeToNumberReverse(l2));
    System.out.println(bi1);
    return numberToListNodeReverse(listNodeToNumberReverse(l1).add(listNodeToNumberReverse(l2)));
  }


  public static void main(String[] args) {

    ListNode l = new ListNode(2);
    l.next = new ListNode(4);
    l.next.next = new ListNode(3);
    System.out.println(listNodeToNumberReverse(l));
  }
}
