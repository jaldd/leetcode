package l2025.l09.l18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > target && nums[i] > 0) {
                break;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if (nums[i] + nums[j] > target && nums[i] + nums[j] > 0) {
                    break;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum =(long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left + 1] == nums[left]) {
                            left++;
                        }
                        while (left < right && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }

                }
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};

        System.out.println(new Solution().fourSum(nums, 0));
        int[] nums1 = new int[]{2, 2, 2, 2, 2};

        System.out.println(new Solution().fourSum(nums1, 8));
    }
}