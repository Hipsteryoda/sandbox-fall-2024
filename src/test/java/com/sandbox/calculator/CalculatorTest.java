package com.sandbox.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

  @Test // <-- Annotation / Decorator / Marker (formal CS name)
  public void testAdd() {
    assertEquals(10, Calculator.add(5, 5));
    assertEquals(15, Calculator.add(5, 5, 5));
    assertEquals(0, Calculator.add(-5, 5));
  }

  @Test
  public void testSubtract() {
    assertEquals(0, Calculator.subtract(5, 5));
    assertEquals(10, Calculator.subtract(15, 5));
    assertEquals(-10, Calculator.subtract(5, 15));
  }

  @Test
  public void testMultiply() {
    assertEquals(25, Calculator.multiply(5, 5));
    assertEquals(0, Calculator.multiply(5, 0));
    assertEquals(-25, Calculator.multiply(5, -5));
  }

  @Test
  public void testDivide() {
    assertEquals(1, Calculator.divide(5, 5));
    assertEquals(0, Calculator.divide(0, 5));
    assertEquals(1, Calculator.divide(3, 2));
  }

}

