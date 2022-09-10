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
    public int depth(TreeNode root){
        if(root == null) 
            return 0;
        
        int left = depth(root.left);
        int right = depth(root.right);
        
        return 1 + Math.max(left , right);
    }
    public boolean isBalanced(TreeNode root) {
        
        if(root == null) return true;
        int leftHeight = depth(root.left);
        int rightHeight = depth(root.right);
        
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        
        return (left & right);
    }
}