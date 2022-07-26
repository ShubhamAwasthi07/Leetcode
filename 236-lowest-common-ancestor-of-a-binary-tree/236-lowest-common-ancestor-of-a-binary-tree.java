/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public boolean findPath(TreeNode root , List<TreeNode>paths , TreeNode ele){
        if(root == null) return false;
        if(root == ele){
            paths.add(root);
            return true; 
        }
        boolean res = findPath(root.left , paths , ele);
        res = res || findPath(root.right , paths , ele);
        
        if(res == true) paths.add(root);
        return res;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode>path1 = new ArrayList<>();
        List<TreeNode>path2 = new ArrayList<>();
        
        findPath(root , path1 , p);
        findPath(root , path2 , q);
        
        int n = path1.size() -1;
        int m = path2.size() - 1;
        
        TreeNode lca = null;
        
        while(n >= 0 && m >= 0){
            if(path1.get(n) == path2.get(m)){
                lca = path1.get(n);
            }else{
                break;
            }
            n--;
            m--;
          
        }
          return lca;
    }
}