package com.llg.Algorithm.Sort;

public class Sort {

    /**
     * 选择排序
     * 思想:在待排数据中每次去选择一个最优解，迭代，这样数据最终有序。
     * @param data
     */
    public static void selectSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            //优化： 先将记录下标，不用每次去交换
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min]) {
                  min = j;
                }
            }
            if (min != i){
                swap(data,min,i);
            }
        }
    }


    /**
     * 冒泡排序
     * 原理：俩俩比较相邻记录的排序码，若发生逆序，则交换；有俩种方式进行冒泡，一种是先把小的冒泡到前边去，另一种是把大的元素冒泡到后边。
     * 性能：时间复杂度 n^2,通过每一次相邻元素的交换使得序列趋于有序
     *
     * @param data
     */
    public static void bubbleSort(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            //对于一些极端情况做了优化，如整体有序的数据
            boolean isChange = false;

            //把元素大的冒泡到后面
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data,j,j+1);
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
                for (int j = i - 1; j > low; j--) {
                    data[j + 1] = data[j];
                }
                data[low] = temp;
            }
        }
    }


    /**
     * 希尔排序
     * <p>
     * 思想：
     * 先是取一个合适的gap<n作为间隔，将全部元素分为gap个子序列，所有距离为gap的元素放入同一个子序列，再对每个子序列进行直接插入排序；
     * 缩小间隔gap，例如 gap=ceil(gap/2)，重复上述子序列划分和排序
     * 直到，最后gap=1时，将所有元素放在同一个序列中进行插入排序为止。
     *
     *
     * 时间复杂度 nlogn
     *
     * @param data
     */
    public static void shellSort(int[] data) {
        int size = data.length;
        //序列增量 gap
        for (int gap = size / 2; gap > 0; gap /= 2) {
            //这里的思想，并不是将各个分组分开排序（也没有必要，这样要多一层循环），而是按分组顺序轮流排分组的序列
            for (int i = gap; i < size; i++) {
                //比分组序列最大的值要小（或者满足某种条件） 则要将数据插入
                if (data[i] < data[i - gap]) {
                    int temp = data[i];//待插入的值
                    int k; //k是不满足条件的位置
                    //寻找正确的插入位置并插入
                    for (k = i; k - gap >= 0 && temp < data[k - gap]; k -= gap) {
                        data[k] = data[k - gap]; //向后移动一个位置
                    }
                    data[k] = temp;
                }
            }
        }
    }


    /**
     * 快速排序    分而治之的思想
     *
     * 平均时间复杂度  nlogN     空间复杂度logN
     *
     * 1.对于数组[l,h] 找到一个基准元素a[m],将数组分成[l,m-1] [m+1,l],使得 左边比a[m]都小，右边比a[m]都大
     *      * 2.对两边递归排序
     * @param data
     */
    public static void quickSort(int[] data){
        quickSort(data,0,data.length-1);
    }


    private static void quickSort(int[] data,int left,int right){
        if (left > right){
            return;
        }
        int pos = partition2(data,left,right);
        quickSort(data,left,pos-1);
        quickSort(data,pos+1,right);
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
     *
     * @param arr
     * @param left
     * @param right
     * @return
     *
     *  2 1 3 4 0 5
     * 先从高位寻找不符合条件的位置，交换高位和低位
     * 再从低位寻找不符合条件的位置，交换--------
     * 直到低位不比高位高
     */
    private static int partition2(int[] arr,int left,int right){
        int pivot = arr[left]; // 取第一个位置为中枢值
        while (left < right){
            while (left < right && arr[right] >= pivot){
                right--;
            }
            swap(arr,left,right);
            while (left < right && arr[left] <= pivot){
                left++;
            }
            swap(arr,left,right);
        }
        return left;
    }


    /**
     * 交换
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }




    public static void mergeSort(int[] data){
        int[] temp = new int[data.length];
        mergeSort(data,temp,0,data.length-1);
    }

    /**
     * 归并排序
     *
     * 分治的思想
     * 分：    将序列递归分成 n/2
     *
     * 治：    合并子序列
     * @param data
     */
    private static void mergeSort(int[] data,int[] temp,int left,int right){
        if (left<right){
            int mid = (left+right)/2;
            mergeSort(data,temp,left,mid);
            mergeSort(data,temp,mid+1,right);
            merge(data,temp,left,mid,right);
        }
    }

    private static void merge(int[] data,int[] temp, int left,int mid,int right){
        int i = left;
        int j = mid+1;
        int t = 0;
        while (i <= mid && j<=right){
            if (data[i]<data[j]){
                temp[t++] = data[i++];
            }else {
                temp[t++] = data[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = data[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = data[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            data[left++] = temp[t++];
        }
    }

}








