class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;  // length of the array
        
        int left = 0;
        int right = n - 1;
        int idx = n - 1;
        int[] ans = new int[n];
        
        while(left <= right){
            
            if(nums[left] * nums[left] > nums[right]*nums[right]){
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