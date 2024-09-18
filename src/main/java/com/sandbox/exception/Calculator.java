package com.sandbox.exception;

public class Calculator {

  // This is considered a "pure function"
  // A method that does not modify the state of the class
  // or modify the parameters
  public static int add(int a, int b) {
    return a + b;
  }

  // overloading method        vvvvvv <-- "var arg": variable argument 
  public static int add(int a, int... b) {
    int sum = a;
    // for each loop
    for (int i : b) {
      sum += i;
    }
    return sum;
  }

  public static int subtract(int a, int b) {
    return a - b;
  }

  public static int multiply(int a, int b){
    return a * b;
  }

  public static int divide(int a, int b) {
    int returnValue = 0;
    try {
      returnValue = a / b;
    } catch (ArithmeticException e) {
      System.err.println("Cannot divide by zero");
    }
    return a / b;
  }

  public static void main(String[] args) {
    System.out.println(divide(5,0));
  }

}
