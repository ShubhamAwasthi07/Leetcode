class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int n = nums.length;
        int i = 0;
        int j = 0;
        int ans = Integer.MIN_VALUE;
        int countZero = 0;
        
        while(j < n){
            if(nums[j] == 0){
                countZero++;
            }
            
            while(countZero > k){
                if(nums[i] == 0){
                    countZero--;
                }
                i++;
            }
            ans = Math.max(ans , j - i + 1);
            j++;
        }
        return ans;
    }
}