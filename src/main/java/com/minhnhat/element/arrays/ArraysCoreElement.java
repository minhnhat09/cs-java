package com.minhnhat.element.arrays;

public class ArraysCoreElement {
  public static void evenOdd(int[] A) {
    int nextEven = 0, nextOdd = A.length - 1;
    while (nextEven < nextOdd) {
      if (A[nextEven] % 2 == 0) {
        nextEven++;
      } else {
        int temp = A[nextEven];
        A[nextEven] = A[nextOdd];
        A[nextOdd--] = temp;
      }
    }
  }
}
