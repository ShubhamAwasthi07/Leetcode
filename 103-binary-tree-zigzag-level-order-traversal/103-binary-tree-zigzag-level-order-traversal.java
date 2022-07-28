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
        Stack<TreeNode> curr = new Stack();
        Stack<TreeNode> next = new Stack();
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        curr.push(root);
        boolean leftToright = true;
        while(curr.empty() == false){
            List<Integer> v = new ArrayList<>();
            
            while(curr.empty() == false){
                TreeNode temp = curr.pop();
                v.add(temp.val);
                
                if(leftToright){
                    if(temp.left != null) next.push(temp.left);
                    if(temp.right != null) next.push(temp.right);
                }else{
                    if(temp.right != null) next.push(temp.right);
                    if(temp.left != null) next.push(temp.left);
                }
            }
            
            Stack<TreeNode> tempStack = curr;
            curr = next;
            next = tempStack;
            
            leftToright = !leftToright;
            ans.add(v);
        }
        
        return ans;
    }
}