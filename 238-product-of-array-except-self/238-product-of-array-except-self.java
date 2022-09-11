class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int pro = 1;
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
            ans[i] = pro;
            pro = pro * nums[i];
        }
        pro = 1;
        
        for(int i = n - 1 ; i >= 0 ; i--){
            ans[i] = ans[i] * pro;
            pro = pro * nums[i];
        }
        return ans;
    }
}