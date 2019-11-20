package com.minhnhat.element.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCore {
  public static class Student implements Comparable<Student> {
    public String name;
    public double gradePointAverage;

    @Override
    public int compareTo(Student that) {
      return name.compareTo(that.name);
    }

    public Student(String name, double gradePointAverage) {
      this.name = name;
      this.gradePointAverage = gradePointAverage;
    };

    public static void sortByGPA(List<Student> students) {
      Collections.sort(students, Collections.reverseOrder(new Comparator<Student>() {

        @Override
        public int compare(Student arg0, Student arg1) {
          return Double.compare(arg0.gradePointAverage, arg1.gradePointAverage);
        }
      }));
    }

    public static void sortByName(List<Student> students) {
      Collections.sort(students);
    }
  }
}