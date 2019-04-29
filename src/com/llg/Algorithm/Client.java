package com.llg.Algorithm;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        int[] data = new int[]{4,6,2,3,1,1,8,9,2,6,7,4,6,2,3,1,1,4,6,2,3,1,1,4,6,2,3,1,1,4,6,2,3,1,1,4,6,2,3,1,1};
//
//
//      Sort.insertBinarySort(data);
        long startTime = System.nanoTime();
       // Sort.quickSort(data);
        Sort.selectSort(data);
        System.out.println(Arrays.toString(data));
        long spendTime = System.nanoTime()-startTime;
        System.out.println("spend time"+spendTime);
    }
}
