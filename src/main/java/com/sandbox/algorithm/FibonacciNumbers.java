package com.sandbox.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {

  private Map<Integer, Long> dictionary = new HashMap<>();

  public long fib(int x) {
    if (x == 0) {
      return 0;
    } else if (x == 1) {
      return 1;
    } else {
      return memo(x - 1) + memo(x - 2);
    }
  }

  public long memo(int x) {
    // create a map to store the results
    Long value = dictionary.get(x);
    if (value != null) {
      return value;
    }
    value = fib(x);
    dictionary.put(x, value);
    return value;
  }

  public static void main(String[] args) {
    FibonacciNumbers fib = new FibonacciNumbers();
    for (int i = 0; i < 92; i++) {
      System.out.println(fib.fib(i));
    }
  }
}
