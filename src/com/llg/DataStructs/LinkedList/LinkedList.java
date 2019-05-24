package com.llg.DataStructs.LinkedList;

/**
 * 单链表
 */
public class LinkedList {
    private Node first;//头结点
    private int length;//链表长度

    public LinkedList() {
        first = new Node(-1, null);
        length = 0;
    }

    private static class Node {
        int data; //数据域
        Node next; //指针域

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        void showNode() {
            System.out.println(this.data + "");
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }


    //清空链表
    public void clearList() {
        Node next = first.next;
        while (next != null) {
            Node temp = next.next;
            next.next = null;
            next = temp;
        }
        first.next = null;
        length = 0;
    }

    //在头结点后边插入
    public void insertHead(int elem) {
        Node next = first.next;
        first.next = new Node(elem, next);
        length++;
    }

    //在尾结点后插入
    public void insertTail(int elem) {
        //寻找尾节点
        Node curNode = first;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = new Node(elem, null);
        length++;
    }

    /**
     * 在index位置插入
     *
     * @param index
     * @param elem
     */
    public void insert(int index, int elem) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("index 不是链表的正确位置");
        }

        Node curNode = first;
        //找到插入位置index的前一个位置
        for (int i = 0; i < index; i++) {
            curNode = curNode.next;
        }
        Node temp = curNode.next;
        curNode.next = new Node(elem, temp);
        length++;
    }


    /**
     * 删除index位置的元素
     *
     * @param index
     * @return
     */
    public int delete(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("index 不是链表的正确位置");
        }

        Node curNode = first;
        //找到删除位置index的前一个位置的结点
        for (int i = 0; i < index; i++) {
            curNode = curNode.next;
        }
        Node rmNode = curNode.next;
        curNode.next = rmNode.next;
        rmNode.next = null;
        length--;
        return rmNode.data;
    }


    public int getElem(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("index 不是链表的正确位置");
        }

        Node curNode = first;
        //find
        for (int i = 0; i <= index; i++) {
            curNode = curNode.next;
        }
        return curNode.data;
    }

    public int locateElem(int elem) {
        Node curNode = first;
        for (int i = 0; i < length; i++) {
            if (curNode.next.data == elem){
                return i;
            }
            curNode = curNode.next;
        }
        return -1;
    }

    //寻找一个元素的前驱
    public int getPriorElem(int elem){
        Node curNode = first;
        Node tempNode;
        while (curNode.next != null){
            tempNode = curNode;
            curNode = curNode.next;
            if (tempNode != first && curNode.data == elem){
                return tempNode.data;
            }
        }
        return -1;
    }

    //寻找一个元素的后继
    public int getNextElem(int elem){
        Node curNode = first;
        while (curNode.next != null){
            curNode = curNode.next;
            if (curNode.data == elem && curNode.next != null){
                return curNode.next.data;
            }
        }
        return -1;
    }


    public void listTraverse() {
        Node node = first;
        for (int i = 0; i < length; i++) {
            node.next.showNode();
            node = node.next;
        }
    }

}
