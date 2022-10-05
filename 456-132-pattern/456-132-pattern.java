class Solution {
    public boolean find132pattern(int[] nums) {
        
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int x = Integer.MIN_VALUE;
        
        for(int i = n - 1 ; i >= 0 ; i--){
            int curr = nums[i];
            
            if(curr < x) return true;
            while(!st.isEmpty() && curr > st.peek())
                x = st.pop();
            
            st.push(curr);
        }
        return false;
    }
}