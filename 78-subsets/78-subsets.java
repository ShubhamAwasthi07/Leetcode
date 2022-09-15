class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    public void backTrack(int[] nums , int start , List<Integer> temp){
       if(start == nums.length){
           ans.add(new ArrayList<>(temp));
           return;
       }
        temp.add(nums[start]);
        backTrack(nums , start + 1 , temp);
        temp.remove(temp.size() - 1);
        backTrack(nums , start + 1 , temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
     List<Integer> curr = new ArrayList<>();
        backTrack(nums , 0 , curr);
        return ans;
    }
}