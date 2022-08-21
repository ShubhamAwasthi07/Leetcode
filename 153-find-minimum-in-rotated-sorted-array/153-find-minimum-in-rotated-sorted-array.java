class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        
        if(n == 1){
            return nums[0];
        }
        if(nums[start] < nums[end]) return nums[start];
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(start < end && nums[mid] > nums[mid + 1])
                return nums[mid+1];
            
            else if(start < mid && nums[mid] < nums[mid - 1])
                return nums[mid];
            
            else if(nums[end] > nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }  
            
        }
        return 0;
    }
}