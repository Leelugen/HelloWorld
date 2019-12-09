package com.llg.LeetCode;

import java.util.Arrays;

public class Client {


    public static void main(String[] args) {
        String[] rpn = {"4","13","5","/","+"};
        EvalRPN evalRPN = new EvalRPN();
        int ret = evalRPN.evalRPN(rpn);

        System.out.println(Arrays.toString(rpn) +"ret>"+ret);



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
    }
}
