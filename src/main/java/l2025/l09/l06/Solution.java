package l2025.l09.l06;

public class Solution {
    public int minPathSum(int[][] grid) {

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];

        dp[0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + grid[0][i];
        }

        for (int i = 1; i < m; i++) {
            dp[0] = dp[0] + grid[i][0];
            for (int j = 1; j < n; j++) {
                dp[j] = Math.min(dp[j], dp[j - 1]) + grid[i][j];
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 测试用例1: 题目示例
        int[][] grid1 = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.println("测试用例1:");
        System.out.println("输入: [[1,3,1],[1,5,1],[4,2,1]]");
        System.out.println("输出: " + solution.minPathSum(grid1));
        System.out.println("期望: 7");
        System.out.println("路径: 1→3→1→1→1");
        System.out.println();

        // 测试用例2: 另一个示例
        int[][] grid2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("测试用例2:");
        System.out.println("输入: [[1,2,3],[4,5,6]]");
        System.out.println("输出: " + solution.minPathSum(grid2));
        System.out.println("期望: 12");
        System.out.println("路径: 1→2→3→6");
        System.out.println();

        // 测试用例3: 单行网格
        int[][] grid3 = {
                {1, 2, 3, 4, 5}
        };
        System.out.println("测试用例3:");
        System.out.println("输入: [[1,2,3,4,5]]");
        System.out.println("输出: " + solution.minPathSum(grid3));
        System.out.println("期望: 15");
        System.out.println("路径: 1→2→3→4→5");
        System.out.println();

        // 测试用例4: 单列网格
        int[][] grid4 = {
                {1},
                {2},
                {3},
                {4}
        };
        System.out.println("测试用例4:");
        System.out.println("输入: [[1],[2],[3],[4]]");
        System.out.println("输出: " + solution.minPathSum(grid4));
        System.out.println("期望: 10");
        System.out.println("路径: 1→2→3→4");
        System.out.println();

        // 测试用例5: 单个元素
        int[][] grid5 = {
                {5}
        };
        System.out.println("测试用例5:");
        System.out.println("输入: [[5]]");
        System.out.println("输出: " + solution.minPathSum(grid5));
        System.out.println("期望: 5");
        System.out.println();

        // 测试用例6: 较大网格
        int[][] grid6 = {
                {1, 4, 8, 3},
                {2, 1, 5, 2},
                {6, 3, 1, 7},
                {3, 2, 4, 1}
        };
        System.out.println("测试用例6:");
        System.out.println("输入: [[1,4,8,3],[2,1,5,2],[6,3,1,7],[3,2,4,1]]");
        System.out.println("输出: " + solution.minPathSum(grid6));
        System.out.println("期望: 13");
        System.out.println("路径: 1→2→1→3->1→4→1");
        System.out.println();
    }
}