class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n - 1;
        int ans = 0;
        while(start < end){
            int area = Math.min(height[start] , height[end]) * (end - start);
            ans = Math.max(area  , ans);
            
            if(height[start] <= height[end]) start++;
            
            else end--;
        }
        return ans;
    }
}