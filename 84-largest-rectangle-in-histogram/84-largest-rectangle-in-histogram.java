class Solution {
    // Next Smaller On next
    
    private static int[] get_NSOL(int[] nums){
        int n = nums.length;
        int[] output = new int[n];
        Arrays.fill(output , -1);
        Stack<Integer> st = new Stack<>();
        
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.empty() && nums[i] < nums[st.peek()] ){
                output[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        return output;
    }
    
    private static int[] get_NSOR(int[] nums){
        int n = nums.length;
        int[] output = new int[n];
        Arrays.fill(output , n);
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i < n ; i++){
            while(!st.empty() && nums[i] < nums[st.peek()]){
                output[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        return output;
    }
    public int largestRectangleArea(int[] heights) {
        int nsol[] = get_NSOL(heights);
        int nsor[] = get_NSOR(heights);
        int n = heights.length;
        
        int maxArea = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n ; i++){
            maxArea = Math.max(maxArea , heights[i] * (nsor[i] - nsol[i] - 1));
        }
        return maxArea;
    }
}