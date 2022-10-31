class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    public void backTrack(int[] nums , int target , int start , List<Integer> temp){
        
        if(target < 0)
            return ;
        
        if(target == 0){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i = start ; i < nums.length ; i++){
            temp.add(nums[i]);
            backTrack(nums , target - nums[i] , i  , temp);
            temp.remove(temp.size() - 1);
                                           
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates , target , 0 , new ArrayList<>());
        
        return ans;
    }
}