package tree.q2.qrelation.easy.q501.solution1;

import tree.q1.qtraversal.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> res = new ArrayList<>();
    int base, count, maxCount;

    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

    public void dfs(TreeNode o) {

        if (o == null) {
            return;
        }
        dfs(o.left);
        update(o);
        dfs(o.right);
    }

    public void update(TreeNode o) {

        if (base == o.val) {
            count++;
        } else {
            base = o.val;
            count = 1;
        }
        if (count == maxCount) {
            res.add(o.val);
        }
        if (count > maxCount) {
            res.clear();
            res.add(o.val);
            maxCount = count;
        }


    }
}