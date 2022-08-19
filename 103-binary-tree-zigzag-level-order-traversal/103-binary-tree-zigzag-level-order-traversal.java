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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        
        s1.push(root);
        
        while(!s1.empty() || !s2.empty()){
            
            List<Integer> level = new ArrayList<>();
            while(!s1.empty()){
                
                TreeNode temp = s1.pop();
                if(temp.left != null) s2.push(temp.left);
                if(temp.right != null) s2.push(temp.right);
                
                level.add(temp.val);
            }
            ans.add(level);
            level = new ArrayList<>();
             while(!s2.empty()){
                
                TreeNode temp = s2.pop();
                 if(temp.right != null) s1.push(temp.right);
                 if(temp.left != null) s1.push(temp.left);
                
                level.add(temp.val);
            }
            if(!level.isEmpty()) ans.add(level);
        }
        return ans;
    }
}