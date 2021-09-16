package array.q15.waterhold.hard.q42.solution2;

public class Solution {

    public int trap(int[] height) {

        int length = height.length;
        int res = 0;
        int[] minArr = new int[length];
        int[] maxArr = new int[length];

        minArr[0] = height[0];
        maxArr[length - 1] = height[length - 1];

        for (int i = length - 2; i >= 0; i--) {
            maxArr[i] = Math.max(maxArr[i + 1], height[i]);
        }

        for (int i = 1; i < length; i++) {
            minArr[i] = Math.max(minArr[i - 1], height[i]);
            res += Math.min(maxArr[i], minArr[i]) - height[i];
        }
//
//        for (int i = 0; i < length; i++) {
//        }

        return res;
    }
}
