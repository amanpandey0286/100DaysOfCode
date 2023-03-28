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
    ArrayList<Integer> nums = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {

        if(root == null){
            return nums;
        }
         
         postorderTraversal(root.left);
         postorderTraversal(root.right);

         
         nums.add(root.val);

         return nums;


    }
}

//https://leetcode.com/problems/binary-tree-postorder-traversal/description/
