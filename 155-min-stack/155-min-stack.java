class MinStack {
    
    Stack<Integer> st = new Stack<>();
    Stack<Integer>prefix_st = new Stack<>();
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(!prefix_st.empty()) prefix_st.push(Math.min(val , prefix_st.peek()));
            
        else  prefix_st.push(val);    
    }
    
    public void pop() {
        st.pop();
        prefix_st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return prefix_st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */