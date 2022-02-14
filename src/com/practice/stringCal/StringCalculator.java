package com.practice.stringCal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * @author inseok
 * 요구사항 : 전달하는 문자를 구분자로 분리 후 각 숫자의 합을 구해 반환.
 * pattern matcher를 좀 공부하고 접근했다.
 * 내가 잘못 읽었던 부분이 전달 문자를 입력 받는다고 생각했고, 그러다보니 String 읽는데 문제가 생기더라.
 */
public class StringCalculator{
    //add 가 이렇게 줄어 들 수가 있구나.
    int add(String text) throws NumbersMinusException {

        if(text==null ||text.isEmpty())return 0;


        return sum(toInts(split(text)));
    }
    private String[] split(String text){
        String pattern = "//(.)\n(.*)";
        String originalDelimeters=",|:";
        String delimiters = null;
        String numLine=null;

        boolean regex = Pattern.matches(pattern,text);
        delimiters = originalDelimeters;
        numLine=text;
        if(regex){
            delimiters = String.valueOf(text.charAt(2));//split할때 or 표시를 해야하는구나
            numLine = text.substring(4,text.length());
        }
        return numLine.split(delimiters);
    }
    private int[] toInts(String[] values){
        int [] numbers = new int[values.length];
        for(int i=0;i<values.length;i++){
            numbers[i] = Integer.parseInt(values[i]);
            if(numbers[i]<0){
                throw new NumbersMinusException(numbers[i]);
            }
        }
        return numbers;
    }
    private int sum(int[] numbers){
        int sum=0;
        for(int number:numbers)
            sum+= number;
        return sum;
    }
}
//첫 del이 제대로 안먹겠네..