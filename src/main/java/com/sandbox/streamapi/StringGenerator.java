package com.sandbox.streamapi;

/**
 * 
 */

import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {

  Random random = new Random();
  char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();

  @Override
  public String get() {
    // concatenate "" will avoid getting a NullPointerException
    // if for some reaseon letters returns a null character
    return "" + letters[random.nextInt(letters.length)];
  }


}

