package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/19.
 */
public class LeetCode122 {

    public int maxProfit(int[] prices) {
        //1,3,4,7
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                total += prices[i + 1] - prices[i];
            }
        }
        return total;
    }
}
