package com.sandbox.inheritance.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Driver {

  public static void main(String[] args) {
    // all of the below is procedural code
    //Car car = new Car();
    //car.startEngine();
    //
    //Truck truck = new Truck();
    //truck.startEngine();
    //
    //displayVehicle(car);
    //displayVehicle(truck);
    //
    //truck.stopEngine();
    //
    //displayVehicle(car);
    //displayVehicle(truck);
    //
    //System.out.println("Vehicle counter: " + Vehicle.counter);
    //
    //car.transport();
    //truck.transport();

    List<Vehicle> vehicles = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      vehicles.add(new Car()); // anonymous instantiation
      vehicles.add(new Truck());
    }

    // v is instantiated as a vehicle object
    // then it is typecast to a Car/Truck object
    // Example of dynamic polymorphism
    for (Vehicle v : vehicles) {
      v.startEngine();
      displayVehicle(v);
      v.stopEngine();
      displayVehicle(v);
      // casting v as a Truck object
      // if v is a Car object, this will throw a ClassCastException
      if (v instanceof Truck) {
        ((Truck)v).horn();
      }
    }

  }
  
  private static void displayVehicle(Vehicle vehicle) {
    System.out.println(vehicle.engineStarted);
  }
}
