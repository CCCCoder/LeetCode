package com.N1njaC;

/**
 * Created by huanglei on 2017/7/19.
 */
public class LeetCode028 {

    public int strStr(String haystack, String needle) {

        if (haystack == null || needle == null) {
            return -1;
        }

        //思想就是母串的第一位和字串的第一位开始比较，如果不相等，则从母串+1又重新开始比较；如果相等，母串不变，字串+1
        //开始比较。

        //i的范围为母串减子串的长度加一时为了防止字串比母串长。
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j = 0;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    //当不等于的时候，直接跳出j的for循环，让i+1，也就是母串的下一位开始比较
                    break;
                }
            }
            //aaaaaaabbc    bbc
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode028().strStr("abc","c"));
    }
}
