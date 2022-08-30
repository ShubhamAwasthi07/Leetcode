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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            
            while(size-- > 0){
                TreeNode temp = q.poll();
                level.add(temp.val);
                
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                
            }
            ans.add(level);
        }
        return ans;
    }
}