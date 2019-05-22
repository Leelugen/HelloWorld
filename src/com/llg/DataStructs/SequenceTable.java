package com.llg.DataStructs;


/**
 * 线性表===============顺序表
 *
 *
 */
public class SequenceTable {
    private int size; //顺序表空间
    private int length; //顺序表占用空间
    private int[] list; //内部维护的数组

    public SequenceTable(int size){
        this.size = size;
        this.length = 0;
        list = new int[size];
    }

    public void clearList(){
        this.length = 0;
    }

    public boolean isListEmpty(){
        return this.length == 0;
    }

    public int getLength(){
        return this.length;
    }

    //获取指定位置的元素
    public int getLocateElem(int i){
        if (i<0 && i >= size){
            throw new IllegalArgumentException("locate Illegal");
        }
        return list[i];
    }

    //获取指定元素的（第一个）位置
    public int getElemLocate(int elem){
        for (int i = 0;i<length;i++){
            if (list[i] == elem){
                return i;
            }
        }
        //can't find
        return -1;
    }


    //获取指定元素的前驱
    public int priorElem(int elem){
        int locate = getElemLocate(elem);
        if (locate != -1){
            throw new NullPointerException("can't this elem");
        }else {
            if (locate == 0){
              //  throw new
            }
        }
        return 0;

    }



}
