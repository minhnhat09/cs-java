package com.minhnhat.java8;

import com.minhnhat.java8.methodreference.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaCollection {
  public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
    people.add(new Person("step", 20));
    people.add(new Person("giang", 25));
    people.add(new Person("minh", 25));
    people.add(new Person("minh", 28));
    people.add(new Person("cuong", 30));
    people.add(new Person("tuan", 30));

    // Get oldest person
    Optional<Person> oldest =
        people.stream().collect(Collectors.maxBy(Comparator.comparing(Person::getAge)));
    System.out.println("oldest person " + oldest.get());
    Double avg = people.stream().collect(Collectors.averagingDouble(Person::getAge));
    System.out.println("Average age " + avg);
    List<String> listNames = people.stream().map(p -> p.getName()).collect(Collectors.toList());
    System.out.println(listNames);
    System.out.println("List string to string");
    System.out.println(listNames.stream().collect(Collectors.joining(", ")));
    Set<String> names = people.stream().map(p -> p.getName()).collect(Collectors.toSet());
    System.out.println(names);
    TreeSet<String> treeSetNames =
        people.stream()
            .map(p -> p.getName())
            .collect(Collectors.toCollection(() -> new TreeSet<>()));
    System.out.println(treeSetNames);

    // String to map count char
    String alpha = "abeddddfq";
    Map<Character, Long> collect =
        alpha
            .chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(collect);

    // Divide list by 2 (true and false)
    Map<Boolean, List<Person>> supperThan25 =
        people.stream().collect(Collectors.partitioningBy(person -> person.getAge() > 25));
    System.out.println(supperThan25);

    // Grouping list -> map => list person to map(age, person)
    Map<Integer, List<Person>> groupByAge =
        people.stream().collect(Collectors.groupingBy(Person::getAge));
    System.out.println(groupByAge);

    // Grouping and couting
    Map<Integer, Long> countAge =
        people.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
    System.out.println(countAge);
    // Grouping and maping

    // people.stream().collect(Collectors.groupingBy(Person::getAge,
    // Collectors.mapping(person->person.getName())));

  }
}
