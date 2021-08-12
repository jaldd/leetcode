package array.q1.q27.low;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int length = nums.length;
        for (int right = 0; right < length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

}
