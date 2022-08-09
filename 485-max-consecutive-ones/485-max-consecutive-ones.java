class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        
        int i = 0 , j = 0;
        for(j = 0 ; j < n ; j++){
            if(nums[j] == 0){
                
                max = Math.max(max , j - i);
                i = j + 1;
            }
            
        }
        max = Math.max(max ,j - i);
        return max;
    }
}