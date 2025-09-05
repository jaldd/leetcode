package l2025.l09.l05;

//盛最多水的容器 (Container With Most Water)

public class Solution {
    public int maxArea(int[] height) {

        int max = 0;

        if (height.length <= 1) return 0;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = 1; j < height.length; j++) {
                max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return max;
    }
}