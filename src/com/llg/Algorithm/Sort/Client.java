package com.llg.Algorithm.Sort;

import java.util.Arrays;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
       // int[] data =generateIntArr();
       int[] data = {3,1,5,4,0,2};
//        long startTime = System.nanoTime();
//        Sort.quickSort(data);
//        System.out.println(Arrays.toString(data));
//        long spendTime = System.nanoTime()-startTime;
//        System.out.println("spend time"+spendTime);
        int[] ret = Sort_Link.getFirstNum(data,6);
        System.out.println(Arrays.toString(ret));
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
