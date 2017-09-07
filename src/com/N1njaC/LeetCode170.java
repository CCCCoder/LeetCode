package com.N1njaC;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by N1njaC on 2017/9/6.
 */
public class LeetCode170 {

    Map<Integer, Integer> integerMap = new HashMap<>();

    public void add(int num) {
        if (!integerMap.containsKey(num)) {
            integerMap.put(num, 1);
        } else {
            integerMap.put(num, num + 1);
        }
    }

    public boolean find(int target) {

        for (Map.Entry<Integer, Integer> entry :
                integerMap.entrySet()) {
            int num = entry.getKey();
            int y = target - num;

            if (y == num) {
                if (integerMap.get(y) == num + 1) return true;
            }else if (integerMap.containsKey(y)){
                return true;
            }
        }

        return false;
    }

}
