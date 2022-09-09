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
    
    public int findMin(TreeNode root){
        if(root.left == null) return root.val;
        
        return findMin(root.left);
    }
    public TreeNode deleteNode(TreeNode root, int val) {
        
        if(root == null) return root;
        
        else if(root.val == val){
            
            // case 1
            if(root.left == null && root.right == null)
                return null;
            
            // case 2
            if(root.left == null || root.right == null){
                
                if(root.left == null)
                    return root.right;
                
                return root.left;
            }
            
            // Case 3
            
            else{
                int inorderSucc = findMin(root.right);
                root.val = inorderSucc;
                root.right = deleteNode(root.right , inorderSucc);
            }  
            
        }
        else if(root.val > val) root.left = deleteNode(root.left , val);
        else root.right = deleteNode(root.right , val);
        
        return root;
    }
}