class Solution {
    public void backTrack(List<List<Integer>> ans , List<Integer> temp , int[] nums , int target , int start , int k){
        
        if(target < 0)
            return;
        
        if(target == 0 && temp.size() == k){
            ans.add(new ArrayList(temp));
        }
        
        for(int i = start ; i < nums.length ; i++){
            temp.add(nums[i]);
            
            backTrack(ans , temp , nums , target - nums[i] , i + 1 , k);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = new int[9];
        for(int i = 1 ; i <= 9 ; i++){
            nums[i-1] = i;
        }
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(ans , new ArrayList<>() , nums , n , 0 , k);
        return ans;
    }
}