package l2025.l09.l08;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testGenerateMatrix() {
        // 测试用例1: n = 3
        testCase1();
        
        // 测试用例2: n = 1
        testCase2();
    }

    private void testCase1() {
        int[][] expected = new int[][]{
            {1, 2, 3},
            {8, 9, 4},
            {7, 6, 5}
        };
        
        Solution solution = new Solution();
        int[][] result = solution.generateMatrix(3);
        
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[0].length; j++) {
                Assert.assertEquals(expected[i][j], result[i][j]);
            }
        }
    }

    private void testCase2() {
        int[][] expected = new int[][]{{1}};
        
        Solution solution = new Solution();
        int[][] result = solution.generateMatrix(1);
        
        Assert.assertEquals(expected[0][0], result[0][0]);
    }
}
