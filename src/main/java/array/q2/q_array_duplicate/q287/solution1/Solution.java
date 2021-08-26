package array.q2.q_array_duplicate.q287.solution1;

public class Solution {

    public int findDuplicate(int[] nums) {

        int l = 0, r = nums.length;

        while (l < r) {

            int mid = (l + r - 1) / 2;
            int cnt = 0;

            for (int num : nums) {
                if (num <= mid) {
                    cnt++;
                }
            }

            if (cnt <= mid) {
                l = mid + 1;
            } else {
                r = mid;
            }

        }

        return r;

//        int length = nums.length;
//        int l = 0, r = length - 1, res = 0;
//
//        while (l <= r) {
//
//            int mid = (l + r) / 2;
//            int cnt = 0;
//            for (int i = 0; i < length; ++i) {
//                if (nums[i] <= mid) {
//                    cnt++;
//                }
//            }
//
//            if (cnt <= mid) {
//                l = mid + 1;
//            } else {
//                r = mid - 1;
//                res = mid;
//            }
//
//        }
//
//        return res;
    }
}