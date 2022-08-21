class Solution {
    public int maxProduct(int[] nums) {
         int ans = Integer.MIN_VALUE, p = 1;        
        for(int i=0; i<nums.length; i++){
            p *= nums[i];
            
            ans = Math.max(ans, p);
            if(p == 0) p = 1; // corner case
        }
        
        p = 1;
        for(int i=nums.length-1; i>=0; i--){
            p *= nums[i];
            
            ans = Math.max(ans, p);
            if(p == 0) p = 1;
        }
        
        return ans;
    }
}