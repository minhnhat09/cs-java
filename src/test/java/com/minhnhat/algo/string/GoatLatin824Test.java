package com.minhnhat.algo.string;

import com.minhnhat.introduction.LeapYear;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GoatLatin824Test {
  @Test
  public void testPhrase(){
    assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", GoatLatin824.toGoatLatin("I speak Goat Latin"));
    assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", GoatLatin824.toGoatLatin("The quick brown fox jumped over the lazy dog"));
  }
}
