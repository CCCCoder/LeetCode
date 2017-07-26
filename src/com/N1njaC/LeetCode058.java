package com.N1njaC;

/**
 * Created by N1njaC on 2017/7/26.
 */
public class LeetCode058 {

    public int lengthOfLastWord(String s) { 
        if (s == null) return 0;
        int length = 0;
        char[] chars = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (length == 0) {
                if (chars[i] == ' ') {
                    continue;
                } else {
                    length++;
                }
            } else {
                if (chars[i] == ' ') {
                    break;
                } else {
                    length++;
                }
            }
        }

        return length;
    }


    public static void main(String[] args){

        System.out.println(new LeetCode058().lengthOfLastWord("Hello"));
    }
}
