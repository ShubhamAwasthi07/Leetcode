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
    private TreeNode prev = new TreeNode(-1);
    
    public void preorder(TreeNode root){
        
        if(root == null) return ;
        
        TreeNode temp = root.right;
        
        prev.left = null;
        prev.right = root;
        prev = root;
        
        preorder(root.left);
        preorder(temp);
    }
    public void flatten(TreeNode root) {
        preorder(root);
    }
}