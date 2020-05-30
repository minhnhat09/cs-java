package com.minhnhat.algo.string;

import java.util.function.Function;
import java.util.stream.Collectors;

public class LongPressedName925 {
  public static boolean isLongPressedName(String name, String typed) {
    name.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .forEach((k, v) -> System.out.println(k + " : " + v));
    return true;
  }

  public static void main(String[] args) {
    isLongPressedName("minh", "");
  }
}
