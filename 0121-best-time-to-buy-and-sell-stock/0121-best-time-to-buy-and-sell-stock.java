class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n ; i++){
            mini = Math.min(prices[i] , mini);
            int profit = prices[i] - mini;
            
            maxi = Math.max(maxi , profit);
        }
        return maxi;
    }
}