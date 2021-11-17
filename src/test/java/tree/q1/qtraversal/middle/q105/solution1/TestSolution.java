package tree.q1.qtraversal.middle.q105.solution1;

import org.junit.Assert;
import org.junit.Test;
import tree.q1.qtraversal.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSolution {

    @Test
    public void testStr() {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        Solution solution = new Solution();
        TreeNode root = solution.buildTree(preorder, inorder);
        List<Integer> output = Arrays.asList(3, 9, 20, 15, 7);

        List<Integer> outputList = new tree.q1.qtraversal.easy.q144.Solution().preorderTraversal(root);
//        System.out.println(outputList);
        Assert.assertEquals(output.toString(), outputList.toString());

    }
}