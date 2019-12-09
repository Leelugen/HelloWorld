package com.llg.Algorithm;

import java.util.ArrayList;
import java.util.List;

class Digits {
    //数字索引所表示的字符集
    private static final String[] SYMBOL_SET = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    private List<String> result = new ArrayList<String>();


    public static void main(String[] args) {
        System.out.println(new Digits().letterCombinations("233"));
    }


    public List<String> letterCombinations(String digits) {
        if(digits == null||digits.equals("")){
            return null;
        }
        // result = str(digit[0,length]) = letter(digit[0])+str(digit[1,length]) = letter(digit[0])+...+letter(digit[n])+str(digit[n+1,length])
        getLetter(0,digits,"");
        return result;
    }

    private void getLetter(int index,String digits,String temp){
        if(index >= digits.length()){
            result.add(temp);
            return;
        }

        final String symbol = SYMBOL_SET[digits.charAt(index) -'0'];

        for(int i = 0;i<symbol.length();i++){
            getLetter(index+1,digits,temp+symbol.charAt(i));
        }
    }
}