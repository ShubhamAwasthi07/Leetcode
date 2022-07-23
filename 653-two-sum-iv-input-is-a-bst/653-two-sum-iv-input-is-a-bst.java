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
    public boolean getTarget(TreeNode root , int target , Set<Integer>set){
        
        if(root == null) return false;
        
        if(set.contains(target - root.val)){
            return true;
        }
        else{
            set.add(root.val);
        }
        boolean left = getTarget(root.left , target , set);
        boolean right = getTarget(root.right , target , set);
        
        return left || right;
    }
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return getTarget(root , k , set);
        
    }
}