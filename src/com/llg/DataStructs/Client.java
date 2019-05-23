package com.llg.DataStructs;

public class Client {
    public static void main(String[] args) {
        SequenceTable table = new SequenceTable(100);
        table.addElem(1);
        table.addElem(5);
        table.addElem(7);
        table.addElem(9);
        table.listInsert(1,3);
        table.listTraverse();
        int a = table.nextElem(3);
        int b = table.priorElem(9);
        System.out.println("a="+a+">>>>>>>>>"+"b="+b);
    }
}
