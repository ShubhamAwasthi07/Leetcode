class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        int idx = n - 1;
        
        int left = 0;
        int right = n - 1;
        
        while(left <= right){
            
            if(nums[left] * nums[left] > nums[right] * nums[right]){
                ans[idx] = nums[left] * nums[left];
                left++;
            } 
            else{
                ans[idx] = nums[right] * nums[right];
                right--;
            }
            idx--;
        }
        return ans;
    }
}