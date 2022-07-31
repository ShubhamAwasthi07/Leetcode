class Solution {
    public int minimumOperations(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int previous = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0 || nums[i] == previous) continue;
            
            previous = nums[i];
            result++;
            if(nums[i] == max) break;
        }
        
        return result;
    }
}