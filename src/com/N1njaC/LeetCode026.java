package com.N1njaC;

/**
 * Created by N1njaC on 2017/7/12.
 */
public class LeetCode026 {
    /*  Remove Duplicates from Sorted Array
    Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
    Do not allocate extra space for another array, you must do this in place with constant memory.

    For example,
    Given input array nums = [1,1,2],
    Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
    It doesn't matter what you leave beyond the new length.

     */

    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        //核心思想就是，当数组的数有重复的时候，size不变，直到下一个不重复的数值，然后直接替换掉重复的数值。
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[size]) {
                nums[++size] = nums[i];
            }
        }
        return size + 1;
    }

    public static void main(String[] args) {

        System.out.println(new LeetCode026().removeDuplicates(new int[]{1,1,1,1,2,2,2,3}));
    }
}
