class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;
        int[] output = new int[n];
        Arrays.fill(output , -1);
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i < 2 * n ; i++){
            
            int idx = i % n;
            while(!st.isEmpty() && nums[idx] > nums[st.peek()]){
                output[st.peek()] = nums[idx];
                st.pop();
            }
            st.push(idx);
        }
        
        /*
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                output[st.peek()] = nums[i];
                st.pop();
            }
            st.push(i);
        }
        */
        return output;
    }
}