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
    public void countNode(TreeNode root  , ArrayList<Integer>ans){
        // ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return;
        ans.add(root.val);
        countNode(root.left,ans);
        countNode(root.right,ans);
        // return ans;
        
    }
    public int countNodes(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        countNode(root,ans);
        int a = ans.size();
        return a;
    }
}