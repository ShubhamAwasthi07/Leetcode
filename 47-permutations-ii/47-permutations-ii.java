class Solution {
    
    public void backTrack(List<List<Integer>> ans , List<Integer> temp ,int[] nums , boolean[] used){
        if(temp.size() == nums.length && !ans.contains(temp)){
            ans.add(new ArrayList(temp));
            return;
        }
        
        for(int i = 0 ; i < nums.length ; i++){
            // skip if we get same element
            if(used[i]) continue;
            
            // Add the new element and mark it as used
            used[i] = true;
            temp.add(nums[i]);
            
            // go back to try other element 
            backTrack(ans , temp , nums , used);
            
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(ans , new ArrayList<>() , nums , new boolean[nums.length]);
        return ans;
    }
}