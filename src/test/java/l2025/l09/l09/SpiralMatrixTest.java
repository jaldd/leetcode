package l2025.l09.l09;

import java.util.Arrays;
import java.util.List;

public class SpiralMatrixTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // 测试用例1: 3x3矩阵
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        List<Integer> result1 = solution.spiralOrder(matrix1);
        System.out.println("测试用例1:");
        System.out.println("输入矩阵:");
        printMatrix(matrix1);
        System.out.println("螺旋遍历结果: " + result1);
        System.out.println("期望结果: [1, 2, 3, 6, 9, 8, 7, 4, 5]");
        System.out.println("验证通过: " + result1.equals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5)));
        System.out.println();
        
        // 测试用例2: 3x4矩阵
        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        List<Integer> result2 = solution.spiralOrder(matrix2);
        System.out.println("测试用例2:");
        System.out.println("输入矩阵:");
        printMatrix(matrix2);
        System.out.println("螺旋遍历结果: " + result2);
        System.out.println("期望结果: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]");
        System.out.println("验证通过: " + result2.equals(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)));
        System.out.println();
        
        // 测试用例3: 1x1矩阵
        int[][] matrix3 = {{1}};
        List<Integer> result3 = solution.spiralOrder(matrix3);
        System.out.println("测试用例3:");
        System.out.println("输入矩阵:");
        printMatrix(matrix3);
        System.out.println("螺旋遍历结果: " + result3);
        System.out.println("期望结果: [1]");
        System.out.println("验证通过: " + result3.equals(Arrays.asList(1)));
        System.out.println();
        
        // 测试用例4: 1x4矩阵（单行）
        int[][] matrix4 = {{1, 2, 3, 4}};
        List<Integer> result4 = solution.spiralOrder(matrix4);
        System.out.println("测试用例4:");
        System.out.println("输入矩阵:");
        printMatrix(matrix4);
        System.out.println("螺旋遍历结果: " + result4);
        System.out.println("期望结果: [1, 2, 3, 4]");
        System.out.println("验证通过: " + result4.equals(Arrays.asList(1, 2, 3, 4)));
        System.out.println();
        
        // 测试用例5: 4x1矩阵（单列）
        int[][] matrix5 = {{1}, {2}, {3}, {4}};
        List<Integer> result5 = solution.spiralOrder(matrix5);
        System.out.println("测试用例5:");
        System.out.println("输入矩阵:");
        printMatrix(matrix5);
        System.out.println("螺旋遍历结果: " + result5);
        System.out.println("期望结果: [1, 2, 3, 4]");
        System.out.println("验证通过: " + result5.equals(Arrays.asList(1, 2, 3, 4)));
        System.out.println();
        
        // 测试用例6: 空矩阵
        int[][] matrix6 = {};
        List<Integer> result6 = solution.spiralOrder(matrix6);
        System.out.println("测试用例6:");
        System.out.println("输入矩阵: []");
        System.out.println("螺旋遍历结果: " + result6);
        System.out.println("期望结果: []");
        System.out.println("验证通过: " + result6.isEmpty());
        System.out.println();
    }
    
    private static void printMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            System.out.println("[]");
            return;
        }
        
        for (int[] row : matrix) {
            System.out.print("[");
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);
                if (j < row.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
