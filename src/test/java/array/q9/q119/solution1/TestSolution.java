package array.q9.q119.solution1;

import array.q8.qyhtriangle.q119.solution1.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestSolution {

    @Test
    public void testCanCompleteCircuit() {

        one();

        two();
    }

    private void one() {
        int[][] res = new int[][]{new int[]{1}, new int[]{1, 1}, new int[]{1, 2, 1}, new int[]{1, 3, 3, 1}, new int[]{1, 4, 6, 4, 1}};
        Solution solution = new Solution();
        List<Integer> real = solution.getRow(5);
        for (int i = 0; i < real.size(); i++) {
            Assert.assertEquals((long) real.get(i), res[4][i]);
        }
    }

    private void two() {
        int[][] res = new int[][]{new int[]{1}};
        Solution solution = new Solution();
        List<Integer> real = solution.getRow(1);
        for (int i = 0; i < real.size(); i++) {
            Assert.assertEquals((long) real.get(i), res[0][i]);
        }
    }

}
