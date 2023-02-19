class MedianFinder {
    
    PriorityQueue<Integer> min;
    PriorityQueue<Integer>max;

    public MedianFinder() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void balance(){
        if(Math.abs(max.size() - min.size()) <= 1) return;
        else if(max.size() > min.size()) min.add(max.remove());
        else max.add(min.remove());
    }
    
    public void addNum(int num) {
        if(max.size() == 0) max.add(num);
        else if(max.peek() < num) min.add(num);
        else max.add(num);
        
        balance();
    }
    
    public double findMedian() {
        if(max.size() == min.size()) 
            return 1.0*(max.peek()+min.peek())/2.0;
        return max.size()>min.size()?1.0*max.peek():1.0*min.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */