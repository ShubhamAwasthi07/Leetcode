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
        if(root.left == null)
            return root.val;
        
        return findMin(root.left);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root == null)
            return root;
        
        else if(root.val == key){
            
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }
            
            //case 2 
            else if(root.left == null || root.right == null){
                
                if(root.left == null)
                    return root.right;
                
                else
                    return root.left;
            }
            //case 3
            int inorder_succ = findMin(root.right);
            root.val = inorder_succ;
            root.right = deleteNode(root.right , inorder_succ);
            
        } 
        
    
        else if(root.val > key)
             root.left = deleteNode(root.left , key);
        else
           root.right =  deleteNode(root.right , key);
        
        return root;
    }
}