package com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder;

import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.factory.Factory;
import com.minhnhat.java8.lambdadesignpattern.registryfactorybuilder.model.Circle;

import java.awt.*;
import java.util.List;

public class PlayWithFactory {
  public static void main(String[] args) {
    Factory<Circle> factory1 = Factory.createFactory(Circle::new, Color.GREEN);
    List<Circle> list = factory1.create5();
    System.out.println(list);
  }
}
