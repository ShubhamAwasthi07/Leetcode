class Solution {
    List<List<Integer>> res = new ArrayList();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = new int[9];
        for (int i = 1; i <= 9; i++) arr[i - 1] = i;
        backTrack(arr, n, 0, new ArrayList(), k);
        return res;
    }
    
    public void backTrack(int[] candidates, int target, int rejected, ArrayList<Integer> list, int k) {
        if (target < 0) return;
        if (target == 0 && list.size() == k) {
            res.add(new ArrayList(list));
            return;
        }
        
        for (int i = rejected; i < candidates.length; i++) {
            list.add(candidates[i]);
            // chek if its taking me to a desired solution
            backTrack(candidates, target - candidates[i], i + 1, list, k);
            list.remove(list.size() - 1); // actual backtracking
        }
    }
}
