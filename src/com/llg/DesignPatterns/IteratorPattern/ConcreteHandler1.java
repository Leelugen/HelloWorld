package com.llg.DesignPatterns.IteratorPattern;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if ("ConcreteHandler1".equals(condition)){
            System.out.println("ConcreteHandler1 handled");
        }else {
            if (successor != null){
                successor.handleRequest(condition);
            }
        }
    }
}
