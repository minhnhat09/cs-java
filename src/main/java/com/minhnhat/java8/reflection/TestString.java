package com.minhnhat.java8.reflection;

import java.lang.reflect.Field;

public class TestString {
  public static void main(String[] args) {
    Class<?> stringClass = String.class;
    for (Field f : stringClass.getDeclaredFields()) {
      System.out.println(f.getName());
    }
  }
}
