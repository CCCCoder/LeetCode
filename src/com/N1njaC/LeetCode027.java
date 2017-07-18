package com.N1njaC;

/**
 * Created by N1njaC on 2017/7/13.
 */
public class LeetCode027 {
    public int removeElement(int[] nums, int val) {

        /*
        思想就是从数组的第一个元素开始与val进行比较，如果相等的话，将数组最后一位的值赋给这个值，然后让pointer减一
        也就是只要与val相同的话，相当于数组的size就减小一个，每次都是将从数组的末尾的值赋值到前面然后和val进行比较。
        如果不想等的话，i++，该值保留，从下一个开始重复。
         */

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int pointer = nums.length - 1;
        //3，2，2，3   3
        while (i <= pointer) {
            if (nums[i] == val) {
                nums[i] = nums[pointer];
                pointer--;
            } else {
                i++;
            }
        }

        return pointer + 1;
    }

    public static void main(String[] args) {

        System.out.println(new LeetCode027().removeElement(new int[]{3, 2, 2, 3}, 3));
    }
}
