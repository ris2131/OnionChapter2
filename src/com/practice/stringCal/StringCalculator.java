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
public class StringCalculator {
    int add(String text){
        String numLine=null;
        String originalDelimeters=",|:";
        String delimiters = null;
        String [] stNumbers;
        int [] numbers;
        int total=0;
        String pattern = "//(.)\n(.*)";

        boolean regex = Pattern.matches(pattern,text);
        if(regex){
            delimiters = originalDelimeters+"|"+text.charAt(2);
            numLine = text.substring(4,text.length());
        }
        stNumbers = numLine.split(delimiters);
        //split할때 or 표시를 해야하는구나

        numbers = new int[stNumbers.length];
        for(int i=0;i<stNumbers.length;i++){
            numbers[i] = Integer.parseInt(stNumbers[i]);
            total+=numbers[i];
        }
        return total;
    }
}
//첫 del이 제대로 안먹겠네..