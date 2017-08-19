package com.N1njaC;



/**
 * Created by N1njaC on 2017/8/18.
 */
public class LeetCode121 {

    public int maxProfit(int[] prices) {

        int maxCur = 0;
        int maxSofar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSofar = Math.max(maxCur,maxSofar);
        }
        return maxSofar;
    }
}
