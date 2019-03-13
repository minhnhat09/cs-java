package com.minhnhat.introduction;

import com.minhnhat.introduction.LeapYear;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class LeapYearTest {

  @Test
  public void leapYearAreDivisibleByFour(){
    assertTrue(LeapYear.isLeap(2017));
  }

  @Test
  public void normalYearIsNotDivisibleByFour(){
    assertFalse(LeapYear.isLeap(3));
  }

  @Test
  public void yearDivisibleBy100AreNotLeapYear(){
    assertFalse(LeapYear.isLeap(1900));
  }
}
