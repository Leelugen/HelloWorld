package com.llg;


import com.llg.Algorithm.Sort.Sort;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HelloWorld {
    public static void main(String[] args) {

        /** ag string contain**/
//        Contain contain = new Contain();
//        Boolean ret = Contain.searchBorStr("AB","BAA");
//        System.out.println("a contain B ????"+ret);

        //       System.out.println(Parse.parseInt("3455554")+"======");


//        int[] data =new int[]{4,7,8,9,1,2,1,43,111111111,112,112,32,32,232133,43,31,-1,};
//        Sort.insertBinarySort(data);
//
//        System.out.println(Arrays.toString(data));
        /** dp builder **/
//        Builder builder = new MacBookBuilder();
//        Director pcDirector = new Director(builder);
//        pcDirector.construct("Intel 8700K","SumSung");
//        System.out.println("Computer　Info===="+ builder.create().toString());

        /** dp prototype**/
//        LoginImpl login = new LoginImpl();
//        login.login();
//        User curUser = LoginSession.getLoginSession().getLoginedUser();
//        //curUser.address = new Address("city","district","street");
//        curUser.address.street = "fixed";
//        System.out.println(LoginSession.getLoginSession().getLoginedUser());
//        System.out.println(curUser);

//        try {
//            testException();
//        }catch (Exception e){
//            System.out.println("Error!!!");
//        }
//        String s = "\\xe5\\xb0\\x8f\\xad\\xe7\\xb1\\xb3\\xe6\\x89\\x8b\\xe6\\x9c\\xba";
//        String e = "0x3330x545"
//        char[] as = new char[]{'\\','x','e','5'};
//        char at[] =new char[23];
//
//        try {
//            decodeX(s);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        String timeZone = "GMT-7:30";
//        String[] split = timeZone.split("GMT");
//        System.out.println(split.length+split[1]+split[1].charAt(0));
//        ;
//        String s = "e5b08fe7b1b3e6898be69cba";



//        System.out.println(str2HexStr("小米手机"));


//        System.out.println(unicode);
//        System.out.println(hexStr2Str(unicode));
//        System.out.println(stringToUnicode("小米手机"));

        HashMap<String,String> map = new HashMap<>();
        map.put("k1","v1");
        map.put("k2","v2");
        map.put("k3","v3");
        map.put("k1vvv","v1");
        map.put("k2vvv","v2");
        map.put("k3vvv","v3");
        map.put("k1vvvs","v1");
        map.put("k2vvvs","v2");
        map.put("k3vvvs","v3");
        map.put("k1vvvsb","v1");
        map.put("k2vvvsb","v2");
        map.put("k3vvvsb","v3");
        map.put("k1vvvst","v1");
        map.put("k2vvvst","v2");
        map.put("k3vvvst","v3");

        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
        }
    }

    /**
     * 字符串转unicode
     *
     * @param str
     * @return
     */
    public static String stringToUnicode(String str) {
        StringBuffer sb = new StringBuffer();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            sb.append("\\u" + Integer.toHexString(c[i]));
        }
        return sb.toString();
    }

    /**
     * unicode转字符串
     *
     * @param unicode
     * @return
     */
    public static String unicodeToString(String unicode) {
        StringBuffer sb = new StringBuffer();
        String[] hex = unicode.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            int index = Integer.parseInt(hex[i], 16);
            sb.append((char) index);
        }
        return sb.toString();
    }


    public static void decodeX(String s) {
        String s1 = s.replaceAll("\\\\x", "%");
        String decode = null;
        try {
            decode = URLDecoder.decode(s1, "utf-8");
        } catch (UnsupportedEncodingException e) {

        }
        System.out.println(decode);
    }

    public static String toStringHex2(String s) {
        byte[] baKeyword = new byte[s.length() / 2];
        for (int i = 0; i < baKeyword.length; i++) {
            try {
                baKeyword[i] = (byte) (0xff & Integer.parseInt(s.substring(
                        i * 2, i * 2 + 2), 16));
            } catch (Exception e) {
                return s;
            }
        }
        try {
            s = new String(baKeyword, "utf-8");// UTF-16le:Not
        } catch (Exception e1) {
            return s;
        }
        return s;

    }


    public static String decode(String s) {



        char[] chars = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        byte[] bs = s.getBytes();
        char bit;
        for (byte b : bs) {
            bit = (char) ((b & 0x0f0) >> 4);

            sb.append(bit);
            bit = (char) (b & 0x0f);
            sb.append(bit);
            sb.append(' ');
        }

//        boolean needToChange = false;
        int numChars = s.length();
//        StringBuffer sb = new StringBuffer(numChars > 500 ? numChars / 2 : numChars);
        int i = 0;

//        if (enc.length() == 0) {
//            throw new UnsupportedEncodingException("URLDecoder: empty string enc parameter");
//        }

        char c;
        char[] bytes = null;
        while (i < numChars) {
            c = s.charAt(i);
            switch (c) {
//                case '+':
////                    sb.append(' ');
//                    i++;
////                    needToChange = true;
//                    break;
                case '%':
                    /*
                     * Starting with this instance of %, process all
                     * consecutive substrings of the form %xy. Each
                     * substring %xy will yield a byte. Convert all
                     * consecutive  bytes obtained this way to whatever
                     * character(s) they represent in the provided
                     * encoding.
                     */

                    try {

                        // (numChars-i)/3 is an upper bound for the number
                        // of remaining bytes
                        if (bytes == null)
                            bytes = new char[(numChars - i) / 3];
                        int pos = 0;

                        while (((i + 2) < numChars) &&
                                (c == '%')) {
                            int v = Integer.parseInt(s.substring(i + 1, i + 3), 16);
                            if (v < 0)
                                throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - negative value");
                            bytes[pos++] = (char) v;
                            i += 3;
                            if (i < numChars)
                                c = s.charAt(i);
                        }

                        // A trailing, incomplete byte encoding such as
                        // "%x" will cause an exception to be thrown

                        if ((i < numChars) && (c == '%'))
                            throw new IllegalArgumentException(
                                    "URLDecoder: Incomplete trailing escape (%) pattern");

//                        sb.append(new String(bytes, 0, pos, enc));
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException(
                                "URLDecoder: Illegal hex characters in escape (%) pattern - "
                                        + e.getMessage());
                    }
//                    needToChange = true;
                    break;
                default:
                    i++;
                    break;
            }
        }
        for (char b : bytes) {

            System.out.print(b);
        }

        return null;

    }


    /**
     * 2  * 字符串转换成为256A
     * 3  * @param str
     * 4  * @return
     * 5
     */
    public static String str2HexStr(String str) {
       char[] chars = "0123456789ABCDEF".toCharArray();
       StringBuilder sb = new StringBuilder("");
        byte[] bs = str.getBytes();
        char bit;
        for (byte b : bs) {
            bit = (char) ((b & 0x0f0) >> 4);

            sb.append(bit);
            bit = (char) (b & 0x0f);
            sb.append(bit);
            sb.append(' ');
        }
        return sb.toString().trim();
    }



    /**
     * 16进制直接转换成为字符串
     * @param hexStr
     * @return
     */
    public static String hexStr2Str(String hexStr) {
        String str = "0123456789ABCDEF";
        char[] hexs = hexStr.toCharArray();
        byte[] bytes = new byte[hexStr.length() / 2];
        int n;
        for (int i = 0; i < bytes.length; i++) {
            n = str.indexOf(hexs[2 * i]) * 16;
            n += str.indexOf(hexs[2 * i + 1]);
            bytes[i] = (byte) (n & 0xff);
            System.out.print(bytes[i]);
        }
        return null;
    }




    public static String str2XXX(String s){

        int numChars = s.length();
//        StringBuffer sb = new StringBuffer(numChars > 500 ? numChars / 2 : numChars);
        int i = 0;
        char c;
        char[] bytes = null;
        while (i < numChars) {
            c = s.charAt(i);
            switch (c) {
//                case '+':
////                    sb.append(' ');
//                    i++;
////                    needToChange = true;
//                    break;
                case '%':
                    /*
                     * Starting with this instance of %, process all
                     * consecutive substrings of the form %xy. Each
                     * substring %xy will yield a byte. Convert all
                     * consecutive  bytes obtained this way to whatever
                     * character(s) they represent in the provided
                     * encoding.
                     */

                    try {

                        // (numChars-i)/3 is an upper bound for the number
                        // of remaining bytes
                        if (bytes == null)
                            bytes = new char[(numChars - i) / 3];
                        int pos = 0;

                        while (((i + 2) < numChars) &&
                                (c == '%')) {
                            int v = Integer.parseInt(s.substring(i + 1, i + 3), 16);
                            if (v < 0)
                                throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - negative value");
                            bytes[pos++] = (char) v;
                            i += 3;
                            if (i < numChars)
                                c = s.charAt(i);
                        }

                        // A trailing, incomplete byte encoding such as
                        // "%x" will cause an exception to be thrown

                        if ((i < numChars) && (c == '%'))
                            throw new IllegalArgumentException(
                                    "URLDecoder: Incomplete trailing escape (%) pattern");

//                        sb.append(new String(bytes, 0, pos, enc));
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException(
                                "URLDecoder: Illegal hex characters in escape (%) pattern - "
                                        + e.getMessage());
                    }
//                    needToChange = true;
                    break;
                default:
                    i++;
                    break;
            }
        }
        for (char b : bytes) {

            System.out.print(b);
        }

        return null;


    }



}
