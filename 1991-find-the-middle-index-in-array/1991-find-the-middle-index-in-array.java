class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int left_sum = 0;
        int right_sum = 0;
        int prefix_sum = 0;
        
        for(int i = 0; i < n ; i++){
            prefix_sum += nums[i];
        }
        
        right_sum = prefix_sum;
        for(int i = 0 ; i < n ; i++){
            left_sum += nums[i];
            
            if(left_sum == right_sum){
                return i;
            }
            right_sum -= nums[i];
        }
        return -1;
    }
}