package array.q15.waterhold.hard.q42.solution1;

public class Solution {

    public int trap(int[] height) {

        int res = 0;
        int length = height.length;

        for (int i = 1; i < length; i++) {

            int max_left = 0, max_right = 0;
            for (int j = i; j >= 0; j--) {
                max_left = Math.max(max_left, height[j]);
            }

            for (int j = i; j < length; j++) {
                max_right = Math.max(max_right, height[j]);
            }

            res += Math.min(max_left, max_right) - height[i];
        }
        return res;
    }
}
