package com.minhnhat.designpattern.structural.bridge;

public interface Weapon {
  void wield();

  void swing();

  void unwield();

  Enchantment getEnchantment();
}
