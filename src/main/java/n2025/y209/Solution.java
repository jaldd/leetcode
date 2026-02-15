package n2025.y209;

public class Solution {

    public int minSubArrayLen(int target, int[] nums) {

        int length = nums.length;
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for (int right = 0; right < length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int i = new Solution().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        System.out.println(i);
    }
}