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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        // TreeNode temp;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;  i < size ; i++){
               TreeNode temp = q.poll();
                
                if(i == 0){
                    ans.add(temp.val);
                }
                if(temp.right != null) q.add(temp.right);
                if(temp.left != null) q.add(temp.left);
                
                
            }
            
        }
            
        return ans;
        
    }
}