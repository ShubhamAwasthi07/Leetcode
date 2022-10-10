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
    
    public boolean twoSum(TreeNode root , Set<Integer> set , int k){
        
        if(root == null)
            return false;
        
        if(set.contains(k - root.val))
            return true;
        
        else
            set.add(root.val);
            
        boolean left = twoSum(root.left , set , k);
        boolean right = twoSum(root.right , set , k);

        return (left || right);
        
    }
    public boolean findTarget(TreeNode root, int k) {
        
        Set<Integer> set = new HashSet<>();
        boolean ans =  twoSum(root , set , k);
        return ans;  
        
    }
}