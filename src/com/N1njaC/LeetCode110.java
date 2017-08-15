package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/14.
 */
public class LeetCode110 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public boolean isBalanced(TreeNode root) {

        return maxDepth(root) != -1;
    }

    private int maxDepth(TreeNode root) {

        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}
