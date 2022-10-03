class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;
        int[] output = new int[n];
        Arrays.fill(output , -1);
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                output[st.peek()] = nums[i];
                st.pop();
            }
            st.push(i);
        }
        
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                output[st.peek()] = nums[i];
                st.pop();
            }
            st.push(i);
        }
        return output;
    }
}