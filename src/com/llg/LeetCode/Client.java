package com.llg.LeetCode;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Client {


    public static void main(String[] args) {
//        String[] rpn = {"4","13","5","/","+"};
//        EvalRPN evalRPN = new EvalRPN();
//        int ret = evalRPN.evalRPN(rpn);
//
//        System.out.println(Arrays.toString(rpn) +"ret>"+ret);



//        EvalRPN evalRPN = new EvalRPN();
//        EvalRPN.Stack stack = evalRPN.new Stack();
//
//        stack.push(11);
//        stack.push(2);
//        stack.pop();
//        stack.push(5);
//
//        stack.pop();
//        stack.pop();

        Permute permute = new Permute();
        List<List<Integer>> ret = permute.permute(new int[]{1,2,3});
        for (List<Integer> temp:ret){
            System.out.println();
            for (Integer integer:temp){
                System.out.print(integer);
            }
        }
    }
}
