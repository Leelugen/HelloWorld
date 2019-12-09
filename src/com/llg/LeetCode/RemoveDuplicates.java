package com.llg.LeetCode;

import java.util.Arrays;

public class RemoveDuplicates {

    /**#从排序数组中删除重复项
     *>给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *>不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {

        //暴力方法
        int size = nums.length;
        for(int i = 1; i < size; i++){
            if(nums[i] == nums[i-1]){
                for(int j = i;j < size-1;j++){
                    nums[j] = nums[j+1];
                }
                i--;
                size--;
            }
        }
        return size;
    }


    public int removeDuplicates2(int[] nums) {
        if(nums==null)
            return 0;
        if(nums.length<2)
            return nums.length;
        int index = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[index-1]) {
                //记录符合要求的位置
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}

