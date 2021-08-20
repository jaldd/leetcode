package array.q8.q118.solution1;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    row.add(1);
                    continue;
                }
                row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }

            res.add(row);
        }

        return res;
    }

}
