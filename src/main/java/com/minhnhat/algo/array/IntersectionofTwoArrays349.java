package com.minhnhat.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IntersectionofTwoArrays349 {
  public static void main(String[] args) {
    int[] ar1 = {4, 9, 5};
    int[] ar2 = {9, 4, 9, 8, 4};
    int[] ar3 = {1, 2, 2, 1};
    int[] ar4 = {2, 2};
    int[] ar5 = {3, 1, 2};
    int[] ar6 = {1, 1};

    System.out.println(Arrays.toString(intersect(ar1, ar2)));
    System.out.println(Arrays.toString(intersect(ar3, ar4)));
    System.out.println(Arrays.toString(intersect(ar5, ar6)));
  }

  public static List<Integer> arrayToList(int[] nums) {
    List<Integer> l = new ArrayList<>();
    for (int i : nums) {
      l.add(new Integer(i));
    }
    return l;
  }

  public static int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> n1 = arrayToList(nums1);
    List<Integer> n2 = arrayToList(nums2);
    List<Integer> result = new ArrayList<>();
    for (Integer i : n1) {
      Iterator<Integer> integerIterator = n2.iterator();
      while (integerIterator.hasNext()) {
        Integer i1 = integerIterator.next();
        if (i.intValue() == i1.intValue()) {
          result.add(i);
          integerIterator.remove();
          break;
        }
      }
    }
    return result.stream().mapToInt(Integer::new).toArray();
  }
}
