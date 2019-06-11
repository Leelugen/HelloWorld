package com.llg.Concurrent;
/**
 * 1.有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池用一个数组int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
 * 创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”，随机从arr数组中获取奖项元素并打印在控制台上,格式如下:
 */
public class Chou implements Runnable {
    private final int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300}; //抽奖池
    private boolean[] isOut = new boolean[arr.length];
    private int num = arr.length;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num <= 0 ){
                    break;
                }
                int index = (int) (Math.random()*arr.length);
                //没有被选出
                if (isOut[index]) {
                    continue;
                }
                System.out.println(Thread.currentThread().getName() + "抽出的金额是：" + arr[index]);
                isOut[index] = true;
                num--;
            }
            Thread.yield();
        }

    }
}