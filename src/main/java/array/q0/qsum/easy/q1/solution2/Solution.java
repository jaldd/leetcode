package array.q0.qsum.easy.q1.solution2;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int next = target - num;
            if (map.containsKey(next)) {
                return new int[]{next, num};
            }
            map.put(num, next);
        }
        return new int[0];
    }
}