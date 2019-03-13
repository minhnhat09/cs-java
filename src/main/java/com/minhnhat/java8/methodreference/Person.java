package com.minhnhat.java8.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
    people.add(new Person("zzzz", 25));
    people.add(new Person("cccc", 20));
    people.add(new Person("cccc", 27));
    System.out.println(Arrays.toString(people.toArray()));
    people.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
    System.out.println(Arrays.toString(people.toArray()));

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
