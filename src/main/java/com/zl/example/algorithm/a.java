package com.zl.example.algorithm;

/**
 * 描述:
 * 项目名:java-ee
 *
 * @Author:ZENLIN
 * @Created 2019/3/1  11:29.
 */
public class a {

    static String x = "aacc";


    public static void main(String[] a) {
        String aChar = findChar(x);
        System.out.println("aChar = " + aChar);
    }

    /**
     * 获取一个字符串里面的第一个不是重复的元素的位置
     *
     * @param s
     * @return
     */
    public static String findChar(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (s.indexOf(chars[i]) == s.lastIndexOf(chars[i])) {
                return String.valueOf(chars[i]);
            }
        }
        return null;
    }

}