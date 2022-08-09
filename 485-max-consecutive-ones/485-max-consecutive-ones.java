class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int ans = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 1){
                ans++;
                max = Math.max(max , ans);
            }else{
                ans = 0;
            }
        }
        return max;
    }
}