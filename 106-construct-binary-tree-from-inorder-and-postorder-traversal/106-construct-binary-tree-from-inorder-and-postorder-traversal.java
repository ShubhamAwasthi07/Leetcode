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
    
    public TreeNode solve(int[] inorder , int[] postorder , int start , int end){
        
        int pos = -1;
        if(start > end) return null;
        for(int i = start ; i <= end ; i++){
            if(postorder[idx] == inorder[i]){
                pos = i;
                break;
            }
        }
        TreeNode root = new TreeNode(postorder[idx]);
        idx--;
        root.right = solve(inorder , postorder , pos + 1 , end);
        root.left = solve(inorder , postorder , start , pos - 1);
        
        return root;
        
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        this.idx = n - 1;
        
        return solve(inorder , postorder , 0 , n  - 1);
    }
}