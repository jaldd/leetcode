package tree.q1.qtraversal.middle.q105.solution1;

import tree.q1.qtraversal.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return myBuildTree(preorder, inorder, map, 0, length - 1, 0, length - 1);
    }

    private TreeNode myBuildTree(int[] preorder,
                                      int[] inorder,
                                      Map<Integer, Integer> map,
                                      int preleft,
                                      int preright,
                                      int inleft,
                                      int inright) {

        if (preleft > preright) return null;
        int root = preorder[preleft];
        int inroot = map.get(preorder[preleft]);
        int index = inroot - inleft;

        TreeNode left = myBuildTree(preorder, inorder, map, preleft + 1, preleft + index, inleft, inroot - 1);
        TreeNode right = myBuildTree(preorder, inorder, map, preleft + index + 1, preright, inroot + 1, inright);
        TreeNode rootNode = new TreeNode(root);
        rootNode.setLeft(left);
        rootNode.setRight(right);
        return rootNode;
    }


}