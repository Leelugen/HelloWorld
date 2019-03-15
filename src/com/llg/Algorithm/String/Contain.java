package com.llg.Algorithm.String;

import java.util.HashMap;

/**
 * 字符串包含的问题
 */

public class Contain {

    /**
     * 时间复杂度O(n + m)，空间复杂度O(1)
     * @param a  a为父串
     * @param b  b为子串
     * @return  A串中能否找到B串中包含的所有字符种类
     */
    public static boolean AContainB(String a, String b) {
        int hash = 0;
        for (int i = 0; i < a.length(); ++i) {
            hash |= (1 << (a.charAt(i) - 'A'));//int4字节 有32位可以表示32种字符
        }
        for (int i = 0; i < b.length(); ++i) {
            if ((hash & (1 << (b.charAt(i) - 'A'))) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 变位词  两个字符串的字符类型和数量一样，但是顺序不一样。
     * @param datas abb
     * @param key   bba
     * @return true
     */
    public static boolean searchBorStr(String datas, String key) {
        if (datas.length() != key.length()) {//长度不相同返回false
            return false;
        }
        if (datas.equals("") || key.equals("")) {
            return false;
        }
        HashMap<Integer, Integer> offsetMap = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            int offset = key.charAt(i) - 'A'; //偏移量
            if (offsetMap.containsKey(offset)) {
                offsetMap.put(offset, offsetMap.get(offset) + 1);
            } else {
                offsetMap.put(offset, 1);
            }
        }
        for (int j = 0; j < datas.length(); j++) {
            int offset = key.charAt(j) - 'A';
            if (!offsetMap.containsKey(offset)) {
                return false;
            }
            if (offsetMap.get(offset) > 0) {
                offsetMap.put(offset, offsetMap.get(offset) - 1);
            } else {
                return false;
            }
        }
        return true;
    }


}
