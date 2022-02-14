package com.practice.stringCal;

public class NumbersMinusException extends RuntimeException {
    public NumbersMinusException() {
        super();
    }
    public NumbersMinusException(int num){
        super();
        System.err.println("numberMinus : "+ num);
    }
}
