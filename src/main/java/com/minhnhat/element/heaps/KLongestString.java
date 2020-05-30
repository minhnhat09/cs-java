package com.minhnhat.element.heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class KLongestString {
  public static List<String> topK(int k, Iterator<String> iter) {
    PriorityQueue<String> minHeap =
        new PriorityQueue<>(
            k,
            new Comparator<String>() {
              public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
              }
            });
    while (iter.hasNext()) {
      minHeap.add(iter.next());
      if (minHeap.size() > k) {
        minHeap.poll();
      }
    }
    return new ArrayList<>(minHeap);
  }
}
