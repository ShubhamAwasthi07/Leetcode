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
    
    public void inorder(TreeNode root , List<Integer> ans){
        if(root == null)
            return ;
        
        inorder(root.left , ans);
        ans.add(root.val);
        inorder(root.right , ans);
    }
    public int[] findMode(TreeNode root) {
        
        Map<Integer , Integer> hm = new HashMap<>();
        
        if(root == null)
            return new int[]{0};
        List<Integer> arr = new ArrayList<>();
        inorder(root , arr);
 
        
        for(int i = 0 ; i < arr.size() ; i++){
            hm.put(arr.get(i) , hm.getOrDefault(arr.get(i) , 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
       int maxValue = (Collections.max(hm.values()));
        for(int val : hm.keySet()){
            if(hm.get(val) == maxValue){
                ans.add(val);
            }
        }
        int[] res = new int[ans.size()];
        for(int i = 0 ; i < ans.size() ; i++){
            res[i] = ans.get(i);
        }
       return res;
    }
}