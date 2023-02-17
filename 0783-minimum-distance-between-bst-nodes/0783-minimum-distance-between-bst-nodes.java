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
    
    public void preorder(TreeNode root , List<Integer> ans){
        if(root == null)
            return;
        preorder(root.left , ans);
        ans.add(root.val);
        // preorder(root.left , ans);
        preorder(root.right , ans);
    }
    public int minDiffInBST(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root , ans);
        
        int res = Integer.MAX_VALUE;
        for(int i = 1 ;i < ans.size() ; i++){
            res = Math.min(res , ans.get(i) - ans.get(i-1));
        }
        return res;
    }
}