package tree.q1.qtraversal.middle.q102.solution2;

import tree.q1.qtraversal.TreeNode;

import java.util.*;

public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }
        dfs(res, root, 0);

        return res;
    }

    private void dfs(List<List<Integer>> res, TreeNode root, int level) {

        if (res.size() == level) res.add(new ArrayList<>());

        List<Integer> levelList = res.get(level);
        levelList.add(root.getVal());
        if (Objects.nonNull(root.getLeft())) dfs(res, root.getLeft(), level + 1);
        if (Objects.nonNull(root.getRight())) dfs(res, root.getRight(), level + 1);
    }

}