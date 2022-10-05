class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        Arrays.fill(ans , 0);
        
        for(int i = 0 ; i < n ; i++){
            
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                ans[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        return ans;
        
    }
}