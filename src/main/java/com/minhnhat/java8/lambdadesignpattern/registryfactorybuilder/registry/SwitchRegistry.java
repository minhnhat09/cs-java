package com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.registry;

import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.factory.Factory;
import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.model.Rectangle;
import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.model.Shape;
import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.model.Square;
import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.model.Triangle;

public class SwitchRegistry {
  public Factory<? extends Shape> buildShapeFactory(String shape) {
    switch (shape) {
      case "square":
        return Square::new;
      case "triangle":
        return Triangle::new;
      case "rectangle":
        return Rectangle::new;
      default:
        throw new IllegalArgumentException("Unknow shape: " + shape);
    }

  }
}
