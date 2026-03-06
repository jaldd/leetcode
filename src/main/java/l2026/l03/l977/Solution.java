package l2026.l03.l977;

public class Solution {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int index = n - 1;
        int[] res = new int[n];
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                res[index] = leftSquare;
                left++;
            } else {
                res[index] = rightSquare;
                right--;
            }
            index--;
        }
        return res;
    }
}