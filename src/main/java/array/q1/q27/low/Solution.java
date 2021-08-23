package array.q1.q27.low;

public class Solution {

    public int removeElement(int[] nums, int val) {

        int left = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }

}
