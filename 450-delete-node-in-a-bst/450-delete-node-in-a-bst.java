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
    
    private int findMin(TreeNode root){
        if(root.left == null)
            return root.val;
        
        return findMin(root.left);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root == null)
            return root;
        
        if(root.val == key){
            
            //case 1
            if(root.left == null && root.right == null)
                return null;
            
            else if(root.left == null || root.right == null){
                if(root.left == null)
                    return root.right;
                
                else
                    return root.left;
                
            }
            else{
                int inorder_succ = findMin(root.right);
                root.val = inorder_succ;
                root.right = deleteNode(root.right , inorder_succ);
            }
        }
        else if(root.val < key)
            root.right = deleteNode(root.right , key);
        else
            root.left = deleteNode(root.left , key);
        
        return root;
    }
    
}