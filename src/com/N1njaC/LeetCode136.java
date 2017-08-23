package com.N1njaC;


/**
 * Created by N1njaC on 2017/8/23.
 */
public class LeetCode136 {

    public int singleNumber(int[] nums) {

        //异或运算 相同为0不同为1

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(new LeetCode136().singleNumber(new int[]{1, 1, 2}));
    }

}
