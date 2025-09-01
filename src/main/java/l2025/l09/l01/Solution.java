package l2025.l09.l01;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int mm = target - nums[i];
            if (sm.containsKey(mm)) {
                return new int[]{sm.get(mm), i};
            }

            sm.put(nums[i], i);
        }
        return new int[]{};
    }
}