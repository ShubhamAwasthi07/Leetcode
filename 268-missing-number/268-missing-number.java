class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = n*(n+1);
        ans /= 2;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum = sum + nums[i];
        }
        return ans - sum;
    }
}