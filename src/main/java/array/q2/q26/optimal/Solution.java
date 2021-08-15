package array.q2.q26.optimal;

public class Solution {
    public int removeDuplicates(int[] nums) {

        int length = nums.length;
        if (length <= 1) {
            return length;
        }
        int low = 1, fast = 1;
        while (fast < length) {
            if (nums[fast] != nums[low - 1]) {
                nums[low] = nums[fast];
                low++;
            }
            fast++;
        }
        return low;
    }
}