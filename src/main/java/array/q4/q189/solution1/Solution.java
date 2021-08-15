package array.q4.q189.solution1;

class Solution {
    public void rotate(int[] nums, int k) {
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArr[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, nums.length);
    }
}