package n2025.y209;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int length = nums.length;
        if (length == 0) return 0;
        int l = 0;
        int maxLen = Integer.MAX_VALUE;
        int windowSum = 0;
        for (int i = 0; i < length; i++) {

            windowSum += nums[i];
            while (windowSum >= target) {

                maxLen = Math.min(maxLen, i - l + 1);
                windowSum -= nums[l];
                l++;

            }

        }

        return maxLen == Integer.MAX_VALUE ? 0 : maxLen;
    }
}