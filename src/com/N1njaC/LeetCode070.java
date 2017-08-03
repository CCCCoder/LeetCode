package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/2.
 */
public class LeetCode070 {

    public int climbStairs(int n) {

        if (n == 1) return 1;

        int[] ways = new int[n];
        ways[0] = 1;
        ways[1] = 2;
        for (int i = 2; i < n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        return ways[n-1];
    }

    public static void main(String[] args) {

        System.out.println(new LeetCode070().climbStairs(5));
    }
}
