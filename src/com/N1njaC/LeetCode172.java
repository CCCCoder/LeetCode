package com.N1njaC;

/**
 * Created by N1njaC on 2017/9/13.
 */
public class LeetCode172 {

    public int trailingZeroes(int n) {

        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }

}
