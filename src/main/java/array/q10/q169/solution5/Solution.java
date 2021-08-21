package array.q10.q169.solution5;

public class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                current = nums[i];
            }

            count = (current == nums[i]) ? ++count : --count;

        }
        return current;
    }
}