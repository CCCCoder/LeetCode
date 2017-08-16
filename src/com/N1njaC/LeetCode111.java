package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/15.
 */
public class LeetCode111 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }
    public int minDepth(TreeNode root){

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left)

    }
}
