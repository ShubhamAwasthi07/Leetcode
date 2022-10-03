class StockSpanner {

   private int idx;
   private Stack<int[]> st;
    public StockSpanner() {
        
        idx = -1;
        st = new Stack<>();
    }
    
    public int next(int price) {
       
        while(!st.isEmpty() && price >= st.peek()[0])
            st.pop();
        
        idx++;
        int ans;
        if(st.isEmpty())
            ans = idx + 1;  
        else 
            ans = idx - st.peek()[1];
        
        st.push(new int[]{price , idx});
        
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */