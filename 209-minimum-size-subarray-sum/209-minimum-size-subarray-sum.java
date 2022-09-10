class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int length = Integer.MAX_VALUE;
        
        int start = 0;
        int end = 0;
        int sum = 0;
        for(end = 0 ; end < n ; end++){
            sum = sum + nums[end];
            
            while(sum >= target){
                length = Math.min(length , end - start + 1);
                
                sum -= nums[start];
                start++;
            }
            
        }
        if(length == Integer.MAX_VALUE){
            return 0;
        }
        return length;
        
    }
}