class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();
    public void backTrack(int[] nums , int target , int start , List<Integer> temp){
        
        if(target < 0)
            return;
       else if(target == 0){
            ans.add(new ArrayList<>(temp));
        }
      else{
            for(int i = start ; i < nums.length ; i++){
                if(i > start && nums[i] == nums[i-1]) continue;
                temp.add(nums[i]);
                backTrack(nums , target - nums[i] , i+1 , temp);
                temp.remove(temp.size() - 1);
           }
     }
}
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates , target , 0 , new ArrayList<>());
        return ans;
    }
}