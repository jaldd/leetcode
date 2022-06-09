package tree.binary;

import tree.q1.qtraversal.TreeNode;

import java.util.List;

public class Tree {

    public TreeNode buildBinaryTree(List<Integer> values) {

        TreeNode root = new TreeNode(values.get(0));
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) == null) continue;
            insert(root, values.get(i));
        }
        return root;
    }

    public void insert(TreeNode root, Integer value) {

        TreeNode node = new TreeNode(value);
        TreeNode temp = root;
        while (true) {
            TreeNode parent = temp;
            if (temp.val < value) {
                temp = parent.right;
                if (temp == null) {
                    parent.setRight(node);
                    return;
                }
            } else {
                temp = parent.left;
                if (temp == null) {
                    parent.setLeft(node);
                    return;
                }
            }
        }
    }
}
