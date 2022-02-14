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
    public void testAddCustom() {
        assertEquals("//;\n1,2,3:4;5",15,stringCalculator.add("//;\n1;2;3;4;5"));
    }
    @Test
    public void testAddOriginal() {
        assertEquals("text : 1,2,3:4,-5 ",15,stringCalculator.add("1,2,3:4,5"));
    }
    @Test
    public void testAddNull() {
        assertEquals("text : empty ",0 ,stringCalculator.add(""));
        assertEquals("text : null ", 0 ,stringCalculator.add(null));
    }
    @Test
    public void testAddOne() {
        assertEquals("text : 1 ",7 ,stringCalculator.add("7"));
    }
    //왜 fail 뜨지?
    @Test(expected = RuntimeException.class)
    public void testAddNegative() {
        stringCalculator.add("1,2,3:4,-5");
    }

}