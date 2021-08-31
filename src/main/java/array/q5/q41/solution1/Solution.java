package array.q5.q41.solution1;

public class Solution {

    public int firstMissingPositive(int[] nums) {

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] <= 0) {
                nums[i] = length + 1;
            }
        }

        for (int i = 0; i < length; i++) {
            if (nums[i] <= length) {
                nums[nums[i] - 1] = -nums[nums[i] - 1];
            }
        }

        for (int i = 0; i < length; i++) {

            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return length + 1;


//        int n = nums.length;
//        for (int i = 0; i < n; ++i) {
//            if (nums[i] <= 0) {
//                nums[i] = n + 1;
//            }
//        }
//        for (int i = 0; i < n; ++i) {
//            int num = Math.abs(nums[i]);
//            if (num <= n) {
//                nums[num - 1] = -Math.abs(nums[num - 1]);

//        nums[nums[i] - 1] = -nums[nums[i] - 1];
//            }
//        }
//        for (int i = 0; i < n; ++i) {
//            if (nums[i] > 0) {
//                return i + 1;
//            }
//        }
//        return n + 1;


    }
}