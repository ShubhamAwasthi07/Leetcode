class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> set = new HashSet();
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] - nums[j] == k) set.add(nums[i]);
            }
        }
        return set.size();
    }
}