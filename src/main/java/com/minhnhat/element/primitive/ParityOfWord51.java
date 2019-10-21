package com.minhnhat.element.primitive;

public class ParityOfWord51 {
  public static void main(String[] args) {

  }

  public static short parity(long x) {
    short result = 0;
    while (x != 0) {
      result ^= (x & 1);
      x >>>= 1;
    }
    return result;
  }
}
