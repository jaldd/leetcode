package tree.q2.qrelation.easy.q235.solution2;

import tree.q1.qtraversal.TreeNode;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode res = root;
        while (true) {
            if (res.val > p.val && res.val > q.val) {
                res = res.left;
            } else if (res.val < p.val && res.val < q.val) {
                res = res.right;
            }
            return res;
        }
    }
}