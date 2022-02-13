package com.practice;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Before 어노테이션을 통해 객체생성 중복코드 제거.
//또한 나중에 다른 어노테이션 쓸때  Before안에서만 객체를 쓸수 있는 그런 어노테이션들도 있다.
//Before annotation 의 setUp이랑 After annotation의 tearDown 은 꼭 저 이름으로 써야하는것?
public class CalculatorTest2 extends TestCase {

    Calculator cal;
    @Before
    public void setUp(){
        cal = new Calculator();
        System.out.println("setUp");
    }
    @Test
    public void testAdd() {

        assertEquals("1 + 2 must be 3",3,cal.add(1,2));
        System.out.println("add");


    }
    @Test
    public void testSubtract() {
        assertEquals("1-3 must be -2",-2,cal.subtract(1,3));
        System.out.println("sub");
    }

    @Test
    public void testMultiply() {
        assertEquals("2*3 must be 6",6,cal.multiply(2,3));
        System.out.println("mul");
    }

    @Test
    public void testDivide() {
        assertEquals("7/3 must be 2",2,cal.divide(7,3));
        System.out.println("div");
    }
    @After
    public void tearDown(){
        System.out.println("tearDown");
    }
}