package com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder;

import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.factory.Factory;
import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.model.Rectangle;
import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.registry.SwitchRegistry;

@SuppressWarnings("unchecked")
public class PlayWithSwitchRegistry {
  public static void main(String[] args) {
    SwitchRegistry registry = new SwitchRegistry();
    Factory<Rectangle> rectangleFactory = (Factory<Rectangle>) registry.buildShapeFactory("rectangle");
    System.out.println("Rectangle " + rectangleFactory.newInstance());
  }
}
