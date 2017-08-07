package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/7.
 */
public class LeetCode101 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }


    public boolean isSymmetric(TreeNode root) {

        if (root == null) return true;

        return isSymmetricTree(root.left, root.right);
    }

    public boolean isSymmetricTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSymmetricTree(p.left, q.right) && isSymmetricTree(p.right, q.left);
    }

    public static void main(String[] args) {

    }
}
