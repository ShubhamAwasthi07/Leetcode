class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int n = nums.length;
        int i = 0;
        int ans = 0;
        
        for(int j = 0 ; j < n ; j++){
            if(nums[j] == 0){
                k--;
            }
            
            if(k >= 0){
                ans = Math.max(ans , j - i + 1);
                
            }
            else{
                while(k < 0){
                    if(nums[i] == 0){
                        k++;
                    }
                    i++;
                }
            }
        }
        return ans;
    }
}