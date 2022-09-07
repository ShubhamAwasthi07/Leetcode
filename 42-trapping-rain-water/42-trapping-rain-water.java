class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        
        leftmax[0] = 0;
        for(int i = 1 ; i < n ; i++){
            leftmax[i] = Math.max(leftmax[i - 1] , height[i-1]);
        }
        int ans = 0;
        rightmax[n - 1] = 0;
        
        for(int i = n - 2 ; i >= 0 ; i--){
            rightmax[i] = Math.max(rightmax[i+1] , height[i+1]);
            
            int water = Math.min(leftmax[i] , rightmax[i]) - height[i];
            
            if(water > 0)
                ans += water;
        }
        return ans;
    }
}