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
    public TreeNode merge(TreeNode t1 , TreeNode t2){
        if(t1 == null && t2 == null) 
            return t1;
        if(t1 == null && t2 != null) 
            return t2;
        if(t1 != null && t2 == null) 
            return t1;
        
        TreeNode sum = new TreeNode(t1.val + t2.val);
        sum.left = merge(t1.left , t2.left);
        sum.right = merge(t1.right , t2.right);
        return sum;
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1 , root2);
    }
}