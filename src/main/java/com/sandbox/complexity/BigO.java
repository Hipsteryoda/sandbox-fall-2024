package com.sandbox.complexity;

public class BigO {

  public static void main(String[] args) {
    
    // nested structures -> multiple O() times each other
    // O(n) * O(n) = O(n^2)

    // O(n)
    int n = 1000000;
    for (int i = 0; i < n; i++) {
      // O(n) -> O(n) * O(n) = O(n^2)
      for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
      }
    }

    // Addition big O
    // O(n)
      // some code

    // O(n)
      // some code
    
    // O(log n)
      // some code

    // O(n) + O(n) + O(log n) = O(n) + O(n) = O(n)
    // O(log n) doesn't matter because it's smaller than O(n)

  }
}
