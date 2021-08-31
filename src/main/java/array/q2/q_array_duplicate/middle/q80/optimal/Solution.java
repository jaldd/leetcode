package array.q2.q_array_duplicate.middle.q80.optimal;

public class Solution {

    public int removeDuplicates(int[] nums) {

        int length = nums.length;
        if (length <= 2) {
            return length;
        }
        int low = 2, fast = 2;

        while (fast < length) {
            if (nums[low - 2] != nums[fast]) {
                nums[low] = nums[fast];
                low++;
            }
            fast++;
        }
        return low;
    }
}