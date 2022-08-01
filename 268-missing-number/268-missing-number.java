class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int arrsum = 0;
        for(int i = 0 ; i <= n ; i++){
            sum = sum + i;
        }
        
        for(int i = 0 ; i < n ; i++){
            arrsum = arrsum + nums[i];
        }
        int diff = sum - arrsum;
        return diff;
    }
}