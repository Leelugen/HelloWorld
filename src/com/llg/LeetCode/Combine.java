package com.llg.LeetCode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * <p>
 * 示例:
 * <p>
 * 输入: n = 4, k = 2
 * 输出:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combinations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * <p>
 * n = 4 k = 3
 * [1,2,3]
 * [1,2,4]
 * [1,3,4]
 * [2,3,4]
 * <p>
 * <p>
 */
public class Combine {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (n == 0 || k == 0 || k > n) {
            return result;
        }
        get(1, n, k,new LinkedList<>());
        return result;
    }

    private void get(int index, final int n, final int k,final LinkedList<Integer> temp) {
        //1 退出,并将结果存入
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        //2 剪枝：根据观察可以发现 n-(k-temp.size)+1 <= n 后的数没有必要执行，他们完全不满足要求
        for(int i = index; i <= n-(k-temp.size())+1; i++){
            //选一个数
            temp.addLast(i);
            //3 改变index，递归
            get(i + 1, n, k,temp);
            //4 回溯 移除上次选中的数字
            temp.removeLast();
        }
    }
}
