package com.sandbox.inheritance.vehicle;

// Textbook definition of an abstract class
// An abstract class is a class that cannot
// be instantiated, but can be subclassed
// and have its methods overridden. It's an
// "abstraction".
public abstract class Vehicle implements Conveyance {

  public static int counter = 0;

  public Vehicle() {
    counter++;
  }

  // This field is protected, so it is accessible to subclasses
  protected boolean engineStarted = false;

  public void startEngine() {
    // Calling methods on methods is a pattern called chaining
    System.out.println(this.getClass().getSimpleName() + " Engine started");
    engineStarted = true;
  }

  public void stopEngine() {
    // Calling methods on methods is a pattern called chaining
    System.out.println(this.getClass().getSimpleName() + " Engine stopped");
    engineStarted = false;
  }

}
