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
     * 冒泡排序
     * 原理：俩俩比较相邻记录的排序码，若发生逆序，则交换；有俩种方式进行冒泡，一种是先把小的冒泡到前边去，另一种是把大的元素冒泡到后边。
     * 性能：冒泡排序的性能比暴力排序要好，尤其是数据不是很混乱的情况，时间复杂度 n^2
     *
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
     * 时间复杂度：n^2
     * 原理：依次选择一个待排序的数据，插入到前边已排好序的序列中。
     * 模拟插入过程：
     * 345786
     * temp = 6,i = 5;
     * j  data[j]  condition        process data[j+1] = data[j]                result
     * <p>
     * 4    8      true               data[5] = data[4] = 8                    345788
     * <p>
     * 3    7      true               data[4] = data[3] = 7                    345778
     * <p>
     * 2    5      false            data[j+1] = data[3] = temp = 6             345678
     *
     * @param data
     */
    public static void insertSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            //比有序序列最大的值要小 则要将数据插入
            if (data[i] < data[i - 1]) {
                int j; //j是不满足条件的位置，j+1即是最后我们将要插入的位置
                int temp = data[i];//待插入的值
                //寻找正确的插入位置并插入
                for (j = i - 1; j >= 0 && temp < data[j]; j--) {
                    data[j + 1] = data[j];
                }
                data[j + 1] = temp;
            }
        }
    }

    /**
     * 插入排序-----二分插入 NlogN
     * 原理：依次选择一个待排序的数据，插入到前边已排好序的序列中。
     *
     * @param data
     */
    public static void insertBinarySort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            //比有序序列最大的值要小 则要将数据插入
            if (data[i] < data[i - 1]) {
                int temp = data[i];
                //使用二分查找去寻找正确的插入位置
                int low = 0;
                int high = i - 1;
                int mid;
                while (low < high) { //满足条件 low与high在每次循环慢慢接近
                    mid = (high + low) >>> 1; //变化
                    if (temp < data[mid]) { //变化条件
                        high = mid - 1; //变化
                    } else {
                        low = mid + 1; //变化
                    }
                }
                for (int j = i-1; j > low; j--){
                    data[j+1] = data[j];
                }
                data[low] = temp;
            }
        }
    }

}








