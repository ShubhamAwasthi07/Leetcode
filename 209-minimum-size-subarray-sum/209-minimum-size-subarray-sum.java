class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while(right < n){
            sum += nums[right];
            
            if(sum >= target){
                while(sum >= target){
                    sum -= nums[left];
                    left++;
                }
                ans = Math.min(ans , (right - left + 2));
            }
            
            right++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}