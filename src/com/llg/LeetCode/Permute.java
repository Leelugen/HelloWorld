package com.llg.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//给定一个没有重复数字的序列，返回其所有可能的全排列。
//
//        示例:
//
//        输入: [1,2,3]
//        输出:
//        [
//        [1,2,3],
//        [1,3,2],
//        [2,1,3],
//        [2,3,1],
//        [3,1,2],
//        [3,2,1]
//        ]
public class Permute {

    private List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] data) {
        // Perms(nums[0…n-1]) = {取出一个数字} + Perms(nums[{0…n-1} - 这个数字])
        if(data == null || data.length == 0) {
            return result;
        }
        List<Integer> temp = new ArrayList<>();
        for (int i:data){
            temp.add(i);
        }
        perms(temp.size(),0,temp);
        return result;
    }

    private void perms(int size,int index,List<Integer> temp) {
        if(index == size){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index; i < size; i++){
            Collections.swap(temp,index,i);
            perms(size,index+1,temp);
            //将数据回溯到上一状态，以进行新的遍历
            Collections.swap(temp,index,i);
        }
    }
}

