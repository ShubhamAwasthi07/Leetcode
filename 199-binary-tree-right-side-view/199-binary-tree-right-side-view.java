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
    int maxLevel = 0;
    public void rightSide(TreeNode root , int level , List<Integer> ans){
        
        if(root == null) return;
        if(level > maxLevel){
            ans.add(root.val);
            maxLevel = level;
        }
        rightSide(root.right , level + 1 , ans);
        rightSide(root.left , level + 1 , ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightSide(root , 1 , ans);
        return ans;
        
    }
}