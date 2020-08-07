package com.minhnhat.java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethodReference {
  public static void main(String[] args) {
    Supplier<List<String>> s =
        new Supplier<List<String>>() {
          @Override
          public List<String> get() {
            return new ArrayList<>();
          }
        };
    List<String> l = s.get();
    Supplier<List<String>> s2 = () -> new ArrayList<>();
    List<String> l2 = s2.get();
    Supplier<List<String>> s3 = ArrayList::new;
    List<String> l3 = s3.get();

    Function<String, Integer> f =
        new Function<String, Integer>() {
          @Override
          public Integer apply(String s) {
            return new Integer(s);
          }
        };

    Integer i = f.apply("100");

    Function<String, Integer> f2 = s4 -> new Integer(s4);
    Function<String, Integer> f3 = Integer::new;
  }
}
