class Solution {
    public int search(int[] nums, int target) {
        int n  = nums.length;
        int start = 0;
        int end = n - 1;
        
        if(n == 1){
            if(nums[0] == target) return 0;
            return -1;
        }
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(nums[mid] == target) return mid;
            
           if(nums[end] <= nums[mid]){
               if(nums[start] <= target && target < nums[mid]){
                   end = mid - 1;
               }
               else start = mid + 1;
           }
             else{
                if(nums[mid] < target && target <= nums[end]) start = mid + 1;
                else  end = mid - 1;
                    
            }
        }
        return -1;
    }
}