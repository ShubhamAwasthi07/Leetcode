class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int count = 1;
        int ans = 1;
        Arrays.sort(nums);
        if(n == 0) return 0;
        for(int i = 1 ; i < n ; i++){
            if(nums[i-1] + 1 == nums[i]){
                count++;
            }
            else if(nums[i-1] == nums[i])
                continue;
            else{
                ans = Math.max(ans , count);
                count = 1;
            }
        }
        ans = Math.max(ans , count);
        
        return ans;
    }
}