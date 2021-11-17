package tree.q1.qtraversal.easy.q144;

import tree.q1.qtraversal.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(TreeNode root, List<Integer> res) {

        if (root == null) {
            return;
        }

        res.add(root.getVal());
        preorder(root.getLeft(), res);
        preorder(root.getRight(), res);
    }
}