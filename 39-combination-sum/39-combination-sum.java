class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        backTrack(candidates , target , 0 , new ArrayList());
        return ans;
    }
    
    public void backTrack(int[] candidates , int target , int rejected , ArrayList<Integer> list){
        
        if(target < 0)
            return;
        
        if(target == 0){
            ans.add(new ArrayList(list));
            return ;
        }
        for(int i = rejected ; i < candidates.length ; i++){
            list.add(candidates[i]);
            // check if it is taking to me to a desired solution 
            backTrack(candidates , target - candidates[i] , i , list);
            
            list.remove(list.size() - 1);
        }
    }
}
