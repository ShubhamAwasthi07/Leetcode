class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        
         Deque<Integer> dq = new ArrayDeque<>();
        // ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int[] ans  = new int[n - k + 1];
        int idx = 0;
        
        for(int i = 0 ; i < n ; i++){
            
            while(!dq.isEmpty() && i - dq.peekFirst() >= k){
                dq.removeFirst();
            }
            
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
                
            dq.offerLast(i);
            if(i >= k - 1) ans[idx++] = arr[dq.peekFirst()];
        }
        return ans;
    }
}