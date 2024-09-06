package com.sandbox.inheritance.vehicle;

public class Driver {

  public static void main(String[] args) {
    // all of the below is procedural code
    Car car = new Car();
    car.startEngine();

    Truck truck = new Truck();
    truck.startEngine();

    displayVehicle(car);
    displayVehicle(truck);

    truck.stopEngine();

    displayVehicle(car);
    displayVehicle(truck);

    System.out.println("Vehicle counter: " + Vehicle.counter);

    car.transport();
    truck.transport();
  }
  
  private static void displayVehicle(Vehicle vehicle) {
    System.out.println(vehicle.engineStarted);
  }
}
