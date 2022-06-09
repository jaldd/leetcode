package tree.q2.qrelation.easy.q235.solution1;

import org.junit.Assert;
import org.junit.Test;
import tree.binary.Tree;
import tree.q1.qtraversal.TreeNode;

import java.util.Arrays;

public class TestSolution {

    @Test
    public void testStr() {

        Tree tree = new Tree();
        TreeNode root = tree.buildBinaryTree(Arrays.asList(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5));
        Solution solution = new Solution();
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        TreeNode node = solution.lowestCommonAncestor(root, p, q);
        Assert.assertEquals(node.val, 6);

        TreeNode p1 = new TreeNode(2);
        TreeNode q1 = new TreeNode(4);
        node = solution.lowestCommonAncestor(root, p1, q1);
        Assert.assertEquals(node.val, 2);

    }
}

//          6
//   2            8
//0    4         7  9
//    3  5
