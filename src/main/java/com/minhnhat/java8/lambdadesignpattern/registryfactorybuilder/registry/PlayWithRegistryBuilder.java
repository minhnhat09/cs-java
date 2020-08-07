package com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.registry;

import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.factory.Factory;
import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.model.Rectangle;
import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.model.Shape;
import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.model.Triangle;

import java.util.function.Consumer;

public class PlayWithRegistryBuilder {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    Consumer<Builder<Shape>> consumerRectangle =
            builder -> builder.register("rectangle", Rectangle::new);
    Consumer<Builder<Shape>> consumerTriangle =
            builder -> builder.register("triangle", Triangle::new);

    Consumer<Builder<Shape>> initializer = consumerRectangle.andThen(consumerTriangle);

    Registry<Shape> registry = Registry.createRegistry(
            initializer, s -> {
              throw new IllegalArgumentException("Unknown shape " + s);
            }
    );

    Factory<Rectangle> buildRectangleFactory = (Factory<Rectangle>) registry.buildShapeFactory("rectangle");

    Rectangle rectangle = buildRectangleFactory.newInstance();
    System.out.println("Rectangle created by registry " + rectangle);

    Factory<Triangle> builTriangleFactory = (Factory<Triangle>) registry.buildShapeFactory("triangle");
    Triangle triangle = builTriangleFactory.newInstance();
    System.out.println("Triangle " + triangle);




  }
}
