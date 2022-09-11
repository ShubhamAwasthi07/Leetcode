class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        if(n == 0) return 0;
        int ans = 1;
        for(int i = 1 ; i < n ; i++){
            if(nums[i-1] + 1 == nums[i]){
                count++;
            }
            else if(nums[i] == nums[i-1])
                continue;
            
            else{
                ans = Math.max(ans , count);
                count = 1;
            }
            ans = Math.max(ans , count);
        }
        return ans;
    }
}

