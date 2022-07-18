class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;
        int[] output = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        Arrays.fill(output , -1);
        
        for(int i = 0 ; i < 2*n ; i++){
            int idx = i%n;
            
            while(!st.empty() && nums[idx] > nums[st.peek()]){
                output[st.peek()] = nums[idx];
                st.pop();
            }
            st.push(idx);  
        }
        return output;
    }
}