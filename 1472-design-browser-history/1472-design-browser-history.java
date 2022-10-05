class BrowserHistory {

    Stack<String> forward;
    Stack<String> backward;
    public BrowserHistory(String homepage) {
        backward = new Stack<>();
        backward.push(homepage);
        forward = new Stack<>();
    }
    
    public void visit(String url) {
        backward.push(url);
        forward.clear();
    }
    
    public String back(int steps) {
        while(backward.size() > 1 && steps > 0){
            steps--;
            String x = backward.pop();
            forward.push(x);
        }
        return backward.peek();
    }
    
    public String forward(int steps) {
        while(!forward.isEmpty() && steps > 0){
            steps--;
            String x = forward.pop();
            backward.push(x);
        }
        return backward.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */