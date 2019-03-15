package com.llg.Algorithm.String;

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
     * 时间复杂度O(n)
     */
    public static boolean searchBorStr(String datas, String key) {
        if (datas.length() != key.length()) {//长度不相同返回false
            return false;
        }
        if (datas.equals("") || key.equals("")) {
            return false;
        }
        int[] hash = new int[26];
        for (int i = 0;i<datas.length();i++) {
            ++hash[datas.charAt(i)-'A'];
            --hash[key.charAt(i)-'A'];
        }
        for (int index:hash){
            if (index != 0){
                return false;
            }
        }
        return true;
    }


}
