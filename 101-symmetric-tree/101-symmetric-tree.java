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
    public boolean isSame(TreeNode p , TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        
        if(p.val != q.val){
            return false;
        }
        boolean res = isSame(p.left , q.right);
        if(!res) return false;
        
        res = isSame(p.right , q.left);
        return res;
    }
    public boolean isSymmetric(TreeNode root) {
        
        return (isSame(root.left , root.right));
    }
}