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
    TreeNode arr = new TreeNode(0, null, null);
    TreeNode pointer = arr;
    public TreeNode increasingBST(TreeNode root) {
        func(root);
        return arr.right;
    }
    void func (TreeNode root) {
        if (root==null) return;
        func(root.left);
        TreeNode temp = new TreeNode (root.val, null, null);
        pointer.right = temp;
        pointer = pointer.right;
        func(root.right);
    }
}

//https://leetcode.com/problems/increasing-order-search-tree/description/
