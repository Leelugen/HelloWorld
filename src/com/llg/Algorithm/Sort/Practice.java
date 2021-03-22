package com.llg.Algorithm.Sort;

public class Practice {
    /**
     * 冒泡法
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     * @param data
     */
    public void bubbleSort(int[] data){
        for (int i = 0;i<data.length-1;i++){
            boolean isChanged = false;
            for (int j = data.length-1;j>i;j--){
                if (data[j]<data[j-1]){
                    isChanged = true;
                    swap(data,j,j-1);
                }
            }
            if (!isChanged) {
                return;
            }
        }
    }

    public void quickSort(int[] data){
        quickSort(data,0,data.length-1);
    }

    private void quickSort(int[] data,int low,int high){
        if (low > high){
            return;
        }
        int pos = p(data,low,high);
        quickSort(data,low,pos-1);
        quickSort(data,pos+1,high);
    }

    //划分方法
    private int p(int[] data,int low,int high){
        int pivot = data[low];
        while (low < high){
            while (low < high && data[high] >= pivot){
                high--;
            }
            swap(data,low,high);
            while (low < high && data[low] <= pivot){
                low++;
            }
            swap(data,low,high);
        }
        return low;
    }



    private static void swap(int[] data,int a,int b){
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

}
