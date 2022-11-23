class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        
        for(int i = 0 ; i < n ; i++){
            sum = sum + nums[i];
        }
        int rightSum = 0;
        int leftSum = 0;
        rightSum = sum;
        
        for(int i = 0 ; i < n ; i++){
            leftSum += nums[i];
            
            if(leftSum == rightSum)
                return i;
            
            rightSum -= nums[i];
        }
        return -1;
    }
}