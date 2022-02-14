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
        assertEquals("//;\n1,2,3:4;5",stringCalculator.add("//;\n1,2,3:4;5"),15);
    }
    @Test
    public void testAddOriginal() {
        assertEquals("text : 1,2,3:4,-5 ",stringCalculator.add("1,2,3:4,5"),15);
    }
    @Test
    public void testAddNull() {
        assertEquals("text : Null ",stringCalculator.add(""),0);
    }
    //왜 fail 뜨지?
    @Test(expected = NumbersMinusException.class)
    public void testAddMinus() {
        stringCalculator.add("1,2,3:4,-5");

    }
    //왜 fail 뜨지?
    @Test(expected = NullPointerException.class)
    public void testExceptionThrown(){
        String str = null;
        str.length();
    }
}