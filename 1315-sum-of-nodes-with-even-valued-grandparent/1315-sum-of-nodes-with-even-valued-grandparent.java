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
    int sum = 0;
    
    public void grandParent(TreeNode root , TreeNode parent , TreeNode gp){
        
        if (root ==  null)
            return ;
        if(gp != null) {
            
            if(gp.val % 2 == 0){
               sum += root.val;
            }
        }
       
        
        grandParent(root.left , root , parent);
        grandParent(root.right , root , parent);
        
    }
    public int sumEvenGrandparent(TreeNode root) {
        
        if(root == null)
            return 0;
        grandParent(root , null , null);
        
        return sum;
    }
}