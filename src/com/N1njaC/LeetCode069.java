package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/1.
 */
public class LeetCode069 {

    public int mySqrt(int x) {

        if (x == 0) return 0;
        int left = 1, right = Integer.MAX_VALUE;

        while (true) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid;
            } else {
                if ((mid + 1) > x / (mid + 1)) {
                    return mid;
                } else {
                    left = mid + 1;
                }
            }
        }

    }

    public static void main(String[] args) {

        System.out.println(new LeetCode069().mySqrt(10));
    }
}
