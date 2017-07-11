package com.N1njaC;

/**
 * Created by N1njaC on 2017/7/7.
 * question:
 * 编写一个函数来查找字符串数组中最长的公共前缀字符串。
 */
public class LeetCode014 {

    /*
     思路：从第一个开始，将第一个数作为标准，从第二个数开始一直到最后依次和他比较。
     */

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            //每一次比较之后生成的prefix作为下次比较的对象！
            //细节1：每次比较完成之后生成的前缀串来和下一个数进行比较。j的值不能超过两者中的长度短的长度。
            while (j < strs[i].length() && j < prefix.length() && strs[i].charAt(j) == prefix.charAt(j)) {
                j++;
            }
            if (j == 0) {
                return "";
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }

    public static void main(String[] args) {
        LeetCode014 leetCode014 = new LeetCode014();
        String[] strs = {"aaa","aa","aaa"};
        System.out.println(leetCode014.longestCommonPrefix(strs));
    }
}
