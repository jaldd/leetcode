package array.q9.q119.solution2;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i < rowIndex; i++) {
            row.add(row.get(i - 1) * (rowIndex - i + 1) / i);
        }

        return row;

    }

}