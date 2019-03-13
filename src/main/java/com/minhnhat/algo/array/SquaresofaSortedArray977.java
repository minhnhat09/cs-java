package com.minhnhat.algo.array;

import java.util.Arrays;

public class SquaresofaSortedArray977 {
  public static int[] sortedSquares(int[] A) {
    return Arrays.stream(A).map(a -> a * a)
            .sorted()
            .toArray();
  }


  public static void main(String[] args) {
    int[] array = {-7, -3, 2, 3, 11};

    System.out.println(SquaresofaSortedArray977.sortedSquares(array));
    System.out.println(array);
  }
}
