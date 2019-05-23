package com.llg.DataStructs;


/**
 * 线性表===============顺序表
 */

public class SequenceTable {
    private int size; //顺序表空间
    private int length; //顺序表占用空间
    private int[] list; //内部维护的数组

    public SequenceTable(int size) {
        this.size = size;
        this.length = 0;
        list = new int[size];
    }

    public void clearList() {
        this.length = 0;
    }

    public boolean isListEmpty() {
        return this.length == 0;
    }

    public int getLength() {
        return this.length;
    }

    //判满
    private boolean isFull() {
        return length + 1 > size;
    }

    //获取指定位置的元素
    public int getLocateElem(int i) {
        if (i < 0 && i >= size) {
            throw new IllegalArgumentException("locate Illegal");
        }
        return list[i];
    }

    //获取指定元素的（第一次出现）位置
    public int getElemLocate(int elem) {
        for (int i = 0; i < length; i++) {
            if (list[i] == elem) {
                return i;
            }
        }
        //can't find
        return -1;
    }

    //插入元素
    public boolean listInsert(int locate, int elem) {
        if (locate < 0 || locate > length) {
            return false;
        }
        if (isFull()) {
            return false;
        }
        //将locate
        for (int i = length; i > locate; i--) {
            list[i] = list[i-1];
        }
        list[locate] = elem;
        length++;
        return true;
    }


    //删除元素
    public boolean listDelete(int locate){
        if (locate <0 || locate >= length){
            return false;
        }
        for (int i = locate+1;i<length;i++){
            list[i-1] = list[i];
        }
        length--;
        return true;
    }

    //添加元素
    public boolean addElem(int elem){
        if (isFull()){
            return false;
        }
        list[length++] = elem;
        return true;
    }

    //获取指定元素的前驱
    public int priorElem(int elem) {
        int locate = getElemLocate(elem);
        if (locate == -1) {
            throw new NullPointerException("不存在这个元素！");
        } else {
            if (locate == 0) {
                throw new IllegalArgumentException("第一个位置的元素不存在前驱！");
            } else {
                return list[locate - 1];
            }
        }
    }

    //获取指定元素的后继
    public int nextElem(int elem) {
        int locate = getElemLocate(elem);
        if (locate == -1) {
            throw new NullPointerException("不存在这个元素！");
        } else {
            if (locate == length - 1) {
                throw new IllegalArgumentException("最后一个位置的元素不存在后继！");
            } else {
                return list[locate + 1];
            }
        }
    }

    //遍历顺序表
    public void listTraverse() {
        for (int i = 0; i < length; i++) {
            System.out.println(list[i] + "");
        }
    }


}
