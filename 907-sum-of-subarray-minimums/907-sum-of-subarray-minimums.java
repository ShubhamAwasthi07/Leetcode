class Solution {
    private int[] get_nsol(int[] nums){
        int n = nums.length;
        int[] output = new int[n];
        Arrays.fill(output , -1);
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0 ; i--){
            while(!st.empty() && nums[i] < nums[st.peek()]){ 
                output[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        return output;
    }
    
    private int[] get_nsor(int[] nums){
        int n = nums.length;
        int[] output = new int[n];
        Arrays.fill(output , n);
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i  < n ; i++){
            while(!st.empty() && nums[i] <= nums[st.peek()]){
                output[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        return output;
    }
    public int sumSubarrayMins(int[] arr) {
        int[] nsol = get_nsol(arr);
        int[] nsor = get_nsor(arr);
        int n = arr.length;
        long ans = 0;
        long m = 1000000007;
        for(int i = 0 ; i < n ; i++){
            long val = (long)arr[i] * (i - nsol[i]) * (nsor[i] - i); 
            ans = (ans % m + val % m) % m;
        }
        return (int)ans;
    }
}