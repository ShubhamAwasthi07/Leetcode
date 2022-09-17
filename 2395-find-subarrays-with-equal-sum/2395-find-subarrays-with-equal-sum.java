class Solution {
   public boolean findSubarrays(int[] nums) {
       
        Set<Integer> store = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (!store.add(nums[i] + nums[i + 1])) {
                return true;
            }
        }
        return false;
    }
}