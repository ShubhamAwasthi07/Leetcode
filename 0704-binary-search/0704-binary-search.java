class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(nums[mid] == target)
                return mid;
            
            else if(nums[mid] < target)
                start++;
            else
                end--;
        }
        
        return -1;
    }
}