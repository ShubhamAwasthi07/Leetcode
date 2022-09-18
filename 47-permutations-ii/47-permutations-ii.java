class Solution {
    
    public void backTrack(List<List<Integer>> ans , List<Integer> temp , int[] nums , boolean[] used){
        
        if(temp.size() == nums.length && !ans.contains(temp)){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i = 0 ; i < nums.length ; i++){
            
            if(used[i]) continue;
            
            used[i] = true;
            temp.add(nums[i]);
            
            backTrack(ans , temp , nums , used);
            
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        backTrack(ans , new ArrayList<>() , nums , new boolean[nums.length]);
        return ans;
    }
}