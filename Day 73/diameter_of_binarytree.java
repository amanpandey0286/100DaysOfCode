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

    public int heightOfTree(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftLength = heightOfTree(root.left);
        int rightLength = heightOfTree(root.right);
        int currentLength =  Math.max(leftLength, rightLength)  + 1  ;

        return currentLength ;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        int diameterLeft = diameterOfBinaryTree(root.left);
        int diameterRight =  diameterOfBinaryTree(root.right);
        int diameter = heightOfTree(root.left) + heightOfTree(root.right)  ;

        return Math.max( diameter,Math.max(diameterLeft, diameterRight));
        
    }
}

//https://leetcode.com/problems/diameter-of-binary-tree/description/
