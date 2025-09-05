package l2025.l09.l05;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {

    public static void main(String[] args) {

        Solution solution = new Solution();

        // 基本测试
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        Assert.assertEquals(49, solution.maxArea(height1));

        int[] height2 = {1,1};
        Assert.assertEquals(1, solution.maxArea(height2));

        // 边界测试
        int[] height3 = {1,2,3,4,5};
        Assert.assertEquals(6, solution.maxArea(height3));

        int[] height4 = {5,4,3,2,1};
        Assert.assertEquals(6, solution.maxArea(height4));

        // 特殊情况
        int[] height5 = {10,1,1,1,1,1,1,1,10};
        Assert.assertEquals(80, solution.maxArea(height5));
    }

}
