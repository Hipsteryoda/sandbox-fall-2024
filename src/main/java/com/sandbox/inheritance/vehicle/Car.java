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
}
