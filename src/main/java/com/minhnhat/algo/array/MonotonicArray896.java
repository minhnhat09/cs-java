package com.minhnhat.algo.array;

import java.util.Arrays;

public class MonotonicArray896 {
  public static void main(String[] args) {
    int[] n1 = {1, 2, 2, 3};
    int[] n2 = {6,5,4,4};
    int[] n3 = {1,3,2};
    int[] n4 = {1,2,4,5};
    int[] n5 = {1,1,1};
    System.out.println(Arrays.toString(n1) + isMonotonic(n1));
    System.out.println(Arrays.toString(n2) + isMonotonic(n2));
    System.out.println(Arrays.toString(n4) + isMonotonic(n4));
    System.out.println(Arrays.toString(n5) + isMonotonic(n5));
    System.out.println(Arrays.toString(n3) + isMonotonic(n3));
  }

  public static boolean isMonotonic(int[] A) {
    if (A.length == 0 || A.length == 1) {
      return true;
    } else {
      Boolean isAccending = null;
      int first = A[0];
      for (int i = 0; i < A.length -1; i++) {
        if ((Boolean.TRUE.equals(isAccending) && A[i] > A[i + 1])
                || (Boolean.FALSE.equals(isAccending) && A[i] < A[i + 1])) {
          return false;
        } else {
          if (A[i+1] > first) {
            isAccending = true;
          } else if (A[i+1] < first) {
            isAccending = false;
          }
        }


      }

    }
    return true;
  }

}
