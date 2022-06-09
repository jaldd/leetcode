package tree.q2.qrelation.easy.q235.solution1;

import tree.q1.qtraversal.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> ph = getPath(root, p);
        List<TreeNode> qh = getPath(root, q);

        TreeNode res = new TreeNode(root.val);
        for (int i = 0; i < ph.size() && i < qh.size(); ++i) {
            if (ph.get(i) == qh.get(i)) {
                res = ph.get(i);
            } else {
                break;
            }
        }
        return res;
    }

    private List<TreeNode> getPath(TreeNode root, TreeNode node) {

        List<TreeNode> path = new ArrayList<>();
        TreeNode current = root;
        while (current.val != node.val) {
            path.add(current);
            if (current.val > node.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        path.add(current);
        return path;
    }
}