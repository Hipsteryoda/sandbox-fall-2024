package com.sandbox.search;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {

    @Test
    void testCalculateForPositiveNumber() {
        assertEquals(5.0, SquareRoot.calculateFor(25, 0.01), 0.01);
    }

    @Test
    void testCalculateForZero() {
        assertEquals(0.0, SquareRoot.calculateFor(0, 0.01), 0.01);
    }

    @Test
    @Disabled
    void testCalculateForNegativeNumber() {
        assertEquals(-1.0, SquareRoot.calculateFor(-25, 0.01), 0.01);
    }

    @Test
    void testCalculateForSmallPrecision() {
        assertEquals(5.0, SquareRoot.calculateFor(25, 0.000000001), 0.000000001);
    }

    @Test
    void testCalculateForLargeNumber() {
        assertEquals(10000.0, SquareRoot.calculateFor(100000000, 0.01), 0.01);
    }

    @Test
    void testCalculateForNonPerfectSquare() {
        assertEquals(4.123, SquareRoot.calculateFor(17, 0.001), 0.001);
    }

    @Test
    void testCalculateForRepeatingGuess() {
        assertEquals(1.414, SquareRoot.calculateFor(2, 0.001), 0.001);
    }
}