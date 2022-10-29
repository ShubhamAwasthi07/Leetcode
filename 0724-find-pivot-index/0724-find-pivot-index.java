class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int rightsum = 0;
        int leftsum = 0;
        
        for(int i = 0 ; i < n ; i++){
            sum = sum + nums[i];
        }
        rightsum = sum;
        leftsum = 0;
        
        for(int i = 0 ; i < n ; i++){
            leftsum += nums[i];
            
            if(leftsum == rightsum)
                return i;
            
            rightsum -= nums[i];
        }
        return -1;
    }
}