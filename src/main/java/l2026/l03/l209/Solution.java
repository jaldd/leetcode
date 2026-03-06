package l2026.l03.l209;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            while (sum >= target) {
                int currentLen = i - left + 1;
                minLen = Math.min(minLen, currentLen);
                sum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}