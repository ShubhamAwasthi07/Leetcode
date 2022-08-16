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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left ==  null) {
            int right = minDepth(root.right);
            return 1 + right;
        } if(root.right ==  null) {
            int left = minDepth(root.left);
            return 1 + left;
        }
       int left = minDepth(root.left);
       int right = minDepth(root.right);
       return 1 + Math.min(left , right);
    }
}