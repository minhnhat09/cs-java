package com.minhnhat.java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Shipment {
  public double calculateWeight() {
    double weight = 0;
    return weight;
  }

  public static List<Double> calculateOnShipments(List<Shipment> l, Function<Shipment, Double> f) {
    List<Double> results = new ArrayList<>();
    for (Shipment s : l) {
      results.add(f.apply(s));
    }
    return results;
  }

  public static void main(String[] args) {
    List<Shipment> l = new ArrayList<>();
    calculateOnShipments(
        l,
        new Function<Shipment, Double>() {
          @Override
          public Double apply(Shipment shipment) {
            return shipment.calculateWeight();
          }
        });

    calculateOnShipments(l, s -> s.calculateWeight());
    calculateOnShipments(l, Shipment::calculateWeight);
  }
}
