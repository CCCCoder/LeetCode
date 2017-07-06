package com.N1njaC;

/**
 * Created by N1njaC on 2017/7/6.
 */
public class LeetCode013 {

    /*
    Given a roman numeral, convert it to an integer.
    Input is guaranteed to be within the range from 1 to 3999.
     */
    public int romanToInt(String s) {

        int result = 0;
        int prevNum = 0;
        char[] chars = s.toCharArray();
        //为什么i从后面开始呢，是因为当后面比前面大的时候，是减法，从后面开始保证结果是正的。
        for (int i = chars.length - 1; i >= 0; i--) {
            switch (chars[i]) {
                case 'I':
                    if (1 < prevNum) {
                        result -= 1;
                    } else {
                        result += 1;
                    }
                    prevNum = 1;

                    break;
                case 'V':
                    if (5 < prevNum) {
                        result -= 5;
                    } else {
                        result += 5;
                    }
                    prevNum = 5;
                    break;
                case 'X':
                    if (10 < prevNum) {
                        result -= 10;
                    } else {
                        result += 10;
                    }
                    prevNum = 10;
                    break;
                case 'L':
                    if (50 < prevNum) {
                        result -= 50;
                    } else {
                        result += 50;
                    }
                    prevNum = 50;
                    break;

                case 'C':
                    if (100 < prevNum) {
                        result -= 100;
                    } else {
                        result += 100;
                    }
                    prevNum = 100;
                    break;

                case 'D':
                    if (500 < prevNum) {
                        result -= 500;
                    } else {
                        result += 500;
                    }
                    prevNum = 500;
                    break;
                case 'M':
                    if (1000 < prevNum) {
                        result -= 1000;
                    } else {
                        result += 1000;
                    }
                    prevNum = 1000;
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LeetCode013 leetCode013 = new LeetCode013();
        System.out.println(leetCode013.romanToInt("IV"));
    }
}
