package com.N1njaC;

/**
 * Created by N1njaC on 2017/7/24.
 */
public class LeetCode053 {

    public int maxSubArray(int[] nums) {

        int max = nums[0];

        if (nums.length == 0 || nums == null) {
            return 0;
        } else {
            int sum = nums[0] > 0 ? nums[0] : 0;
            for (int i = 1; i < nums.length; i++) {
                sum += nums[i];
                if (sum > max) {
                    max = sum;
                }
                if (sum < 0) {
                    sum = 0;
                }
            }
            return max;
        }

//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//        //和为负数的时候直接归0
//        for (int i = 0; i < nums.length; i++) {
//
//            sum += nums[i];
//            max = Math.max(max, sum);
//            sum = Math.max(sum, 0);
//        }
//        return max;

    }

    public static void main(String[] args) {

        System.out.println(new LeetCode053().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
