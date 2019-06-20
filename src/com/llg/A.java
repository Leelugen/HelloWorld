package com.llg;

public class A {
    private class B{

    }

    public static void main(String[] args) {


//        B b = new B();   error

        A a = new A();
        A.B b = a.new B();
    }


}
