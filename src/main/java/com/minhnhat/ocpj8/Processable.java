package com.minhnhat.ocpj8;

public interface Processable {
  void processInParallel();

  default void processInSequence() {
    System.out.println("default method");
  }
}
