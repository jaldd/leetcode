package array.q8.qyhtriangle.q118.solution1;

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
        List<List<Integer>> real = solution.generate(5);
        for (int i = 0; i < real.size(); i++) {
            List<Integer> list = real.get(i);
            for (int j = 0; j < list.size(); j++) {
                Assert.assertEquals((long) list.get(j), res[i][j]);
            }
        }
    }

    private void two() {
        int[][] res = new int[][]{new int[]{1}};
        Solution solution = new Solution();
        List<List<Integer>> real = solution.generate(1);
        for (int i = 0; i < real.size(); i++) {
            List<Integer> list = real.get(i);
            for (int j = 0; j < list.size(); j++) {
                Assert.assertEquals((long) list.get(j), res[i][j]);
            }
        }
    }

}
