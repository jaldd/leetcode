package array.q2.q_array_duplicate.q217.solution2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                return true;
            }
            list.add(num);
        }
        return false;
    }
};