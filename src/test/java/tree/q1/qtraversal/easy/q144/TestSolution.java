package tree.q1.qtraversal.easy.q144;

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
        TreeNode root = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(3);
        root.setRight(r1);
        r1.setLeft(l2);
        List<Integer> res = solution.preorderTraversal(root);
        List<Integer> realRes = Arrays.asList(1, 2, 3);
        Assert.assertEquals(res.toString(), realRes.toString());
    }
}