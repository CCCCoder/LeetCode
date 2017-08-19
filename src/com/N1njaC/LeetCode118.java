package com.N1njaC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by N1njaC on 2017/8/17.
 */
public class LeetCode118 {

    public List<List<Integer>> generate(int numRow) {
        List<List<Integer>> allRow = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRow; i++) {
            row.add(0, 1);

            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }

            allRow.add(new ArrayList<>(row));

        }

        return allRow;
    }
    

}
