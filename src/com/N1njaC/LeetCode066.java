package com.N1njaC;

/**
 * Created by N1njaC on 2017/7/26.
 */
public class LeetCode066 {

    public int[] plusOne(int[] digits) {



        if (digits == null || digits.length == 0) return null;

        for (int i = digits.length - 1; i >= 0; i++) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newInt = new int[digits.length + 1];
        newInt[0] = 1;
        return newInt;
    }


    public static void main(String[] args) {

    }
}
