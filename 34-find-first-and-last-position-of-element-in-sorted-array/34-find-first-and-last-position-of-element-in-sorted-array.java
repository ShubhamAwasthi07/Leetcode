class Solution {
    int firstOccurance(int[] nums , int target){
         // Code for finding the last index
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(target == nums[mid]){
                ans = mid;
                end = mid - 1;
            }
           else if(target < nums[mid]){
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return ans;
    }
    int lastOccurance(int[] nums , int target){
        
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(target == nums[mid]) {
                ans = mid;
                start = mid + 1;
            }
           else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = firstOccurance(nums , target);
        if(res[0] == -1) return new int[] {-1 , -1};
        res[1] = lastOccurance(nums , target);
        return res;
       
    }
}