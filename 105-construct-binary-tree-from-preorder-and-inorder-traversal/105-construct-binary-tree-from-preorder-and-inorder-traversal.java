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
    int idx = 0;
    public TreeNode solve(int[] preorder , int[] inorder , int start , int end){
        
        if(start > end) return null;
        int pos = -1;
        for(int i = start ; i <= end; i++){
            if(preorder[idx] == inorder[i]){
                pos = i;
                break;
            }
        }
        TreeNode root = new TreeNode(preorder[idx]);
        idx++;
        root.left = solve(preorder , inorder , start , pos-1);
        root.right = solve(preorder , inorder , pos + 1 , end);
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder){
        int n = preorder.length;
        return solve(preorder , inorder , 0 , n-1);
    }
}