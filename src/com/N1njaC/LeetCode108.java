package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/11.
 */
public class LeetCode108 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null) return null;

        return buildTree(nums, 0, nums.length - 1);

    }

    public TreeNode buildTree(int[] nums, int start, int end) {
        if (start > end) return null;

        TreeNode root = new TreeNode(nums[(start + end) / 2]);
        root.left = buildTree(nums, start, (start + end) / 2 - 1);
        root.right = buildTree(nums, (start + end) / 2 + 1, end);
        return root;
    }

}
