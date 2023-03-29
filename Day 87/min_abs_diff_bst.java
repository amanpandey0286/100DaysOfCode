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
    
    int prev = Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {
        int[] ans = new int[1];
        ans[0] = Integer.MAX_VALUE;
        inorderTraversal(root,ans);
        return ans[0];
    }
    
    public void inorderTraversal(TreeNode root, int[] ans){
        if(root == null)
            return;
        inorderTraversal(root.left,ans);
        ans[0] = Math.min(ans[0],Math.abs(root.val-prev));
        prev = root.val;
        inorderTraversal(root.right,ans);
    }
    
}


//https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
