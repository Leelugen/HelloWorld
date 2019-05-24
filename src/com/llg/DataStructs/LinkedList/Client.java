package com.llg.DataStructs.LinkedList;

public class Client {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertTail(0);
        list.insertTail(1);
        list.insertTail(2);
        list.insertTail(3);
        list.insertTail(4);
        list.insertTail(6);
        list.insertTail(7);
        list.insertTail(8);
        list.insertTail(9);
        list.insertTail(10);
        list.insert(6,5);
        list.delete(4);
        list.listTraverse();
    }
}
