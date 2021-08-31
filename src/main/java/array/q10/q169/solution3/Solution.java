package array.q10.q169.solution3;

import java.util.Random;

public class Solution {

    public int majorityElement(int[] nums) {

        int length = nums.length;
        Random random = new Random();

        while (true) {

            int res = nums[random.nextInt(length)];
            int sum = count(nums, res);
            if (sum > length / 2) {
                return res;
            }
        }
    }

    private int count(int[] nums, int res) {

        int count = 0;
        for (int num : nums) {
            if (num == res) {
                count++;
            }
        }
        return count;
    }

}