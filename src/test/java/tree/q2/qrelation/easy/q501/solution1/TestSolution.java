package tree.q2.qrelation.easy.q501.solution1;

import org.junit.Assert;
import org.junit.Test;
import tree.binary.Tree;
import tree.q1.qtraversal.TreeNode;

import java.util.Arrays;
import java.util.Collections;


/**
 * 输入：root = [1,null,2,2]
 * 输出：[2]
 * <p>
 * 输入：root = [0]
 * 输出：[0]
 */
public class TestSolution {

    @Test
    public void testStr() {

        Tree tree = new Tree();
        TreeNode root = tree.buildBinaryTree(Arrays.asList(1, null, 2, 2));
        Solution solution = new Solution();
        int[] res = solution.findMode(root);
        Assert.assertEquals(res.length, 1);
        Assert.assertEquals(res[0], 2);

        root = tree.buildBinaryTree(Collections.singletonList(0));
        solution = new Solution();
        res = solution.findMode(root);
        Assert.assertEquals(res.length, 1);
        Assert.assertEquals(res[0], 0);


    }
}

