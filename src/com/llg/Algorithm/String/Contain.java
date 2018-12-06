package com.llg.Algorithm.String;

import java.util.HashMap;

public class Contain {

    /**
     * A串中能否找到B串中包含的所有字符  如A"AAABBBCGRRGRGR" B"AAAA","ABBCCGGG“ true
     *
     * @param a
     * @param b
     * @return
     */

    // “最好的方法”，时间复杂度O(n + m)，空间复杂度O(1)
    public boolean StringContain(String a, String b) {
        int hash = 0;
        for (int i = 0; i < a.length(); ++i) {
            hash |= (1 << (a.charAt(i) - 'A'));
            System.out.println("hash" + hash);
        }
        for (int i = 0; i < b.length(); ++i) {
            if ((hash & (1 << (b.charAt(i) - 'A'))) == 0) {
                return false;
            }
        }
        return true;
    }


    //变位词
    //如果两个字符串的字符一样，但是顺序不一样，被认为是兄弟字符串，
    // 比如bad和adb即为兄弟字符串，现提供一个字符串，如何在字典中迅速找到它的兄弟字符串，请描述数据结构和查询过程。

    //字符的种类和数量都要相同，次序不定
    public boolean searchBorStr(String datas, String key) {
        if (datas.length() != key.length()) {
            return false;
        }
        if (datas.equals("") || key.equals("")) {
            return false;
        }
        HashMap<Integer, Integer> offsetMap = new HashMap<>();
        //   int hash = 0;
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
