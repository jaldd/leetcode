package array.q13.qjump.middle.q55.solution1;

public class Solution {

    public boolean canJump(int[] nums) {

        int length = nums.length;
        int maxR = 0;
        for (int i = 0; i < length; i++) {

            if (i <= maxR) {
                maxR = Math.max(maxR, i + nums[i]);
                if (maxR >= length) {
//                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}