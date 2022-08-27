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
    public void path(TreeNode root , String s , List<String> ans){
        
        if(root == null) return;
        if(root.left == null && root.right == null){
            String t = s + String.valueOf(root.val);
            ans.add(t);
            return;
        }
        String t = s + String.valueOf(root.val) + "->";
        path(root.left , t , ans);
        path(root.right , t , ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        path(root ,"",ans);
        return ans;
        
        
    }
}