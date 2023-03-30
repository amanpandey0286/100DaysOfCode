/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean isEquivalent(TreeNode left, TreeNode right) {
        if (left==null || right==null) return left == right;
        else return left.val == right.val && isEquivalent(left.left, right.right) && isEquivalent(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return isEquivalent(root.left, root.right);
    }
}

//https://leetcode.com/problems/symmetric-tree/description/
