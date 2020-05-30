package com.minhnhat.java8;

public enum Volume {
  HIGH(100),
  MEDIUM(50),
  LOW(20);
  private int value;

  Volume(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
