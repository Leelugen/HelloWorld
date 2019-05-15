package com.llg.Algorithm.Sort;


/**
 * 排序的一些应用
 */

public class Sort_Link {
    /**1 .
     * 获取N个数的前m个数字，采用改进的快速排序算法
     * <p>
     * 如:
     * input data[] 134,454,56,43,4,656
     * rank 3
     * return 4,43,56
     */
    public static int[] getFirstNum(int[] data, int rank) {
         getFirstNum(data,0,data.length-1,rank);
         int[] ret = new int[rank];
         System.arraycopy(data, 0, ret, 0, rank);
         return ret;
    }


    public static void getFirstNum(int[] data,int left,int right ,int rank) {
        if (left <= right){
            int pivotpos = partition(data,left,right);
            getFirstNum(data,left,pivotpos-1,rank);
            if (pivotpos < rank){
                getFirstNum(data,pivotpos+1,right,rank);
            }
        }
    }

    /**
     * 划分方法
     * 功能：将小于基准元素到左边，大于的到右边
     * @return  基准元素的最终位置
     */
    private static int partition(int[] arr,int left,int right){
        int pivot = arr[left];
        int pivotpos = left;
        for (int i = left+1; i <= right; i++){
            if (arr[i] < pivot){
                pivotpos++;
                if (pivotpos != i){     //如果交换元素就位于基准后第一个，则不需要交换
                    swap(arr,i, pivotpos);
                }
            }
        }
        arr[left] = arr[pivotpos];
        arr[pivotpos] = pivot;
        return pivotpos;
    }


    /**
     * 交换
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
