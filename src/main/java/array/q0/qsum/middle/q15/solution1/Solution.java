package array.q0.qsum.middle.q15.solution1;

import java.util.*;

public class Solution {

    public List<int[]> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<int[]> list = new ArrayList<>();
        int left = 0, right = nums.length - 1;
        while (left < right) {

            left++;

            right--;
        }

        return list;
    }
}