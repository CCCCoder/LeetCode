package com.N1njaC;

import java.util.*;

/**
 * Created by N1njaC on 2017/8/9.
 */
public class LeetCode107 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.offer(root);
        while (!treeNodeQueue.isEmpty()) {
            int size = treeNodeQueue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode head = treeNodeQueue.poll();
                if (head.left != null) {
                    treeNodeQueue.offer(head.left);
                }
                if (head.right != null) {
                    treeNodeQueue.offer(head.right);
                }
                level.add(head.val);
            }
            result.add(level);
        }
        Collections.reverse(result);
        return result;
    }
}
