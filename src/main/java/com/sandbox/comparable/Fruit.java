package com.sandbox.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruit implements Comparable<Fruit> {

  private String fruitName;
  private int fruitQty;

  public Fruit(String fruitName, int fruitQty) {
    this.fruitName = fruitName;
    this.fruitQty = fruitQty;
  }

  public Fruit(String fruitName) {
    this.fruitName = fruitName;
    this.fruitQty = 0;
  }

  // blocks instantiation of Fruit class without any parameters
  private Fruit() {
  }

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getFruitQty() {
		return fruitQty;
	}

	public void setFruitQty(int fruitQty) {
		this.fruitQty = fruitQty;
	}

  // functional interfaces have 1 and only 1 abstract method
	@Override
	public int compareTo(Fruit that) {
    // basic logic for comparing 2 objects
    if (this.fruitName.compareTo(that.fruitName) > 0) {
      return 1;
    } else if (this.fruitName.compareTo(that.fruitName) < 0) {
      return -1;
    } else {
      // if the fruit names are the same, compare the fruit quantities
      if ( this.fruitQty > that.fruitQty ) {
        return 1;
      } else if ( this.fruitQty < that.fruitQty ) {
        return -1;
      }
    }
    // here to allow the code to compile in the else condition
    return 0;
	}

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("{ Fruit Name: ");
    sb.append(fruitName);
    sb.append(", Fruit Quantity: ");
    sb.append(fruitQty);
    sb.append(" }");
    return sb.toString();
  }

  public static void main(String[] args) {
    Fruit apple = new Fruit("Apple", 10);
    Fruit orange = new Fruit("Orange", 20);
    Fruit banana = new Fruit("Banana", 30);
    Fruit peach = new Fruit("Peach", 40);
    Fruit tangerine = new Fruit("Tangerine", 50);
    Fruit apple2 = new Fruit("Apple", 3);

    List<Fruit> fruits = new ArrayList<>();
    fruits.add(apple);
    fruits.add(orange);
    fruits.add(banana);
    fruits.add(peach);
    fruits.add(tangerine);
    fruits.add(apple2);

    fruits.forEach(System.out::println);
    System.out.println();

    // sorts the list of fruits by name
    Collections.sort(fruits);

    fruits.forEach(System.out::println);

  }

}
