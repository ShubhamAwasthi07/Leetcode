class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int sum = (n*(n+1)) / 2;
        int add = 0;
        for(int i = 0; i < n ; i++){
             add = add + nums[i];
        }
        int diff = sum - add;
        return diff;
    }
    
}