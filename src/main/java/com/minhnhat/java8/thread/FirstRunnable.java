package com.minhnhat.java8.thread;

public class FirstRunnable {
  public static void main(String[] args) {
    Runnable runnable = ()->{
      System.out.println("i am running in " + Thread.currentThread().getName());
    };
    Thread thread = new Thread(runnable);
    thread.setName("my thread");
    thread.start();
  }
}
