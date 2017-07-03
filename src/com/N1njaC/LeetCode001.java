package com.N1njaC;

import java.util.HashMap;
import java.util.Map;

public class LeetCode001 {


    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //把数组的值作为map的key，然后通过比较是否包含此key来确定下标。
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int otherNum = target - nums[i];
            //这里map.get(otherNum))不会报NPE，因为如果没有key的话返回null
            if (map.containsKey(otherNum) && i != map.get(otherNum)) {

                return new int[]{i,map.get(otherNum)};
            }
        }
        return a;
    }

    public static void main(String[] args) {
        LeetCode001 solution = new LeetCode001();
        int[] test= solution.twoSum(new int[]{2, 7, 11, 15}, 9);

    }
}