class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        
        for(int i = 0; i < n ; i++){
            sum = sum + nums[i];
            
            ans = Math.max(sum , ans);
            
            if(sum < 0)
                sum = 0;
        }
        return ans;
    }
}