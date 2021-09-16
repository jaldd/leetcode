package array.q8.qyhtriangle.q119.solution1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> pre = new ArrayList<>();

        for (int i = 0; i < rowIndex; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                    continue;
                }
                row.add(pre.get(j - 1) + pre.get(j));
            }

            pre = row;

        }

        return pre;

    }
}
