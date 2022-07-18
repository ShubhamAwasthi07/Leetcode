class StockSpanner {

    private int curr_idx;
    private Stack<int[]> st;
    
    public StockSpanner() {
        curr_idx = -1;
        st = new Stack<>();
    }
    
    public int next(int price) {
        while(!st.empty() && price >= st.peek()[0]){
            st.pop();
        }
        curr_idx++;
        int ans;
        if(st.empty()) ans = curr_idx + 1;
        else  ans = curr_idx-st.peek()[1];
        
        st.push(new int[] {price , curr_idx});
        
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */