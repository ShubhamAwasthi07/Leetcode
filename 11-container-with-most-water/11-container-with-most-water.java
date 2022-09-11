class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int ans = 0;
        int start = 0;
        int end = height.length - 1;
        
        for(int i = 0 ; i < n ; i++){
            int area = Math.min(height[start] , height[end]) * (end - start);
            ans = Math.max(ans , area);
            
            if(height[start] <= height[end]){
                start++;
            }
            else
                end--;
        }
        return ans;
    }
}