package com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.registry;

import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.factory.Factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public interface Registry<T> {
  Factory<? extends T> buildShapeFactory(String shape);

  public static <T> Registry<T> createRegistry(
          Consumer<Builder<T>> consumer, Function<String, Factory<T>> errorFunction
  ) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = map::put;
    consumer.accept(builder);
    return shape -> map.computeIfAbsent(shape, errorFunction);
  }
}
