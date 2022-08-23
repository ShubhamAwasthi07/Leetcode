class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = n;
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(nums[mid] == target) return mid;
            
            else if(target < nums[mid]){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}