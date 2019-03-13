package com.minhnhat.designpattern.structural.bridge;

public class MainBridge {

  public static void main(String[] args) {

    Sword enchantedSword = new Sword(new SoulEatingEnchantment());

    enchantedSword.wield();
    enchantedSword.swing();
    enchantedSword.unwield();

    Hammer hammer = new Hammer(new FlyingEnchantment());
    hammer.wield();
    hammer.swing();
    hammer.unwield();
  }
}
