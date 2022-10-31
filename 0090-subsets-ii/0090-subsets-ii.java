class Solution {
    public void backTrack(HashSet<List<Integer>> ans , List<Integer> temp , int[] nums , int start){
        
        ans.add(new ArrayList(temp));
        for(int i = start ; i < nums.length ; i++){
            temp.add(nums[i]);
            backTrack(ans , temp , nums , i + 1);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        HashSet<List<Integer>> ans = new HashSet();
        Arrays.sort(nums);
        backTrack(ans , new ArrayList<>() , nums , 0);
        return new ArrayList<>(ans);
    }
}