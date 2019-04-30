package com.llg.Algorithm.Sort;

import java.util.Arrays;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        int[] data =generateIntArr();
        long startTime = System.nanoTime();
     //   Sort.selectSort(data);
        Sort.mergeSort(data);
        System.out.println(Arrays.toString(data));
        long spendTime = System.nanoTime()-startTime;
        System.out.println("spend time"+spendTime);
    }

    private static int[] generateIntArr(){
        Random random = new Random(47);
        int[] data = new int[20];
        for (int i = 0;i<data.length;i++){
            data[i] = random.nextInt(100);
        }
        return data;
    }

}
