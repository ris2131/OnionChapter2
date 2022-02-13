package com.practice;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    @Test
    public void testAdd() {
        Calculator cal = new Calculator();
        assertEquals("1 + 2 must be 3",3,cal.add(1,2));
    }
    @Test
    public void testSubtract() {
        Calculator cal = new Calculator();
        assertEquals("1-3 must be -2",-2,cal.subtract(1,3));
    }

    @Test
    public void testMultiply() {
        Calculator cal = new Calculator();
        assertEquals("2*3 must be 6",6,cal.multiply(2,3));
    }

    @Test
    public void testDivide() {
        Calculator cal = new Calculator();
        assertEquals("7/3 must be 2",2,cal.divide(7,3));
    }
}