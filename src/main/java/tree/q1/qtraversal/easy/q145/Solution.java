package tree.q1.qtraversal.easy.q145;

import tree.q1.qtraversal.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }

    private void postorder(TreeNode root, List<Integer> res) {

        if (root == null) {
            return;
        }

        postorder(root.getLeft(), res);
        postorder(root.getRight(), res);
        res.add(root.getVal());
    }
}