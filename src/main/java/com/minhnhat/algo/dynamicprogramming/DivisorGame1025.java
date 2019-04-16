package com.minhnhat.algo.dynamicprogramming;

import java.util.HashMap;

public class DivisorGame1025 {

  public static boolean divisorGame(int N) {
    HashMap<Integer, Boolean> map = new HashMap<>();
    play(N, true, map);
    return true;
  }

  public static void play(int N, boolean aliceTurn, HashMap<Integer, Boolean> map) {
    if (N == 1) {
      map.put(1, false);
    }
    if (N == 2 && aliceTurn) {
      map.put(2, true);
    } else if (N == 2 && !aliceTurn) {
      map.put(2, false);
    }
    if (N == 3 && aliceTurn) {
      map.put(3, false);
    } else if (N == 3 && !aliceTurn) {
      map.put(3, true);
    }
    aliceTurn = !aliceTurn;
    for (int i = 1; i < N; i++) {
      if (N % i == 0) {
        play(N - i, aliceTurn, map);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(divisorGame(5));
  }
}
