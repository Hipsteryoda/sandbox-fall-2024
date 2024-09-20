package com.sandbox.generics;

import java.util.Random;
import java.util.List;
import java.util.stream.Collectors;

public class GenericsDriver {

  public static void main(String[] args) {
    
    IntegerBox integerBox = new IntegerBox();
    integerBox.setContents(42);
    System.out.println(integerBox);

    DoubleBox doubleBox = new DoubleBox();
    doubleBox.setContents(42.0);
    System.out.println(doubleBox);

    Box<Integer> integerBox2 = new Box<>();
    Box<Double> doubleBox2 = new Box<>();

    integerBox2.setContents(42);
    doubleBox2.setContents(42.0);

    System.out.println(integerBox2);
    System.out.println(doubleBox2);

    Crate<Box<Integer>> crate = new Crate<>();
    crate.addBox(integerBox2);
    System.out.println(crate);

    
    List<Integer> numbers = new Random()
      .ints(1, 1000)
      .distinct()
      .limit(150)
      .boxed()
      .collect(Collectors.toList());

    numbers.forEach(number -> crate.addBox(new Box<>(number))); 

    System.out.println(crate);

    // Doesn't work when T is bounded by Number
    //Box<String> stringBox = new Box<>();
    //stringBox.setContents("Hello, World!");
    //System.out.println(stringBox);
  }
}
