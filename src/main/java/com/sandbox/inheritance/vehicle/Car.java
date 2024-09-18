package com.sandbox.inheritance.vehicle;

// Car is a subclass of Vehicle
// and inherits all of the non-private fields and methods
public class Car extends LandCraft {

  // Annotation (type of decorator)
  // This is a way of communicating with
  // the compiler
  @Override
  public void transport() {
    System.out.println("Transporting car stuff");
  }

  @Override
  public String toString() {
    // StringBuilder is a mutable sequence of characters
    // It is developed for performance
    // Avoid using the '+' operator to concatenate strings
    final StringBuilder sb = new StringBuilder("Car{");
    // called a fluent API
    // append returns the StringBuilder object to be appended again
    sb.append("engineStarted=").append(engineStarted).append('}');
    return sb.toString();
  }
}
