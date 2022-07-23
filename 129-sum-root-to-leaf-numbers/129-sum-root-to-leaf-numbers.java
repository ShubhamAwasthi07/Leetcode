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
    public void paths(TreeNode root , String s , List<String> ans){
        if(root == null) return ;
        if(root.left == null && root.right == null){
            String t = s + String.valueOf(root.val);
            ans.add(t);
            return;
        }
        String t = s + String.valueOf(root.val);
        paths(root.left , t , ans);
        paths(root.right , t , ans);
    }
    public int sumNumbers(TreeNode root) {
        List<String> ans = new ArrayList<>();
        paths(root , "" , ans);
        
        int sum = 0;
        int n = ans.size();
        for(int i = 0; i < n ; i++){
            sum = sum + Integer.parseInt(ans.get(i));
        }
        return sum;
    }
}