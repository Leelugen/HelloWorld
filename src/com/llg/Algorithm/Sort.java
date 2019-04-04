package com.llg.Algorithm;

public class Sort {

    /**
     * 暴力排序法 跟冒泡排序区别不大
     *
     * @param data
     */
    public static void simpleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }


    /**
     * 原理：俩俩比较相邻记录的排序码，若发生逆序，则交换；有俩种方式进行冒泡，一种是先把小的冒泡到前边去，另一种是把大的元素冒泡到后边。
     * 性能：冒泡排序的性能比暴力排序要好，尤其是数据不是很混乱的情况，时间复杂度 n*n
     * @param data
     */
    public static void bubbleSort(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            boolean isChange = false;
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    isChange = true;
                }
            }
            if (!isChange) {
                return;
            }
        }
    }


    /**
     * 插入排序
     * 原理：依次选择一个待排序的数据，插入到前边已排好序的序列中。
     *
     * @param data
     */
    public static void insertSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            //比有序序列最大的值要小 则要将数据插入
            if (data[i] < data[i - 1]) {
                int j; //最后我们将要插入的位置
                int temp = data[i];
                //寻找正确的插入位置并插入
                for (j = i - 1; j >= 0 && temp < data[j]; j--) {
                    data[j + 1] = data[j];
                }
                data[j + 1] = temp;
            }
        }
    }

}
