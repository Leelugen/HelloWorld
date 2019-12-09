package com.llg.Test;

public class Extents {
    abstract class A{
        private int p = 99;
        protected String str = "A";
        protected int num = -1;
        A(){
            System.out.println(str+"A");
        }

        abstract protected void create();

    }

    class B extends A{
        B(){
            System.out.println(str+"B");
        }

        @Override
        protected void create() {
            System.out.println("B create running >>>>>>>");
            num = 2;
        }
    }

    class C extends B{
        C(){
            System.out.println(str+"C");
        }

        protected int num;

        @Override
        protected void create() {
            super.create();
            System.out.println("C create running >>>>>>>");
        }
    }

    public static void main(String[] args) {
        Extents e = new Extents();

        Extents.C c = e.new C();
        c.create();
        System.out.println(c.num+"");
    }


}
