package l2025.l09.l04;

import java.util.Arrays;

public class MergeIntervalsTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // 测试用例1：基本重叠区间合并
        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result1 = solution.merge(intervals1);
        System.out.println("测试用例1:");
        System.out.println("输入: [[1,3],[2,6],[8,10],[15,18]]");
        System.out.println("输出: " + Arrays.deepToString(result1));
        // 预期输出: [[1,6],[8,10],[15,18]]
        
        // 测试用例2：相邻区间合并
        int[][] intervals2 = {{1,4},{4,5}};
        int[][] result2 = solution.merge(intervals2);
        System.out.println("\n测试用例2:");
        System.out.println("输入: [[1,4],[4,5]]");
        System.out.println("输出: " + Arrays.deepToString(result2));
        // 预期输出: [[1,5]]
        
        // 测试用例3：无重叠区间
        int[][] intervals3 = {{1,2},{3,4},{5,6}};
        int[][] result3 = solution.merge(intervals3);
        System.out.println("\n测试用例3:");
        System.out.println("输入: [[1,2],[3,4],[5,6]]");
        System.out.println("输出: " + Arrays.deepToString(result3));
        // 预期输出: [[1,2],[3,4],[5,6]]
        
        // 测试用例4：包含关系
        int[][] intervals4 = {{1,10},{2,6},{8,10},{15,18}};
        int[][] result4 = solution.merge(intervals4);
        System.out.println("\n测试用例4:");
        System.out.println("输入: [[1,10],[2,6],[8,10],[15,18]]");
        System.out.println("输出: " + Arrays.deepToString(result4));
        // 预期输出: [[1,10],[15,18]]
        
        // 测试用例5：空数组
        int[][] intervals5 = {};
        int[][] result5 = solution.merge(intervals5);
        System.out.println("\n测试用例5:");
        System.out.println("输入: []");
        System.out.println("输出: " + Arrays.deepToString(result5));
        // 预期输出: []
        
        // 测试用例6：单个区间
        int[][] intervals6 = {{1,3}};
        int[][] result6 = solution.merge(intervals6);
        System.out.println("\n测试用例6:");
        System.out.println("输入: [[1,3]]");
        System.out.println("输出: " + Arrays.deepToString(result6));
        // 预期输出: [[1,3]]
    }
}
