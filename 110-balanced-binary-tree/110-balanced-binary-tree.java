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
    public int height(TreeNode root){
        if(root == null) return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        return  1 + Math.max(lh , rh);
        
    }
    public boolean isBalanced(TreeNode root) {
        
        if(root == null) return true;
        
        int left_height = height(root.left);
        int right_height = height(root.right);

        
        if(Math.abs(left_height - right_height) > 1) return false;
        
         boolean left = isBalanced(root.left);
         boolean right = isBalanced(root.right);
            
        return (left && right);
        
    }
}