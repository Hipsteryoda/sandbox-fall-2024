package com.sandbox.inheritance.vehicle;

public class Truck extends LandCraft {
  @Override
  public void transport() {
    System.out.println("Transporting truck stuff");
  }

  public void horn() {
    System.out.println("Truck is honking");
  }
  
  @Override
  public String toString() {
    // StringBuilder is a mutable sequence of characters
    // It is developed for performance
    // Avoid using the '+' operator to concatenate strings
    final StringBuilder sb = new StringBuilder("Truck{");
    // called a fluent API
    // append returns the StringBuilder object to be appended again
    sb.append("engineStarted=").append(engineStarted).append('}');
    return sb.toString();
  }
}
