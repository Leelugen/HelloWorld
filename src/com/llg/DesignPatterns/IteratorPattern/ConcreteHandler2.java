package com.llg.DesignPatterns.IteratorPattern;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler2")){
            System.out.println("ConcreteHandler2 Handled...");
        }else {
            if (successor != null){
                successor.handleRequest(condition);
            }
        }
    }
}
