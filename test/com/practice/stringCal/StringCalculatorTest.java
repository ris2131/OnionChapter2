package com.practice.stringCal;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest extends TestCase {
    StringCalculator stringCalculator = new StringCalculator();
    @Before
    public void setUp(){
        stringCalculator = new StringCalculator();
    }
    @Test
    public void testAdd() {

        assertEquals("",stringCalculator.add("//;\n1,2,3:4;5"),15);
    }
}