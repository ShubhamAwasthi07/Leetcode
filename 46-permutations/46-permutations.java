class Solution {
    
    public void backTrack(List<List<Integer>> ans , List<Integer> temp , int[] nums){
        
        if(temp.size() == nums.length){
            ans.add(new ArrayList(temp));
        }
        
        else{
                for(int i = 0 ; i < nums.length ; i++){
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                backTrack(ans , temp , nums);
                temp.remove(temp.size() - 1);
               }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> ans = new ArrayList<>();
        backTrack(ans , new ArrayList<>() , nums);
        return ans;
        
    }
}