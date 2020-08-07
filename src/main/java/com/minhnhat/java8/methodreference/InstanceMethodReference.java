package com.minhnhat.java8.methodreference;

import java.util.function.Consumer;

public class InstanceMethodReference {

  public static void main(String[] args) {
    final Mechanic mechanic = new Mechanic();
    Car car = new Car();

    execute(
        car,
        new Consumer<Car>() {
          @Override
          public void accept(Car car) {
            mechanic.fix(car);
          }
        });

    execute(car, c -> mechanic.fix(c));
    execute(car, mechanic::fix);
  }

  public static void execute(Car car, Consumer<Car> c) {
    c.accept(car);
  }
}

class Mechanic {
  public void fix(Car car) {
    System.out.println("Fix car" + car.id);
  }
}

class Car {
  public int id;
  public String color;
}
