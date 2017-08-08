package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/8.
 */
public class LeetCode104 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public int maxDepth(TreeNode root) {

        if (root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
