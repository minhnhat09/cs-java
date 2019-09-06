package com.minhnhat.java8;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
  private static final int DEFAULT_INITIAL_CAPACITY = 16;
  private Object[] elements;
  private int size = 0;

  public Stack() {
    elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    try {
      String a = "ajgjkgjgkjghhjghjghjgh";
      String b = "ajgjkgjgkjghhjghjghjgh";
      if (a == b) {
        System.out.println("ok");
      }
      s.pop();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("catch");
    } finally {
      System.out.println("final");
    }
    System.out.println("end");
  }

  public void push(Object e) {
    ensureCapacity();
    elements[size++] = e;
  }

  public Object pop() throws ArrayIndexOutOfBoundsException {
    if (size == 0)
      throw new EmptyStackException();
    return elements[--size];
  }

  private void ensureCapacity() {
    if (elements.length == size)
      elements = Arrays.copyOf(elements, 2 * size + 1);
  }
}
