package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/30.
 */
public class LeetCode168 {

    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n / 26) + (char) ('A' + (n % 26));
    }

    public static void main(String[] args) {

        System.out.println(new LeetCode168().convertToTitle(729));
    }
}
