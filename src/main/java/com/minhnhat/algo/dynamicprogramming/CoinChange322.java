package com.minhnhat.algo.dynamicprogramming;

public class CoinChange322 {
  public static int coinChange(int[] coins, int amount) {
    int[] MIN = new int[amount + 1];
    for (int i = 0; i < MIN.length; i++) {
      MIN[i] = Integer.MAX_VALUE;
    }
    MIN[0] = 0;
    for (int i = 1; i <= amount; i++) {
      for (int j = 0; j < coins.length; j++) {
        if (coins[j] <= i && MIN[i - coins[j]] + 1 < MIN[i]) {
          MIN[i] = MIN[i - coins[j]] + 1;
        }
      }
    }
    if (MIN[amount] < 0 || MIN[amount] == Integer.MAX_VALUE) {
      return -1;
    }
    return MIN[amount];
  }

  public static void main(String[] args) {
    System.out.println(coinChange(new int[] {186, 419, 83, 408}, 6249));
  }
}
