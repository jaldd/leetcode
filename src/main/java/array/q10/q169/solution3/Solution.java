package array.q10.q169.solution3;

import java.util.Random;

public class Solution {

    public int majorityElement(int[] nums) {
        int length = nums.length;

        Random random = new Random();
        while (true) {
            int res = nums[random.nextInt(length)];
            int sum = count(nums, res);
            if (sum > length / 2) {
                return res;
            }
        }
    }

    private int count(int[] nums, int res) {
        int count = 0;
        for (int num : nums) {
            if (num == res) {
                count++;
            }
        }
        return count;
    }

//
//    private int randRange(Random rand, int min, int max) {
//        return rand.nextInt(max - min) + min;
//    }
//
//    private int countOccurences(int[] nums, int num) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == num) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public int majorityElement(int[] nums) {
//        Random rand = new Random();
//
//        int majorityCount = nums.length / 2;
//
//        while (true) {
//            int candidate = nums[randRange(rand, 0, nums.length)];
//            if (countOccurences(nums, candidate) > majorityCount) {
//                return candidate;
//            }
//        }
//    }
}