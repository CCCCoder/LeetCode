package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/29.
 */
public class LeetCode167 {
    public int[] twoSum(int[] numbers, int target) {

        int[] solution = new int[2];
        if (numbers == null || numbers.length < 2) return solution;

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int v = numbers[left] + numbers[right];
            if (v == target) {
                solution[0] = left + 1;
                solution[1] = right + 1;
            } else if (v < target) {
                left++;
            } else {
                right--;
            }
        }
        return solution;
    }
}
