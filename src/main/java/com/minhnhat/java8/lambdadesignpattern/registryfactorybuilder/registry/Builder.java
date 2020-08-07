package com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.registry;

import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.factory.Factory;

public interface Builder<T> {
  void register(String label, Factory<T> factory);
}
