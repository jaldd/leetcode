package tree.q1.qtraversal.middle.q102.solution1;

import org.junit.Assert;
import org.junit.Test;
import tree.q1.qtraversal.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        TreeNode l1 = new TreeNode(9);
        TreeNode r1 = new TreeNode(20);
        TreeNode l2 = new TreeNode(15);
        TreeNode r2 = new TreeNode(7);
        root.setLeft(l1);
        root.setRight(r1);
        r1.setLeft(l2);
        r1.setRight(r2);
        List<List<Integer>> res = solution.levelOrder(root);
        List<List<Integer>> realRes = new ArrayList<>();
        realRes.add(Arrays.asList(3));
        realRes.add(Arrays.asList(9, 20));
        realRes.add(Arrays.asList(15, 7));
        Assert.assertEquals(res.toString(), realRes.toString());
    }
}