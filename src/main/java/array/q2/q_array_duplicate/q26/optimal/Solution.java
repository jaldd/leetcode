package array.q2.q_array_duplicate.q26.optimal;

public class Solution {
    public int removeDuplicates(int[] nums) {

        int length = nums.length;
        if (length <= 1) {
            return length;
        }
        int low = 1, fast = 1;
        while (fast < length) {
            if (nums[low - 1] != nums[fast]) {
                nums[low] = nums[fast];
                low++;
            }
            fast++;
        }
        return low;
    }
}