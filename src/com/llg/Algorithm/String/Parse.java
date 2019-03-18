package com.llg.Algorithm.String;

public class Parse {

    /**
     * String 转成 int
     * @param s    “1233234”
     * @return      1233234
     */
    public static int parseInt(String s){
        char[] c = s.toCharArray();
        int ret = 0;
        for (char aC : c) {
            int num = aC - '0';
            if (num < 0 || num > 9) {
                throw new IllegalArgumentException("can't parse ");
            }
            ret = num + ret * 10;
        }
        return ret;
    }
}
