package com.minhnhat.algo.dynamicprogramming;

import java.util.Arrays;

public class BestTimetoBuyandSellStock121 {
  static int count = 0;

  public static int max(int i, int i1) {
    System.out.println("Comparing " + i + " " + i1);
    if (i > i1) {
      return i;
    }
    return i1;
  }

  public static int[] subArray(int[] array, int beg, int end) {
    return Arrays.copyOfRange(array, beg, end + 1);
  }

  public static void main(String[] args) {
    int[] ints = new int[] {7, 1, 5, 3, 6};
    int[] ints1 = new int[] {8, 5, 1};
    int[] ints2 = new int[] {1, 8, 5};
    int[] ints3 = new int[] {5, 8, 1};
    int[] ints4 = new int[] {};
    System.out.println(maxProfit(ints));
    /*System.out.println(maxProfit(ints));
    System.out.println(maxProfit(ints1));
    System.out.println(maxProfit(ints2));
    System.out.println(maxProfit(ints3));*/
    // System.out.println(maxProfit(ints4));
  }

  public static int maxProfit(int[] prices) {
    return buyOrSell(true, prices);
  }

  public static int buyOrSell(boolean canBuy, int[] prices) {
    count++;
    if (prices.length > 0) {
      int[] subPrices = subArray(prices, 1, prices.length - 1);
      System.out.println("First value " + prices[0] + " rest " + Arrays.toString(subPrices));
      if (canBuy) {
        // System.out.println("can buy");
        int buy = -1 * prices[0] + buyOrSell(!canBuy, subPrices);
        int dontBuy = 0 + buyOrSell(canBuy, subPrices);
        return max(buy, dontBuy);
      } else {
        // System.out.println("can sell");
        int sell = prices[0] + buyOrSell(!canBuy, subPrices);
        int dontSell = 0 + buyOrSell(canBuy, subPrices);
        return max(sell, dontSell);
      }
    }
    return 0;
  }
}
