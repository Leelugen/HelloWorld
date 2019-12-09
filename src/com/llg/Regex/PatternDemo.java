package com.llg.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {
        String regexString = "^\\w+([-+.]\\w+)*@gmail.com$";
        String text = "fdfdfdfdfd+fffffff@gmail.com";
        boolean isMatch = Pattern.matches(regexString, text);
        System.out.println("isMatch============" + isMatch);
    }
}
