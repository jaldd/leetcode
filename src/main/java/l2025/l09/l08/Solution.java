package l2025.l09.l08;

public class Solution {

    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int cur = 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                matrix[top][i] = cur++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = cur++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = cur++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = cur++;
                }
                left++;
            }
        }

        return matrix;
    }

}
