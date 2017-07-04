package com.N1njaC;

import java.util.Stack;

/**
 * Created by N1njaC on 2017/7/4.
 */
public class LeetCode007 {

    /*
    question:
    Reverse digits of an integer.
     Example1: x = 123, return 321
     Example2: x = -123, return -321
     */

    //32-bit integer :- 2^31 <= n < 2^31
    public int reverse(int x) {
        int head = x / 10;
        int tail = x % 10;
        int result = 0;

        //尾数总是取head的最后一位，一次取一个，然后再让head/10，减小head的位数。
        while (head != 0 || tail != 0) {
            result = result * 10 + tail;
            tail = head % 10;
            head = head / 10;
        }

        result = x < Integer.MIN_VALUE ? 0 : result;
        result = x > Integer.MAX_VALUE ? 0 : result;

        return (int)result;

    }

    public static void main(String[] args) {
        LeetCode007 leetCode007 = new LeetCode007();
        System.out.println(leetCode007.reverse(1235434243));
    }
}
