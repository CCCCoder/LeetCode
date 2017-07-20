package com.N1njaC;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by N1njaC on 2017/7/20.
 */
public class LeetCode035 {

    public int searchInsert(int[] nums, int target) {

        Queue<Integer> integerQueue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            integerQueue.add(nums[i]);
        }
        System.out.println("zz"+integerQueue.size());

        for (int i = 0; i < nums.length; i++) {

            if (integerQueue.poll() >= target) {
                return i ;
            }
        }
        return nums.length;

    }

    public static void main(String[] args) {

        System.out.println(new LeetCode035().searchInsert(new int[]{1,3},2));
    }
}
