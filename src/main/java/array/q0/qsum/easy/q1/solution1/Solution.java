package array.q0.qsum.easy.q1.solution1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int min = target - num;
            if (map.containsKey(min)) {
                return new int[]{map.get(min), i};
            }
            map.put(num, i);
        }
        return new int[]{};
    }
}